#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
int main() 
{ 
//Type your code here
  int x,i,n;
  string str;
  getline(cin,str);
  reverse(str.begin(),str.end());
  std::cout<<str;
  
}