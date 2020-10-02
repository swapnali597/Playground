#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float m;
  int l,d;
  std::cin>>m>>l>>d;
  float x=m*l;
  if(x<d)
  {
  	std::cout<<"Cannot reach"<<"\n";
  }
  else
  {
  	cout<<"Can reach"<<"\n";
  }
}