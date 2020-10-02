#include <iostream>
#include<stdio.h>
using namespace std;
int MaxExponent(int num)
{
  	int count=0;
	while(num!=0 && num % 2==0)
    {
    	count++;
      	num = num / 2;
    }
  return count;
}
int CountMax(int a ,int b)
{
	int num=0,max=-1,temp;
  	for(int i=a;i<=b;i++)
    {
    	temp = MaxExponent(i);
      	if(temp > max)
        {
        	max = temp;
          	num = i;
        }
    }
  return num;
}
int main() 
{
  int a,b;
  cin>>a>>b;
  cout<<CountMax(a,b);
  return 0;
}