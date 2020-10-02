#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float i,j,k,l,m,n;
  std::cin>>i>>j;
  l=i*j;
  k=((j/100)*50);
  if(i<=2)
  {
  	std::cout<<l-k;
  }
  else if(i==3)
  {
  	std::cout<<2*j;
  }
  else
  {
  	std::cout<<"Number of items is more";
  }
}