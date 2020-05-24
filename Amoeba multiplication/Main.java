#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,first=0,second=1,t=0;
  std::cin>>x;
  if(x==first)
    std::cout<<"1";
  if(x==second)
    std::cout<<"2";
  for(int i=1;i<=x-2;i++)
  {
    t=first+second;
    first=second;
    second=t;
    }
  std::cout<<t;
   
  
}