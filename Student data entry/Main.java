#include <iostream>
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   //Your code goes here
  struct student s;
  std::cin.get(s.name, 50);
  std::cin>>s.roll;
  std::cin>>s.marks;
  std::cout<<"\n";
  std::cout<<"Student Details"<<"\n";
  std::cout<<"Name: "<<s.name<<"\n";
  std::cout<<"Roll: "<<s.roll<<"\n";
  std::cout<<"Marks: "<<s.marks<<"\n";
  
}