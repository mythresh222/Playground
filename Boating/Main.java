#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z;
  std::cin>>x>>y>>z;
  if(x>(y*75+z*30))
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}