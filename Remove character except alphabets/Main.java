#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  char str[150];
  int i, j;
  std::cin>>str;
  for(i=0;str[i]!='\0';++i)
  {
  	while(!((str[i]>='a'&&str[i]<='z')||(str[i]>='A'&&str[i]<='Z')||str[i]=='\0'))
    {
    	for(j=i;str[j]!='\0';++j)
        {
        	str[j]=str[j+1];
        }
      str[j]='\0';
    }
  }
  std::cout<<str;


}