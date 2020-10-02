#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
   int n,b=11;
  std::cin>>n;
  if(n==1)
  {
  	std::cout<<"121";
  }
  else
  {
    std::cout<<"121 ";
    for(int i=1;i<n;i++)
    {
  	b=b+4;
    int c=b*b;
    std::cout<<c<<" ";
    }
  }
}