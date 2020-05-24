#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int a[n],c=0;
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
      if(a[i]>c)
    {
      c=a[i];
    }
  }
  
  std::cout<<c;
  // Type your code here
}