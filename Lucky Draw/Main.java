#include<iostream>
int main()
{
	int num;
  	std::cin>>num;
  	int flag=0;
  	for(int i=2;i<=num/2;++i)
    {
    	if(num%i==0)
        {
        	flag=1;
         	 break;
        }
          
    }
  if(num==1)
  {
  	std::cout<<"Not eligible";
  }
  else
  {
  	if(flag==0)
    {
    	std::cout<<"Eligible";
    }
    else
    {
    	std::cout<<"Not eligible";
    }
  }
}