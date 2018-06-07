/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0738043_mad3464_midterm;

/**
 *
 * @author macstudent
 */
public class BinaryToDecimal {
    
    public int BinarytoDecimal(int binary)
    {
    
        int decimal = 0;
        int power =0;
        
  
     while (true)
     {
         if (binary == 0)
         {
             break;
         }
             else
             {
                      int temp = binary%10;
                     decimal += temp*Math.pow(2,power);
                     binary = binary/10;
                     power++;
                     }
       
     }
     return decimal;
     }

}


