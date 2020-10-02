#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char str[100];
  int i=0; int l=0;
  std::cin>>str;
  while(str[i]!='\0')
  {
  	l++;
    i++;
  }
  std::cout<<"The number of letters in the name is "<<l;
}