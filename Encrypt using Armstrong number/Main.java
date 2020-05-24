#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int x=n,l=0,c=0,p,z=0,k=n;
    while(x>0)
    {
     l=x%10;
     c=c+1;
    x=x/10;
    }
  for(int i=1;i<=c;i++)
  {
    l=n%10;
    p=power(l,c);
    z=z+p;
    n=n/10;
  }
  
  if(z==k)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}