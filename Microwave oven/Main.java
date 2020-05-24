#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int no;
  float time=0.00f,output=0.00f;
  std::cin>>no>>time;
  if(no==2)
  {
    output=time+time/2;
    std::cout<<output;
  }
  else if(no==3)
  {
    output=time*2;
    std::cout<<output;
     }
  else
    std::cout<<"Number of items is more";
}