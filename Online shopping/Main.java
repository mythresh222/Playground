#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float amo_sh1,disc_1,ship_c1,amo_sh2,disc_2,ship_c2,amo_sh3,disc_3,ship_c3,x,y,z;
  std::cin>>amo_sh1>>disc_1>>ship_c1;
   std::cin>>amo_sh2>>disc_2>>ship_c2;
    std::cin>>amo_sh3>>disc_3>>ship_c3;
  x=(amo_sh1-(amo_sh1*(disc_1/100)))+ship_c1;
  y=(amo_sh2-amo_sh2*(disc_2/100))+ship_c2;
  z=(amo_sh3-amo_sh3*(disc_3/100))+ship_c3;
   std::cout<<"In Flipkart Rs."<<x<<'\n';
  std::cout<<"In Snapdeal Rs."<<y<<'\n';
  std::cout<<"In Amazon Rs."<<z<<'\n';
  if(x<=y && x<=z)
    std::cout<<"He will prefer Flipkart";
  else if(y<z)
     std::cout<<"He will prefer Snapdeal";
  else
    std::cout<<"He will prefer Amazon";
}