#include<iostream>
int main()
{
    // Type your code here
    int r,c;
  std::cin>>r>>c;
  int a[r][c];
  for(int j=0;j<r;j++)
    {
      for(int k=0;k<c;k++)
       std::cin>>a[j][k];
      }
  for(int j=0;j<c;j++)
    {
      for(int k=0;k<r;k++)
      {
        std::cout<<a[k][j]<<" ";
      }
    std::cout<<'\n';
      }
}