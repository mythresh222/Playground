#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,target=0,cnt=0;
  std::cin>>x;
  while(x>target)
  {
    std::cin>>y;
    target=target+y;
    cnt=cnt+1;
  }
  std::cout<<"The number of turns is "<<cnt;
  
}