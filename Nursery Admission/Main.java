#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int cnt=0;
  std::string name;
  std::getline(std::cin,name);
  for( int i=0;i< name.length();i++)
  {
    cnt=cnt+1;
  }
  std::cout<<"The number of letters in the name is "<<name.length();
}