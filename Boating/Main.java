#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b,a,c,total;
  int adult=75,child=30;
  std::cin>>b>>a>>c;
  total=(adult*a)+(child*c);
    if(total<=b)
    {
    	std::cout<<"Boat is stable";
    }
    else
    {
    	 std::cout<<"Boat will drow";
    }
  
 
  
}