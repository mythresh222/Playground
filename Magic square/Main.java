#include<iostream>
using namespace std;
int main()
{//Type your code here.
  int n,cnt=0; std::cin>>n;int arr[n][n];
  for(int i=1;i<=n;i++)
  {for(int j=1;j<=n;j++)
    { std::cin>>arr[i][j];}}
  int sum1=0;int sum2=0;
     for(int i=1;i<=n;i++){sum1=sum1+arr[i][i];
       sum2=sum2+arr[n-i+1][n-i+1];}
 if(sum1==sum2){
 for(int i=1;i<=n;i++) {int rowsum1=0,columnsum1=0;
 for(int j=1;j<=n;j++){
 rowsum1=rowsum1+arr[i][j];columnsum1=columnsum1+columnsum1+arr[j][i];}
  if(rowsum1==sum1 ||  columnsum1==sum1) cnt=cnt+1; }
 if(cnt==n)std::cout<<"Yes";
 else std::cout<<"No";
} }