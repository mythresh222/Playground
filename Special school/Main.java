#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int cnt=0,s=0,cnt1;
  char a[50],b[50];
  std::cin.getline(a,50);
 std::cin.getline(b,50);
 while(a[cnt]!='\0')
  {
    cnt++;
  }
  cnt1=cnt-1;
  for(int i=0;i<=cnt-1;i++)
  {
    if(a[i]==b[cnt1])
   {
     s=s+1;
      
    }
    cnt1--;
  }
    if(s==cnt)
    std::cout<<"It is correct";
  else
     std::cout<<"It is wrong";
  
  
}