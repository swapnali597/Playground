#include<stdio.h>
int dec_to_oct(int n)
{
    //Your code goes here
  int rem,num=0,power=1;
  while(n!=0)
  {
  	rem=n%8;
    num=num+rem*power;
    power=power*10;
    n=n/8;
  }
  return num;

}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_oct(n));
}
