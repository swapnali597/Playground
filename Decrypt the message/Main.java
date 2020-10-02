#include<iostream>
int main()
{
	int a,b,n;
  	std::cin>>a>>b;
  	n=a+b;
  	int i=1,sum=0;
  	while(i<n)
    {
    	if(n%i==0)
        {
        	sum=sum+i;
         
        }
      	 i++;
    }
  if(sum==n)
  {
  	std::cout<<"They can read the message";
  }
  else
  {
  	std::cout<<"They can't read the message";
  }
  
  	
}