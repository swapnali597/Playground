#include<stdio.h>
int dec_to_bin(int n)
{
   //Your code goes here
  int bin=0,i=1;
  while(n!=0)
  {
  	bin+=n%2*i;
    i=i*10;
    n=n/2;
  }
  return bin;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
