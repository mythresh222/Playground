#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,l=0,v=0,cnt1=0,k=0,cnt2=0,v1=0;
  std::cin>>r>>c;
  int a[r][c],cnt=0;
  int b[c],x[r];
for(int i=1;i<=r;i++)
  {
    cnt=0;
    for(int j=1;j<=c;j++)
    {
      std::cin>>a[i][j];
      cnt=cnt+a[i][j];
    }
   v1=cnt;
    x[i]=cnt;

    if(v1>k)
    {
      k=v1;
      cnt2++;
        }
  }
   std::cout<<"Sum of rows is ";
  for(int i=1;i<=r;i++)
  {
    std::cout<<x[i]<<" ";
  }
   std::cout<<endl; 
  std::cout<< "Row "<<cnt2<<" has maximum sum";
std::cout<<endl; 
  for(int i=1;i<=c;i++)
  {
    cnt=0;
    for(int j=1;j<=r;j++)
    {
   cnt=cnt+a[j][i];
   }
    l=cnt;
    b[i]=cnt;
    if(l>v)
    {
      v=l;
      cnt1++;
      
    }
    
   }
   std::cout<<"Sum of columns is ";
  for(int i=1 ;i<=c;i++)
  {
    std::cout<<b[i]<<" ";
  }
   std::cout<<endl; 
  std::cout<<"Column "<<cnt1 <<" has maximum sum";
 
}