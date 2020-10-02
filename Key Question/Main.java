#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int n,b[10],i,j,digit=0;
  cin>>n;
  while(n!=0)
  {
  	b[digit++]=n%10;
    n=n/10;
  }
  for(i=0;i<digit;i++)
  {
  	for(j=i+1;j<digit;j++)
    {
    	if(b[i]>b[j])
        {
        	int temp=b[i];
          	b[i]=b[j];
          	b[j]=temp;
        }
    }
  }
  for(i=0;i<digit;i++)
  {
  	cout<<b[i]<<" ";
  }
  
    return 0;
}