#include<iostream>
int main()
{
	int a,b,c;
  std::cout<<"Enter first number :";
  std::cin>>a;
  std::cout<<" Enter second number :";
  std::cin>>b;
  std::cin>>c;
  std::cout<<" Menu\n";
  std::cout<<"1.Addition\n";
  std::cout<<"2.Subtraction\n";
  std::cout<<"3.Multiplication\n";
  std::cout<<"4.Division\n";
  std::cout<<"5.Remainder\n";

  switch(c)
  {
    case 1:
      std::cout<<a+b;
      break;
    case 2:
      std::cout<<a-b;
      break;
    case 3:
      std::cout<<a*b;
      break;
    case 4:
      std::cout<<a/b;
      break;
     case 5:
      std::cout<<a%b;
      break;
    default:
      std::cout<<"Invalid operation";
      
  }
}