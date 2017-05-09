#include <iostream>
#include "ta.h"
using namespace std;

int
main(int argc, char ** argv) {

  cout << "welcome to the type architecture program." << endl;

  cout << "declaring and setting primitive variable." << endl;
  

  TAInt h("h");
  h.set(4);
  h.printState(cout);
  cout<<endl;

  TAInt l("l");
  l.set(3);
  l.printState(cout);
  cout<<endl;

  TALessThan le(h,l);
  le.list(cout);
  cout<<endl;
  le.evaluate();
  le.printState();
  cout<<endl;

  TABiggerThan le1(h,l);
  le1.list(cout);
  cout<<endl;
  le1.evaluate();
  le1.printState();
  cout<<endl;

  TABool x("x");
  x.set(true);
  x.printState(cout);

  cout<<endl;

  TABool b("b");
  b.set(false);
  b.printState(cout);

  cout<<endl;

//  TABool c("c");
//  c.set(true);
 // c.printState(cout);

//  cout<<endl;

  TATernaryOp e(x,h,l);
  e.list(cout);
  cout<<endl;
  e.evaluate();
  e.printState();  

  cout<<endl;
 
  TAAssignment assg(x,le);
  assg.list(cout);
  cout<<endl;

  TAAssignment assg1(b,le1);
  assg1.list(cout);
  cout<<endl;

  TACondition c(x,assg,assg1);
  c.list(cout);
  c.evaluate();

  cout<<endl;

  x.printState(cout);
  b.printState(cout);
  cout<<endl;


  TALoop loop(x,c);
  loop.list(cout);
  cout<<endl;
  loop.evaluate();

  x.printState(cout);
  b.printState(cout);
  cout<<endl;

  TAEmptyStmt empty;
  empty.evaluate();
  empty.list(cout);

  int o;
  cin>>o;
  return 0;
  

}
