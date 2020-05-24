#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,cnt=0;
  std::cin>>x;
 while(x>1)
  {
   if(x%2==0)
    {
      std::cout<<x<<'\n';
      x=x/2;
     cnt=cnt+1;
     
    }
  else  if(x%2!=0)
    {
     std::cout<<x<<'\n';
      x=3*x+1;
    cnt=cnt+1;
      }
  }
  std::cout<<"1"<<'\n';
   std::cout<<cnt;
}