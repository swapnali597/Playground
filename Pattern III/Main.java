#include<iostream>
int main()
{
  int n,R,P;
  std::cin>>n;
  for(int R=1; R<=n; R++)
 {
   for( P=1; P<=R; P++)
     if (P<R)
     {
       std::cout<<R<<"*";}
   else
   {
     std::cout<< R<<"\n";
   }
 }
  for(int R=n; R>=0; R--)
 {
   for( P=1; P<=R; P++)
     if (P<R)
       std::cout<< R<<"*";
   else
     std::cout<<R<<"\n";
 }
}