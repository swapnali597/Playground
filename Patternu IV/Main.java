#include <iostream>
int main()
 {
int i,j,n;
std::cin>>n;
for(i=1;i<=n;i++)
{
    if(i%2==0)
    {
        std::cout<<i+1;
    }
    for(j=1;j<n;j++)
    {
       std::cout<<i;
    }
    if(i%2!=0)
    {
        std::cout<<i+1;
    }
        std::cout<<"\n";
    }
    
    return 0;
    
}