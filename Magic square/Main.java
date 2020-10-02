#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,Diag1=0,Diag2=0,i,j;
  std::cin>>n;
  int Matrix[n][n];
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      std::cin>>Matrix[i][j];
    }
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      if(i==j)
      {
        Diag1+=Matrix[i][j];
      }
      if(i+j+1==n)
      {
        Diag2+=Matrix[i][j];
      }
    }
  }
  if(Diag1==Diag2)
  {
    std::cout<<"Yes";
  }
  else
  {
    std::cout<<"No";
  }
}