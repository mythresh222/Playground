#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  std::string name;
  char a[20];
  
  std::getline(std::cin,name);
  for(int i=0; i<name.length();i++)
  {
    if((name[i]>=65 && name[i]<=90) || (name[i]>=97 && name[i]<=122))
    {
      std::cout<<name[i];
    }
  }
  
}