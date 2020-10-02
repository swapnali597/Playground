#include <iostream>
#include<stdio.h>
#include<string.h>
using namespace std;

int main() 
{
   // Try out your code here
  int i,j,si,ei,len;
  string str;
  getline(cin,str);
  len = str.size();
  ei=len-1;
  for(i=len-1;i>=0;i--)
  {
  	if(str[i]==' ' || i==0)
    {
    	if(i==0)
        {
        	si=0;
        }
      else
      {
      	si=i+1;
      }
      for(j=si;j<=ei;j++)
      {
      	cout<<str[j];
      }
      cout<<" ";
      ei=i-1;
    }
  }
  return 0;
}