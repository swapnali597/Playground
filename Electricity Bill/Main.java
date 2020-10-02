#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int unit,a,b,c,d;
  std::cin>>unit;
  if(unit<=200)
  {
  	a=unit*0.5;
     std::cout<<"Rs."<<a;
  }
  else if(unit<=400)
  {
  	b=unit*0.65+100;
    std::cout<<"Rs."<<b;
  }
  else if(unit<=600)
  {
  	c=unit*0.80+200;
    std::cout<<"Rs."<<c;
  }
  else 
  {
  	d=unit*1.25+425;
     std::cout<<"Rs."<<d;
  }
}