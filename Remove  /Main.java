#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char str[200];
  std::cin.getline(str,200);
  int i=0;
  while(str[i]!='\0')
  {
  	if(str[i]=='t')
    {
    	i++;
      	if(str[i]=='h')
        {
          	 i++;
          	if(str[i]=='e')
            {
            	i++;
              	if(str[i]==' ')
                i++;
            }
        }
      else
      {
      	--i;
        std::cout<<str[i];
        i++;
        std::cout<<str[i];
        i++;
      }
    }
    else
    {
    	std::cout<<str[i];
      	i++;
    }
  }
}