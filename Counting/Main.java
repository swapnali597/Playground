#include<iostream>
using namespace std;
int main()
{
    char str[300];
    int i, vowels, consonants, digits, spaces, symbols;
    vowels = consonants = digits = spaces = symbols = 0;

    cin.getline(str, 300);

    for(i=0; str[i]!='\0'; i++)
    {
        if(str[i]=='a' || str[i]=='e' || str[i]=='i' ||str[i]=='o' || str[i]=='u' || str[i]=='A' ||str[i]=='E' || str[i]=='I' || str[i]=='O' ||str[i]=='U')
        {
            vowels=vowels+1;
        }
        else if((str[i]>='a'&& str[i]<='z') || (str[i]>='A' && str[i]<='Z'))
        {
            consonants=consonants+1;
        }
        else if(str[i]>='0' && str[i]<='9')
        {
            digits=digits+1;
        }
        else if (str[i]==' ')
        {
            spaces=spaces+1;
        }
        else
        {
            symbols=symbols+1;
        }
    }

    cout << "Vowels:"<< vowels << endl;
    cout << "Consonants:" << consonants << endl;
  	 cout << "White Spaces:" << spaces << endl;
    cout << "Digits:" << digits << endl;
    cout << "Symbols:" << symbols << endl;

    return 0;
}