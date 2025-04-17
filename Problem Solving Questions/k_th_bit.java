// Check Kth bit
// flip Kth bit
// Set Kth bit 
// Unset Kth bit 

import java.util.Scanner;
// import java.Integer.*;

class k_th_bit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int a = sc.nextInt();
        System.out.print("Enter K th Element: ");
        int k = sc.nextInt();
        System.out.println("Binary Number: " + Integer.toBinaryString(a));
    }
}