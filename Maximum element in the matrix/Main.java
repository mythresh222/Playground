#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  std::cin>>r>>c;
  int a[r][c];
  int b[c];
  for(int i=1;i<=r;i++)
  {
    for(int j=1;j<=c;j++)
    {
      std::cin>>a[i][j];
     
    }
  }
  int cnt=0,l=0,v=0;
  for(int i=1;i<=c;i++)
  {
    for(int j=1;j<=r;j++)
    {
   if(a[j][i]>cnt)
   {
     cnt=a[j][i];
    
   }
    }
 }
  std::cout<<"The maximum element is "<<cnt<<endl;
}