#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,l,d;
  std::cin>>r>>l;
  d=r+r;
  if(d<=l)
  {
  	std::cout<<"circle can be inside a square";
  }
  else
  {
  	std::cout<<"circle cannot be inside a square";
  }
  
}