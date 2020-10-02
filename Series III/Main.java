#include<iostream>
int main()
{
	int n,c;
    int j=6;
  	std::cin>>n;
  	int b=5;
  	if(n==1)
    {
    	std::cout<<"6"<<" ";
    }
  else
  {
    std::cout<<j<<" ";
  	for( int i=2;i<=n;i++)
    {
      
      	j=j+b;
      	b=b+5;
      	std::cout<<j<<" ";
    }
  }
}