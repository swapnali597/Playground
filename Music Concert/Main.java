#include<iostream>
int main(){
  // Type your code here
  int n,i;
  std::cin>>n;
  int count=0,cnt=0;
  int a[n];
  for(i=0;i<n;i++)
  {
  	std::cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
  	if(a[i]%2==0)
    {
    	count++;
    }
    else
    {
    	cnt++;
    }
  }
  std::cout<<cnt<<"\n"<<count;
  return 0;
}