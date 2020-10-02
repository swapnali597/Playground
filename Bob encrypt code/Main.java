#include <iostream>
#include<math.h>
using namespace std;

int main() 
{
   // Try out your code here
  int S,N,M,ANS;
  cin>>S>>N>>M;
  ANS=pow(S,N);
  ANS=ANS%10;
  ANS=pow(ANS,M);
  ANS=ANS%1000000007;
  cout<<ANS;
   
    return 0;
}