#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int X,Y,R;
  double p,q,s,t;
  std::cin>>X>>Y>>R;
  p=(X*Y*R)/100;
  q=X+p;
  s=p*2/100;
  t=X+p-s;
  std::cout<<p<<endl;
  std::cout<<q<<endl;
  std::cout<<s<<endl;
  std::cout<<t<<endl;
  
}