#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i;
  std::cin>>n;
   for(i=1;i<=n;i++)
   {
   	if(i%2!=0)
    {
    	std::cout<<((i*i)-1)<<" ";
    }
     else
     {
     	std::cout<<((i*i)-2)<<" ";
     }
   }
}