/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int temp=n;
	int rev=0;
	int rem=0;
	while(n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(rev==temp)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
    }
}
