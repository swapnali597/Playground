#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  string str1,str2;
  cin>>str1>>str2;
  int i,j=0;
  for(i=0;i<str1.length();i++)
  {
  	if(str1[i]==str2[j])
    {
    	j++;
    }
    else
    {
    	cout<<str1[i];
    }
  }
  if(j==str1.length())
  {
  	cout<<"NA";
  }
}