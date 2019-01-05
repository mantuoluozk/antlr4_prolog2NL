start.
?-likes(x,y).
friend(x,y):-likes(x,y),likes(y,x).
had(jack,hat).
fruit(apple).
a^b^c-->p.
a-->p.
a,b,c-->p.
likes(x,y),likes(y,x)-->friend(x,z).
?- append([1],What,[1,2,3]).
[1,2,3].