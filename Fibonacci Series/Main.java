#include<iostream>
int fun(int x)
{
 if(x<=1)
   return x;
  return (fun(x-1)+fun(x-2));
 }
int main()
{
  //Type your code here.
  int x,z;
  std::cin>>x;
  int n=x-1;
  z=fun(n);
  std::cout<<"The term "<<x<<" in the fibonacci series is "<<z;
}