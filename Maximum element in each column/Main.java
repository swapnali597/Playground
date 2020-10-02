#include <iostream> 
using namespace std; 
  

int main() 
{ 
    int n,m;
  	cin>>n>>m;
    int a[100][100];
  	int i,j;
  	for(i=0;i<n;i++)
    {
    	for(j=0;j<m;j++)
    	{
    		cin>>a[i][j];
    	}
    }
    for (i = 0; i < m; i++) 
    { 
        int maximum = a[0][i]; 
        for (j = 1; j < n; j++) 
        {  
            if (a[j][i] > maximum) 
            {
                maximum = a[j][i]; 
            }
        } 
        cout << maximum << endl; 
    } 
}