#include<iostream>
using namespace std;
int dec_to_oct(int n)
{
    //Your code goes here
  int rev=0,power=1;
  int rem;
  while(n!=0)
  {
  	rem=n%8;
    rev=rev+rem*power;
    power=power*10;
    n=n/8;
  }
  return rev;

}
int main()
{
    int n;
    cin>>n;
    cout<<dec_to_oct(n);
}
