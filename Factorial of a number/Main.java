#include<iostream>
int main(){
  // factorial
  int n,i,x=1;
  std::cin>>n;
  for(i=n;i>=1;i--)
  {
    x=x*i;
  }
  std::cout<<x;
}