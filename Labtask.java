/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtask;
import java.util.*;
/**
 *
 * @author Malik Muneeb Shahid
 */
public class Labtask {
        public static int binaryconvert(int decimal){
            if (decimal == 0)  
            return 0;  
              
        else
          
        return (decimal % 2 + 10 *  
               binaryconvert(decimal / 2));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a decimal number ");
        int deci=s.nextInt();
        System.out.println("Binary number is :"+binaryconvert(deci));
   
    
}}
