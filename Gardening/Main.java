#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z;
  std::cin>>x>>y>>z;
  if(x+1<=z && z<=2*x)
  {
    std::cout<<"It is a mango tree";
  }
  else if((x*y-2*x)<=z&& z<=(x*y-x))
  {
   std::cout<<"It is a mango tree"; 
  }
  else
  {
    std::cout<<"It is not a mango tree";
  }
  
}