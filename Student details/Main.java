#include<iostream>
#include<string.h>
#include<stdlib.h>
using namespace std;
struct student
{
  char name[30];
  char department[20];
  int yr;
  float cgpa;
};
int comparator(const void* p, const void* q) 
{ 
    return strcmp(((struct student*)p)->name, ((struct student*)q)->name); 
} 
int main()
{
  //Type your code here.
  int n;
  char t[30];
  cout<<"Enter the number of students";
  cin>>n;
  student stu[n];

  for(int i=0;i<n;i++)
  {
    cout<<"\nEnter the details of student "<<i+1<<endl;
    cout<<"Enter name\n";
    cin>>stu[i].name;
    cout<<"Enter department\n";
	cin>>stu[i].department;
    cout<<"Enter year of study\n";
    cin>>stu[i].yr;
    cout<<"Enter cgpa";
    cin>>stu[i].cgpa;
  }
   qsort(stu, n, sizeof(struct student), comparator); 
    cout<<"\nDetails of students\n";
    for(int i=0;i<n;i++)
    {
      cout<<"Student "<<i+1<<endl;
      cout<<"Name:"<<stu[i].name<<endl;
      cout<<"Department:"<<stu[i].department<<endl;
      cout<<"Year of study:"<<stu[i].yr<<endl;
      cout<<"CGPA:"<<stu[i].cgpa<<endl;
      }
    return 0;
  }