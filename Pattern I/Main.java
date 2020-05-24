#include<iostream>
int main()
{
  int x,y=0,z=0;
  std::cin>>x;
 
  for( int i=1;i<=4;i++)
  {
    for( int j=1;j<=i;j++)
    {
      std::cout<<x;
    }
    std::cout<<'\n';
    x=x+1;
  }
  x=x-1;
    for( int i=4;i>=1;i--)
  {
    for( int j=1;j<=i;j++)
    {
    std::cout<<x;
    }
    std::cout<<'\n';
    x=x-1;
  }
  
 
}