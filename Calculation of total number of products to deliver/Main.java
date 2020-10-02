#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int n,i,j,t,rem,sum=0,arr[100];
  cin>>n;
  for(i=0;i<n;i++)
  {
  	cin>>arr[i];
  }
  for(j=0;j<n;j++)
  {
  	t=arr[j];
    while(t!=0)
    {
    	rem=t%10;
        sum=sum+rem;
      	t=t/10;
    }
    cout<<sum<<" ";
    sum=0;
    
  }
  
   
  
    return 0;
}