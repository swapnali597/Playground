#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int f[n+2];
  int i;
  f[0]=0;
  f[1]=1;
  for(i=2;i<=n;i++)
  {
  	f[i]=f[i-1]+f[i-2];
  }
  std::cout<<f[n-1];
}