#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int hour1, minute1, second1;
  int hour2, minute2, second2;
  int diff_hour, diff_minute, diff_second;
  std::cin>>hour1>>minute1>>second1;
  std::cin>>hour2>>minute2>>second2;
  if(second2>second1)
  {
  	minute1--;
    second1+=60;
  }
  diff_second=second1-second2;
  if(minute2>minute1)
  {
  	hour1--;
    minute1+=60;
  }
  diff_minute=minute1-minute2;
  diff_hour=hour1-hour2;
  std::cout<<diff_hour <<":"<< diff_minute <<":"<<diff_second;
  
}