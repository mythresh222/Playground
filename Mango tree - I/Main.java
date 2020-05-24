#include<iostream>
using namespace std;
int main()
{
  
  //Type your code here.
  int x,y,z;
  std::cin>>x>>y>>z;
  if(z<=x)
  {
    std::cout<<"Yes";
     }
  else if(z%x==1)
  {
    std::cout<<"Yes";
  }
  else
  {
    std::cout<<"No";
  }
}