#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int year,leap;
  std::cin>>year;
  leap=year%4;
  if(leap==0)
  {
  	std::cout<<year<<" is a leap year";
  }
  else
  {
    std::cout<<year<<" is not a leap year";
  }
  
}