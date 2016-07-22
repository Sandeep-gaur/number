/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package san;

import java.util.Scanner;


public class San {

   
    public static void main(String[] args) {
        System.out.println("enter the string");
       Scanner s=new Scanner(System.in);
       String s1=s.nextLine();
       String s2=new StringBuffer(s1).reverse().toString();
        System.out.println("the reverse of string is:" +s2);
        char c;
        String s3="";
        int l=s2.length();
        for(int i=0;i<l-1;i++){
            c=s2.charAt(i);
    if(c=='a'|c=='A'|c=='e'|c=='E'|c=='i'|c=='I'|c=='o'|c=='O'|c=='u'|c=='U'){
                s2=s2.replace(c,' ');
    }
    else{
                  s3=s3+c;
    }}
                System.out.println("the string without vowels are" +s3);
       
              
    }
}
    