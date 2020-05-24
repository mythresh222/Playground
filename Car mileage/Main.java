#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float x,f;
  int y,z;
  std::cin>>x>>y>>z;
  f=x*y;
  if(f>=z)
    std::cout<<"Can reach";
  else
   std::cout<<"Cannot reach";
}