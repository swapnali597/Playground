#include<iostream>
int main()
{
	int n;
  	std::cin>>n;
   	int a,b,c,i;
  	a=121;
  	b=11;
  	if(n==1)
    {
    	std::cout<<"121"<<" ";
    }
  	else
    {
    	std::cout<<"121"<<" ";
      	for(i=2;i<=n;i++)
        {
        	b=b+4;
          	c=b*b;
          	std::cout<<c<<" ";
        }
    }
  
}