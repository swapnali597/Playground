#include<iostream>
using namespace std;
int power(int x,int y)
{
	if(y!=0){
      return(x*power(x,y-1));
    }
  else{
  		return 1;
  }
}
int main()
{
  //Type your code here.
  int a,n;
  std::cout<<"Enter the value of a"<<"\n"<<"Enter the value of n";
  std::cin>>a>>n;
  std::cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<power(a,n);
}