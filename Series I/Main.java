#include<iostream>
int main()
{
  int x;
  float l=0.5;
  std::cin>>x;
  std::cout<<"0.5"<<" ";
  for (int i=1;i<=x-1;i++)
  {
    l=l*3;
    std::cout<<l<<" ";
  }
}