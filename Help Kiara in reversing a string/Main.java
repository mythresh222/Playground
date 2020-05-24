#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100];     
int cnt =0, end, i,j;    
//Your code goes here   
 std::cin.getline(str,100);
  //std::cin>>str;
 while (str[cnt]!='\0')
    {
      cnt++;
  }
    j = cnt - 1;
  for(i=0;i<cnt;i++)
  {
    rev[i]=str[j];
    j--;
    std::cout<<rev[i];
  }

}