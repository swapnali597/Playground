#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cout<<"Enter the number of elements in the array\n";
  std::cin>>n;
  int arr[n];
  std::cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
  {
  	std::cin>>arr[i];
  }
  int i;
  int odd=0,even=0;
  for(i=0;i<n;i++)
  {
  	if(arr[i]%2==1)
    {
    	odd++;
    }
    if(arr[i]%2==0)
    {
    	even++;
    }
  }
  if(odd==n)
  {
  	std::cout<<"The array is Odd";
  }
  else if(even==n)
  {
  	std::cout<<"The array is Even";
  }
  else
  {
  	std::cout<<"The array is Mixed";
  }
    
}