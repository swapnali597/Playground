#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char a[10];
  int b;
  std::cin>>a;
  std::cin>>b;
  if((strcmp(a,"rear")==0))
  {
  	if(b==1)
    {
    	cout<<"Right Handed";
    }
    else
    {
    	cout<<"Left Handed";
    }
  }
  else if((strcmp(a,"front")==0) )
  {
  	if(b==1)
    {
    	cout<<"Left Handed";
    }
    else
    {
    	cout<<"Right Handed";
    }
  }
 
}