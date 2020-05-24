#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z;
  std::cin>>x>>y;
  z=2*x;
  if(z<=y)
    std::cout<<"circle can be inside a square";
  else
    std::cout<<"circle cannot be inside a square";
}