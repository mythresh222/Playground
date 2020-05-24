#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,n,c=0,y;
  std::cin>>x;
  y=x;
  while(x>0)
  {
    n=x%10;
     x=x/10;
    c=c+n;
   }
 
  if(y%c==0)
    std::cout<<"Harshad Number";
   else
     std::cout<<"Not Harshad Number";
}