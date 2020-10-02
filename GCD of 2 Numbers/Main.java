#include <iostream>
using namespace std;

int gcd(int a, int b)
{
    if (b != 0)
        return gcd(b, a % b);
    else
        return a;
}
int main()
{
  //Type your code here.
  int n1,n2;
  std::cin>>n1>>n2;
  std::cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<gcd(n1,n2);
  
}