#include <iostream>
int main() 
{
	// Type your code here
  int num;
  std::cin>>num;
  int rev=0;
  while(num>0)
  {
  	int rem=num%10;
    rev=rev*10+rem;
    num=num/10;
  }
  std::cout<<rev;
	return 0;
}