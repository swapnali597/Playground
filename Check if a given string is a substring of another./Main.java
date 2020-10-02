#include <iostream>
#include<string>
using namespace std;
string TestCase()
{
	string s1,s2;
  	cin>>s1>>s2;
  	int len1,len2,flag=1,i,j;
  	len1=s1.length();
  	len2=s2.length();
  	for(i=0;i<=len1-len2;i++)
    {
    	flag =1;
      	for(j=0;j<len2;j++)
        {
        	if(s1[i+j]!=s2[j])
            {
            	flag=0;
              	break;
            }
        }
      if(flag==1 && j==len2)
      {
      	return "Yes";
      }
    }
  return "No";
  	
}

int main() 
{
  int t;
  cin>>t;
while(t--)
  {
  	cout<<TestCase()<<"\n";
  }
  return 0;
}