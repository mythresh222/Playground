#include<iostream>
int main()
{
  int x,y,i,j=0,z=0;;
  std::cin>>x>>y;
  z=x+y;
  for(i=1;i<z;i++)
  {
    if(z%i==0)
    {
      j=j+i;
    }
  }
   
  if(j==z)
  {
    std::cout<<"They can read the message";
    }
  else
  {
   std::cout<<"They can't read the message"; 
  }
    
}