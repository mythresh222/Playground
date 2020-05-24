#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,x1,l=0,n,cnt=0,cnt1=0;
  std::cin>>x;
  x1=x;
  while(x1>0)
  {
    l=l+1;
    x1=x1/10;
  }
  for(int i=1;i<=l;i++)
  {
    if(i%2==0)
    {
      n=x%10;
      cnt=cnt+n;
      x=x/10;
   }
     if(i%2!=0)
     {
       n=x%10;
      cnt1=cnt1+n;
      x=x/10;
     }
   }
  
   if(cnt==cnt1)
     std::cout<<"Yes";
  else
    std::cout<<"No";
}