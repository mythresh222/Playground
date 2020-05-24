#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int x,l=0;
 std::cin>>x;
  for(int i=1;i<=x;i++)
  {
    if(i%2!=0)
    {
    for(int j=1;j<=x-1;j++)
    {
     std::cout<<i;
    }
      l=i+1;
  std::cout<<l;
  std::cout<<'\n';
    }

 else if(i%2==0)
    {
      l=i+1;
      std::cout<<l;
    for(int j=1;j<=x-1;j++)
    {
      std::cout<<i;
    }
std::cout<<'\n';
    }
   }
    return 0;
}