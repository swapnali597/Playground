#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,res;
  std::cin>>n>>m;
  if(n<m)
  {
  	res=n;
  }
  else
  {
  	res=m;
  }
  if(res%2==0)
  {
  	std::cout<<"Mani Iyer";
  }
  else
  {
  	std::cout<<"Arun Gupta";
  }
  
}