#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  std::cout<<"Enter the number of elements in the array"<<endl;
  std::cout<<"Enter the elements in the array"<<endl;
    std::cout<<"Enter the location where you wish to insert an element"<<endl;
   
  int n,p,l;
  std::cin>>n;
  int a[n],b[n];
  for(int i=1;i<=n;i++)
  {
    std::cin>>a[i];
    b[i]=a[i];
  }
  std::cin>>p;
  std::cin>>l;
  b[p]=l;
  for(int j=p;j<=n+1;j++)
  {
    b[j+1]=a[j];
  }
  if(p<=n)
  {
     std::cout<<"Enter the value to insert"<<endl;
    std::cout<<"Array after insertion is"<<endl;
  
   for(int i=1;i<=n+1;i++)
  {
     std::cout<<b[i]<<endl;
   }
  }
  else
    std::cout<<"Invalid Input";
}