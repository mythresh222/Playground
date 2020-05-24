#include<iostream>
using namespace std;
 int fun(int x,int y)
{
   if(y<=0)
     return 1;
   return x*fun(x,y-1);
}
int main()
{
  //Type your code here.
  int x,y,z;
  std::cin>>x>>y;
  std::cout<<"Enter the value of a"<<'\n';
  std::cout<<"Enter the value of n"<<'\n';
  z=fun(x,y);
  std::cout<<"The value of "<<x<<" power "<<y<<" is "<<z;
}