#include<iostream>
int gcd1(int x,int y,int z)
{
int small,gcd;
  if(x<y && x<z)
  small=x;
  else if(y<z)
    small=y;
   else
     small=z;
  while(small>=1)
  {
    if(x%small==0 &&y%small==0 && z%small==0)
    {
      gcd=small;
      break;
    }
    small--;
  }
}
int main()
{
int x,y,z,k;
std::cin>>x>>y>>z>>k;

  if(gcd1(x,y,z)==k)
    std::cout<<"Answer is correct.";
  else
    std::cout<<"Answer is wrong.";
  
}