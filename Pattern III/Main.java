#include<iostream>
int main()
{
  int x,y=0,z=0,l;
  std::cin>>x;
 
  for( int i=1;i<=x;i++)
  {
    for( int j=1;j<=i;j++)
    {
      l=i;
      std::cout<<i;
      if(j<=l-1)
      {
         std::cout<<"*";
      }
    }
    std::cout<<'\n';
   
  }
  l=0;
    for( int i=x;i>=1;i--)
  {
    for( int j=1;j<=i;j++)
    {
      l=i;
    std::cout<<i;
      if(j<=l-1)
      {
         std::cout<<"*";
      }
    }
    std::cout<<'\n';
  }
  
 
}