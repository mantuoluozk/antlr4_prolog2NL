//转换函数
import com.antlr.out.prologBaseListener;
import com.antlr.out.prologParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class prolog2NL {
    public static class prologEmitter extends prologBaseListener {
        int com_list_term = 0;
        int list_term = 0;
        int binaryoperator=0;
        ParseTreeProperty<String> prolog = new ParseTreeProperty<String>();

        String getprolog(ParseTree ctx) {
            return prolog.get(ctx);
        }

        void setprolog(ParseTree ctx, String s) {
            prolog.put(ctx, s);
        }

        public void exitP_text(prologParser.P_textContext ctx) {
            StringBuilder buf = new StringBuilder();
            for (prologParser.ClauseContext pctx : ctx.clause()) {
                buf.append("\n");
                buf.append(getprolog(pctx));
                buf.append(";");
            }
            setprolog(ctx, buf.toString());
            System.out.println("exitP_text: " + buf.toString());
        }

        public void exitClause(prologParser.ClauseContext ctx) {
            setprolog(ctx, getprolog(ctx.getChild(0)));
            System.out.println("exitClause: " + getprolog(ctx.getChild(0)));
        }

        public void exitAtom_term(prologParser.Atom_termContext ctx) {
            setprolog(ctx, getprolog(ctx.atom()));
            System.out.println("exitAtom_term: " + getprolog(ctx.atom()));
        }

        public void exitTermlist(prologParser.TermlistContext ctx) {
            StringBuilder buf = new StringBuilder();
            for (prologParser.TermContext pctx : ctx.term()) {
                buf.append(getprolog(pctx));
            }
            setprolog(ctx, buf.toString());
            System.out.println("exitTermlist: " + buf.toString());
        }

        public void exitName(prologParser.NameContext ctx) {
            setprolog(ctx, ctx.LETTER_DIGIT().getText());
            System.out.println("exitName: " + ctx.LETTER_DIGIT().getText());

        }

        public void exitOperator(prologParser.OperatorContext ctx) {
            setprolog(ctx, ctx.getText());
            System.out.println("exitOperator: " + ctx.getText());
        }

        public void enterBinary_operator(prologParser.Binary_operatorContext ctx) {
            binaryoperator=1;
        }

        public void exitBinary_operator(prologParser.Binary_operatorContext ctx) {
            if(list_term==0) {
                if (getprolog(ctx.operator()).equals(",")) {
                    StringBuilder buf = new StringBuilder();
                    String buf1 = new String();
                    buf1 = getprolog(ctx.getChild(2));
                    for (prologParser.TermContext pctx : ctx.term()) {
                        buf.append(getprolog(pctx));
                        buf.append(" 且 ");
                    }
                    buf.deleteCharAt(buf.length() - 1);
                    buf.deleteCharAt(buf.length() - 1);
                    buf.deleteCharAt(buf.length() - 1);

                    if (buf1.contains("如果")) {
                        String tmp = "" + buf;
                        tmp = tmp.replaceAll("如果", "");
                        tmp = "如果 " + tmp;
                        StringBuilder ans = new StringBuilder(tmp);
                        buf = ans;
                    }

                    setprolog(ctx, buf.toString());
                    System.out.println("exitBinary_operator: " + buf.toString());

                } else if (getprolog(ctx.operator()).equals(":-")) {
                    StringBuilder buf = new StringBuilder();
                    buf.append("要想 ");
                    buf.append(getprolog(ctx.getChild(0)));
                    buf.append(" 就得 ");
                    buf.append(getprolog(ctx.getChild(2)));
                    setprolog(ctx, buf.toString());
                    System.out.println("exitBinary_operator: " + buf.toString());
                } else if ((getprolog(ctx.operator()).equals("-->"))||
                        (getprolog(ctx.operator()).equals("->"))) {
                    StringBuilder buf = new StringBuilder();
                    buf.append("如果 ");
                    buf.append(getprolog(ctx.getChild(0)));
                    buf.append(" 则有 ");
                    buf.append(getprolog(ctx.getChild(2)));
                    setprolog(ctx, buf.toString());
                    System.out.println("exitBinary_operator: " + buf.toString());
                } else {
                    String buf1 = new String();
                    buf1 = getprolog(ctx.getChild(2));

                    if (buf1.contains("如果")) {
                        StringBuilder buf = new StringBuilder();
                        buf.append("如果 ");
                        buf.append(getprolog(ctx.getChild(0)));
                        buf.append(getprolog(ctx.getChild(1)));
                        buf.append(buf1.substring(2, buf1.length()));
                        setprolog(ctx, buf.toString());
                        System.out.println("exitBinary_operator: " + buf.toString());
                    } else {
                        StringBuilder buf = new StringBuilder();
                        buf.append(getprolog(ctx.getChild(0)));
                        buf.append(getprolog(ctx.getChild(1)));
                        buf.append(getprolog(ctx.getChild(2)));
                        setprolog(ctx, buf.toString());
                        System.out.println("exitBinary_operator: " + buf.toString());
                    }
                }
            }
            else if(list_term==1){

                StringBuilder buf = new StringBuilder();
                buf.append(getprolog(ctx.term(0)));
                buf.append(getprolog(ctx.operator()));
                buf.append(getprolog(ctx.term(1)));
                setprolog(ctx,buf.toString());
            }

        }

        public void exitCompound_term(prologParser.Compound_termContext ctx) {
            if(com_list_term==0) {
                if (binaryoperator == 1) {
                    StringBuilder buf = new StringBuilder();
                    buf.append(getprolog(ctx.termlist()));
                    StringBuilder buf1 = new StringBuilder();
                    buf1.append(getprolog(ctx.atom()));
                    StringBuilder buf2 = new StringBuilder();
                    if (buf.indexOf("且") != -1) {
                        buf2.append(buf.substring(0, buf.indexOf("且")));
                        buf2.append(buf1);
                        buf2.append(buf.substring(buf.indexOf("且") + 1, buf.length()));
                    }
                    setprolog(ctx, buf2.toString());
                    System.out.println("exitCompound_term: " + buf2.toString());
                } else if(binaryoperator == 0) {
                    StringBuilder buf = new StringBuilder();
                    buf.append(getprolog(ctx.termlist()));
                    buf.append(" 是 ");
                    buf.append(getprolog(ctx.atom()));
                    setprolog(ctx, buf.toString());
                    System.out.println("exitCompound_term: " + buf.toString());
                }
                binaryoperator = 0;
            }
            else if(com_list_term==1){
                StringBuilder buf = new StringBuilder();
                buf.append(getprolog(ctx.termlist()));
                StringBuilder buf1 = new StringBuilder();
                buf1.append(" ");
                buf1.append(getprolog(ctx.atom()));
                buf1.append(" ");
                buf.replace(buf.indexOf(","),buf.indexOf(",")+1,buf1.toString());
                buf.replace(buf.indexOf(","),buf.indexOf(",")+1," 成为 ");
                setprolog(ctx, buf.toString());
                System.out.println("exitCompound_term: " + buf.toString());
            }
            com_list_term=0;
        }

        public void enterList_term(prologParser.List_termContext ctx) {
            list_term = 1;
            com_list_term = 1;
        }

        public void exitList_term(prologParser.List_termContext ctx) {
            StringBuilder buf = new StringBuilder();
            buf.append("数组：");
            buf.append("[");
            buf.append(getprolog(ctx.termlist()));
            buf.append("]");
            setprolog(ctx,buf.toString());
            System.out.println("exitList_term: " + buf.toString());
            list_term = 1;
        }

        public void exitInteger_term(prologParser.Integer_termContext ctx) {
            setprolog(ctx,getprolog(ctx.integer()));
            System.out.println("exitInteger_term: " + getprolog(ctx.integer()));
        }

        public void exitInteger(prologParser.IntegerContext ctx) {
            setprolog(ctx,ctx.DECIMAL().getText());
            System.out.println("exitInteger: " + ctx.DECIMAL().getText());
        }

        public void exitVariable(prologParser.VariableContext ctx) {
            StringBuilder buf = new StringBuilder();
            buf.append("数组：");
            buf.append(ctx.getText());
            setprolog(ctx,buf.toString());
            System.out.println("exitVariable: " + buf.toString());
        }

        public void exitUnary_operator(prologParser.Unary_operatorContext ctx) {
            if (getprolog(ctx.operator()).equals("?-")) {
                StringBuilder buf = new StringBuilder();
                buf.append("对或错？ ");
                buf.append(getprolog(ctx.term()));
                setprolog(ctx,buf.toString());
                System.out.println("exitUnary_operator: " + buf.toString());
            }
        }
    }
}