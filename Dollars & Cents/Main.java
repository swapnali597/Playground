#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2;
  std::cin>>d1>>c1>>d2>>c2;
  int d=d1+d2;
  int c=c1+c2;
  while(c>100)
  {
  		c=c-100;
    	d=d1+d2+1;
  }
  std::cout<<d<<"\n"<<c;
}