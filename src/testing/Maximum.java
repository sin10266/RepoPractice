/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;
import java.util.Scanner;

/**
 *
 * @author Manjot Singh - May 2020
 */
public class Maximum {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Integer : ");
        int integer_one = input.nextInt();
        
        System.out.print("Enter Second Integer : ");
        int integer_two = input.nextInt();
        
        max(integer_one, integer_two);
        
        System.out.println();
        
        System.out.print("Enter First Double : ");
        double double_one = input.nextDouble();
        
        System.out.print("Enter Second Double : ");
        double double_two = input.nextDouble();
        
        max(double_one, double_two);
    }
   
    public static void max(int i1, int i2)
    {
        if(i1 > i2)
        {
            System.out.println(i1 + " is maximum.");
        }   

        else
        {
            System.out.println(i2 + " is maximum.");
        }
    }

    public static void max(double d1, double d2)
    {
        if(d1 > d2)
        {
            System.out.println(d1 + " is maximum.");
        }
        
        else
        {
            System.out.println(d2 + " is maximum.");
        }
    }
}
