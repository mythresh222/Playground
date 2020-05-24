#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char a[100][100];
  int n=0;
  for(int i=0;i<10;i++)
  {
  std::cin.getline(a[i],100);
    if(!strcmp(a[i],"####"))
       {
         break;
       }
    n++;
    }
  std::cout<<a[0]<<endl;
  for(int i=0;i<n;i++)
  {
    if(a[i][strlen(a[i])-1]==a[i+1][0])
            {
               cout << a[i+1] << endl;
            }
  }
}