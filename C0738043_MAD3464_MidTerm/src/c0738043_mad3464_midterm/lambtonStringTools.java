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
public class lambtonStringTools {
         
    
    

    static int p;
    static int c = 0;
    static int res;

     static void reverse(String s)
     {
    char ch[] = new char[s.length()];
    for(p = 0;p < s.length();p++)
    {
        ch[p] = s.charAt(p);
        }
    for(p=s.length()-1;p>=0;p--){
        System.out.print(ch[p]);
        }
        
}
}



