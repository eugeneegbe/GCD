
package gcd;

import java.util.Scanner;

public class GCD {
    public static void main(String[]enow)
    {
        Scanner kevin=new Scanner(System.in);
         int a,b;
          String show;
       
        System.out.print("THIS IS A PROGRAM TO EVALUATE THE GREATEST COMMENT DIVISOR OF TWO NUMBERS\nFROM THE FUNCTION   GCD(a,b)");
        System.out.print("enter a value for 'a'\n");
        a=kevin.nextInt();
        System.out.print("Enter a value for 'b'\n");
        b=kevin.nextInt();
        Evaluate boy=new Evaluate();
         boy.initialise(a,b);
     
        System.out.printf("THE GREATEST COMMENT DIVISOR OF %d AND %d IS\n",a,b);
        System.out.printf("%d\n",boy.initialise(a,b));
          boy.notes();
          
    }
       
        
        
    }  
    

class Evaluate
{
     int get[]=new int[200];
     int R,Q,numb1,numb2;
     int big,smal;
     int U=2;
    public int initialise(int x,int y)
    {
      numb1=x;
      numb2=y;
     
      
      if(numb1>numb2)
      {
          get[0]=numb1;
          get[1]=numb2;
       } 
      else
      {
        get[0]=numb2;
        get[1]=numb1;
      }
       
      get[2]=(get[0]% get[1]);
     // get[3]=(get[0]-get[2])/get[1];  
       
      
      while(get[U]!=0)
      {
       get[U+1]=get[U-1] %get[U] ;
       U++;
  }        
          
      return get[U-1] ;  
             
     } 
   
          public void notes()
          {
            if(get[U-1]==1) 
            {
             System.out.printf("The numbers are set or pair of prime and \nthe inverse of %d is %d",get[0],get[1]) ;  
            }
          } 
          
} 
   
     