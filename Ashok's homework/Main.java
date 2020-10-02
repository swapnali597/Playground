#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int rows, cols, m1[10][10], m2[10][10], sum[10][10];
  std::cin>>rows;
  std::cin>>cols;
  for(int i=0;i<rows;i++) 
  {
  	for (int j=0;j<cols;j++)
    {
    	std::cin>>m1[i][j];
    }
  }
  for (int i=0;i<rows;i++)
  {
  	for (int j=0;j<cols;j++)
    {
    	std::cin>>m2[i][j];
    }
  }
  for (int i=0;i<rows;i++)
  {
  	for (int j=0;j<cols;j++) 
    {
      sum[i][j]=m1[i][j]+m2[i][j];
      std::cout<<sum[i][j]<<" ";
    }
    std::cout<<"\n";
  }
}