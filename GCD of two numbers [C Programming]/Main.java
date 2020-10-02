#include<stdio.h>
int gcd(int a,int b)
{
   //Your code goes here
  int GCD,min;
  min = a>b?a:b;
	for(int i=min;i>=1;i--)
	{
		if(a%i==0 && b%i==0)
		{
			GCD=i;
			break;
		}
	}
  return GCD;
  	
}
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    printf("%d ",gcd(a,b));
    return 0;
}
