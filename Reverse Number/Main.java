#include <iostream>
int main() 
{
	// Type your code here
  int n,i=0,x;
  std::cin>>n;
  while(n>0)
  {
    x=n%10;
    i=i*10+x;
    n=n/10;
    }
  std::cout<<i;
	return 0;
}