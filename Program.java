/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.Scanner;


public class Program {

   
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int temp=0,n;
      while(a>0){
          n=a%10;
          temp=temp*10+n;
          a=a/10;
          
          
      }
        System.out.println("the reverse of a no:"+temp);
    }
}
