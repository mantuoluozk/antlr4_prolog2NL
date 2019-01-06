# antlr4_prolog2NL
基于antlr4的prolog语言转自然语言  
本项目基于idea和jdk11  
输入：
```
start.
had(jack,hat).
friend(x,y):-likes(x,y),likes(x,y),likes(x,z).
?-likes(x,y).
fruit(apple).
a^b^c-->p.
a-->p.
a,b,c-->p.
likes(x,y),likes(y,x)-->friend(x,z).
?- append([1],What,[1,2,3]).
[1,2,3].
```  
输出：
```
start;
jack had hat;
要想 x friend y 就得 x likes y 且 y likes x ;
对或错？ x likes y;
apple 是 fruit;
如果 a^ b^ c 则有 p;
如果 a 则有 p;
如果 a 且  b 且  c 则有 p;
如果 x likes y 且  y likes x 则有 x friend z;
对或错？ 数组：[1] append 数组：What 成为 数组：[1,2,3];
数组：[1,2,3];
```
