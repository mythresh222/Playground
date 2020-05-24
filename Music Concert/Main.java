#include<iostream>
#include<cstdlib>
int main(){
  // Type your code here
  int n,cnt=0,cnt1=0;
  std::cin>>n;
  int *p;
  p=(int *)calloc(n,sizeof(int));
  for(int i=0;i<n;i++)
  {
    std::cin>>*(p+i);
   }
   for(int i=0;i<n;i++)
   {
     if((*(p+i))%2==0)
     {
       cnt=cnt+1;
     }
     else
       cnt1=cnt1+1;
   }
 
  std::cout<<cnt1<<'\n';
  std::cout<<cnt;
   free(p);
  p=NULL;
  return 0;
}