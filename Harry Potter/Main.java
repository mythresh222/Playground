#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,n,c,sum;
  std::cin>>x;
  n=x%10;
  y=x/1000;
  c=y%10;
  sum=c+n;
  std::cout<<sum;
  
}