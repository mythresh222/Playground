#include<iostream>
int fun(int x)
{
 
  if(x>=1)
    return  x*fun(x-1);
  else 
    return 1;
}
int main()
{
  //Type your code here.
  int x,z;
  std::cin>>x;
 z= fun(x);
  std::cout<<"The factorial of "<<x<<" is "<<z;
}