#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,f;
  std::cin>>num;
  int cnt=0;
  std::cout<<num<<"\n";
  while(num>1)
  {
  	if(num%2==0)
    {
    	num=num/2;
      	std::cout<<num<<"\n";
    }
    else
    {
    	num=3*num+1;
      	std::cout<<num<<"\n";
    }
    
    cnt++;
    
  }
  std::cout<<cnt<<"\n";
}