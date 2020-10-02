#include<iostream>
using namespace std;
int digsum(int n)
{
	if(n==0)
    {
    	return 0;
    }
  else
  {
  	return ((n%9==0)? 9:(n%9));
  }
}
int main()
{
	int n;
  	std::cin>>n;
  	std::cout<<((n%9==0)? 9:(n%9));
}