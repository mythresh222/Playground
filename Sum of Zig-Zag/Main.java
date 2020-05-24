#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,cnt=0;
  std::cin>>r>>c;
  int a[r][c];
  for(int i=1;i<=r;i++)
  {
    for(int j=1;j<=c;j++)
    {
      std::cin>>a[i][j];
     }}
   for(int i=1;i<=r;i++)
  {
    for(int j=1;j<=c;j++)
    {
      if(i==j)
      cnt=cnt+a[j][c-j+1];
      }
     }
 for(int i=1;i<=1;i++)
  {
    for(int j=1;j<=c-1;j++)
    {
    cnt=cnt+a[i][j];
    }
  }
  for(int i=r;i<=r;i++)
  {
     for(int j=2;j<=c;j++)
    {
    cnt=cnt+a[i][j];
  }
 
  }
  
std::cout<<"Sum of Zig-Zag pattern is "<<cnt;    
}