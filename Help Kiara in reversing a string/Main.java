#include <iostream>
#include<string.h>
int main()
{
char str[100], rev[100],temp;    
int count = 0, end;    
int i, j;
gets(str);
j=strlen(str)-1;
//Your code goes here 
  for (i=0;i<j;i++,j--)
  {
    temp=str[i];
    str[i]=str[j];
    str[j]=temp;
  }
std::cout<<str;
}

