#include<iostream>
using namespace std;
int fun( int n,int*a)
{
  int cnt=0,cnt1=0;
  for(int i=1;i<=n;i++)
  {
    if(a[i]%2==0)
    {
      cnt=cnt+1;
    }
    else 
    {
      cnt1=cnt1+1;
   }
  }
  if(cnt==n)
    return 1;
  else if(cnt1==n)
      return 2;
  else
     return 3;
}
int main()
{
  //Type your code here.
  std::cout<<"Enter the number of elements in the array"<<endl;
  std::cout<<"Enter the elements in the array"<<endl;
  int n,p,l;
  std::cin>>n;
  int a[n];
  for(int i=1;i<=n;i++)
  {
    std::cin>>a[i];
  }
  l= fun(n,a);
  if(l==1)
    std::cout<<"The array is Even";
  else if(l==2)
    std::cout<<"The array is Odd";
  else
    std::cout<<"The array is Mixed";
}
 
  
  