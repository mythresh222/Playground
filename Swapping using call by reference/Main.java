#include<iostream>
void fun(int &a,int &b)
{
  std::cout<<"After swapping a= "<<b<<" and b="<<a;
}

int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b<<'\n';
  fun(a,b);
}