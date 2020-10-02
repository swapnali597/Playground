#include <iostream>
#include<vector>
using namespace std;

int main() 
{
  int t;
  cin>>t;
  while(t--)
  {
    int n;
    cin>>n;
    int a[n];
  	for(int i=0;i<n;i++)
    {
    	cin>>a[i];
    }
    vector<int>v;
    v.push_back(a[n-1]);
    for(int i=n-2;i>=0;i--)
    {
    	if(a[i]>=v.back())
        {
        	v.push_back(a[i]);
        }
    }
    for(int i=v.size()-1;i>=0;i--)
    {
    	cout<<v[i]<<" ";
      	
    }
    cout<<"\n";
  }
}