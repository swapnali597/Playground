#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int n,i,j;
  cin>>n;
  for(i=1;i<=n;i++)
  {
  	for(j=1;j<=n;j++)
    {
    	if(i==1||i==n||j==1||j==n)
        {
        	cout<<"* ";
        }
      else
      {
      	cout<<"  ";
      }
      
    }
    cout<<"\n";
  }
    return 0;
}