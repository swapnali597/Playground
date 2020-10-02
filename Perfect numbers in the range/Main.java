#include<iostream>
int main()
{
	int a,b,i,j,sum=0;
  	std::cin>>a>>b;
  	for(i=a;i<=b;i++)
    {
    	j=1;
      	while(j<=(i/2))
        {
        	if(i%j==0)
            {
            	sum=sum+j;
            }
          	j++;
        }
      if(sum==i)
      {
      	std::cout<<i<<" ";
      }
      sum=0;
    }
}