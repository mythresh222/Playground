#include<iostream>
int main()
{
  int x,l=6;
  std::cin>>x;
  for( int i=1;i<=x;i++)
  {
    std::cout<<l<<" ";
    l=l+5*i;
  }
}
