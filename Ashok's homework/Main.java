#include<iostream>
int main()
{
  int r,c;
  std::cin>>r>>c;
  int a[r][c],b[r][c],l[r][c];
  
    for(int j=0;j<r;j++)
    {
      for(int k=0;k<c;k++)
      {
        std::cin>>a[j][k];
      }
      
    }
   for(int j=0;j<r;j++)
    {
      for(int k=0;k<c;k++)
      {
        std::cin>>b[j][k];
        l[j][k]=a[j][k]+b[j][k];
      }
    }
    for(int j=0;j<r;j++)
    {
      for(int k=0;k<c;k++)
      {
        std::cout<<l[j][k]<<" ";
      }
      std::cout<<'\n';
    }
   
  
    // Type your code here
}