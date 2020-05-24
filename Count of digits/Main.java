#include<iostream>
int main()
{
  // Type your code here
  int n,i=0,x=0,l=0;
  std::cin>>n;
  do
  {
    i=i%10;
    l=l+1;
    n=n/10;
  }
  while(n>0);
  std::cout<<l;
}