#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int a,i=0,s=0,c=0;
  do
  {
  	c++;
    std::cin>>a;
    s+=a;
    i++;
  }while(s<n);
  std::cout<<"The number of turns is "<<c;
}