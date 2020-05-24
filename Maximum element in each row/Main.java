#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,cnt=0;
  std::cin>>r>>c;
  int a[r][c];
  int b[c];
  for(int i=1;i<=r;i++)
  {
    cnt=0;
    for(int j=1;j<=c;j++)
    {
      std::cin>>a[i][j];
     if(a[i][j]>cnt)
     {
       cnt=a[i][j];
     }
     }
    std::cout<<cnt<<endl;
  }
  }