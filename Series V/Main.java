#include<iostream>
int main()
{
  int x,l=11;
  std::cin>>x;
  for( int i=0;i<x;i++)
  {
    std::cout<<l*l<<" ";
    l=l+4;
  }
}