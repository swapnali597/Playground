#include<iostream>
int main(){
  // Type your code here
  int i,number;
  int fact=1;
  std::cin>>number;
  for(i=1;i<=number;i++)
  {
  	fact=fact*i;
  
  }
    std::cout<<fact;
    
  
}