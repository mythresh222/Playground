#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
 int x,y,z=1,last,k,sum1,cnt=0,cnt1=0,x1,y1;
  float first;
 std::cin>>x;
  x1=x;
 y=x*x;
  y1=y;
  while(x1>0)
  {
    cnt1=cnt1+1;
    x1=x1/10;
  }  
   while(y1>0)
  {
    cnt=cnt+1;
    y1=y1/10;
  }  
k=cnt-cnt1;
  for(int i=1;i<=cnt1;i++)
  {
    z=z*10;
  }
  last=y%z;
  z=1;
 for(int i=1;i<=k;i++)//struck
  {
    z=z*10;
  }
  first=y/z;
sum1=(first+last);
 
  if(x==sum1)
  {
    std::cout<<"Kaprekar Number";
     
  }
  else
    
  std::cout<<"Not a Kaprekar Number";
}