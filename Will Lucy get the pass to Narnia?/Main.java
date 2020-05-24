#include<iostream>
int main()
{
  int x,y,z;
  std::cout<<"Enter first number : Enter second number : Menu"<<'\n';
  std::cout<<"1.Addition"<<'\n'<<"2.Subtraction"<<'\n'<<"3.Multiplication"<<'\n';
   
  std::cout<<"4.Division"<<'\n'<<"5.Remainder"<<'\n';
  
  std::cin>>x>>y>>z;
  switch(z){
   
        case 1:std::cout<<x+y;
      break;
        case 2:std::cout<<x-y;
       break;
        case 3:std::cout<<x*y;
       break;
        case 4:std::cout<<x/y;
       break;
        case 5:std::cout<<x%y;
       break;
      default :std::cout<<"Invalid operation";

  }
}