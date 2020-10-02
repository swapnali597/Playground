#include<stdio.h>
int pattern(int n)
{
   int i,j;
  for(i=1; i<=n; i++)
  {
  	for(j=1; j<=n; j++)
    {
    	if(j==1 || j==n || i==1 || i==n)
        {
        	printf("1");
        }
      else
     	{
      		printf(" ");
      	}
      
    }
    printf("\n");
  }
}
void main()
{
    int n;
    scanf("%d",&n);
    pattern(n);
}
