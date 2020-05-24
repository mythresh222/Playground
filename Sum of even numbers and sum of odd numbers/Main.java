#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  //Type your code here.
  int b,cnt=0,cnt1=0;
   std::cin>>b;
  int a[b];
  
   for(int i=0;i<b;i++)
   {
    std::cin>>a[i];
    if(a[i]%2==0)
    cnt=a[i]+cnt;
   
     else
       cnt1=a[i]+cnt1;
       }
  std::cout<<"The sum of the even numbers in the array is "<<cnt<<'\n';
   std::cout<<"The sum of the odd numbers in the array is "<<cnt1;
  }
  
  
