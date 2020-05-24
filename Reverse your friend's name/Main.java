#include<iostream>
#include<string>
int main() 
{ 
//Type your code here
  std::string name;
  std::getline(std::cin,name);
  for(int i=name.size()-1;i>=0;i--)
  {
    std::cout<<name[i];
  }
  
}