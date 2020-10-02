#include<iostream>
int main()
{
	int n;
  	std::cin>>n;
  	float x=0.5f;
  
  	std::cout<<x<<" ";
  	for(int i=0;i<n-1;i++)
    {
    	x=x*3;
      std::cout<<x<<" ";
    }

}