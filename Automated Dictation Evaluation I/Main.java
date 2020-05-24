#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char str1[100],str2[100];
  std::cin.getline(str1,100);
  std::cin.getline(str2,100);
  if(strcmp(str1,str2)==0)
     {
       std::cout<<"It is correct";
       
     }
     else
     std::cout<<"It is wrong";
    
}