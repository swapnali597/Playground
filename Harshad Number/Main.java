#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num;
  int sum=0;
  std::cin>>num;
  int temp;
  temp=num;
  while(temp)
  {
  	sum+=temp%10;
    temp=temp/10;
  }
  int res=num%sum;
  if(res==0)
  {
  	std::cout<<"Harshad Number";
  }
  else
  {
  	std::cout<<"Not Harshad Number";
  }
}