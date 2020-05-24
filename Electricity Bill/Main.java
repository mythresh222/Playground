#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int x,y;
  std::cin>>x;
  if(x<=200)
  {
    y=(0.5*x);
    std::cout<<"Rs."<<y;
  }
    else if(x<=400)
    {
      y=(0.65*x+100);
    std::cout<<"Rs."<<y;
    }
  else if(x<=600)
  {
    y=(0.80*x+200);
    std::cout<<"Rs."<<y;
  }
    else if(x>600)
    {
      y=(1.25*x+425);
     std::cout<<"Rs."<<y;
    }
  
}