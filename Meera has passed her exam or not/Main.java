#include<iostream>
int main()
{
  // Type your code here
  int n,x,cnt;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  std::cin>>x;
   for(int i=0;i<n;i++)
  {
     if(a[i]==x)
     {
       std::cout<<"She passed her exam";
       cnt=cnt+1;
     }
   }
  if(cnt==0)
  {
    std::cout<<"She failed";
  }
}