#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  char a[50][50];
  int i;
  int n=0;
  for(i=0;i<5;i++)
  {
  	std::cin.getline(a[i],50);
    n++;
    if(!strcmp(a[i],"####"))
    {
    	break;
    }
  }
  std::cout <<a[0]<<"\n";
  for(i=0;i<n;i++)
  {
  	if(a[i][strlen(a[i])-1]==a[i+1][0])
    {
    	std::cout<<a[i+1]<<"\n";
    }
  }
}