#include <iostream>
#include<string.h>
using namespace std;

int main() 
{
   // Try out your code here
  int i,j,k,n;
  char s[10];
  for(i=0;i<n;i++)
  {
  	cin>>s[i];
  }
  n=strlen(s);
  for(i=0;i<n;i++)
  {
  	for(j=0;j<n;j++)
    {
    	if(i==j||i+j==n-1)
        {
        	cout<<s[j];
        }
      else
      {
      	cout<<" ";
      }
    }
    cout<<"\n";
  }
   
    return 0;
}