#include<iostream>
int main()
         {
  int x,y,n=0,l=0,j=0;
  std::cin>>x>>y;
  for(int i=x;i<=y;i++)
  {
    n=0;
  for(int k=1;k<i;k++)
    {
    if(i%k==0)
        {
       n=n+k;
    }
    }
    if(i==n)
      std::cout<<i<<" ";
  
     
 }
}