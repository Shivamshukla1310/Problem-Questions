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
        // System.out.print("Enter K th Element: ");
        // int k = sc.nextInt();
        String Binary_num = Integer.toBinaryString(a);
        System.out.println("Binary Number: " + Integer.toBinaryString(a));
        int temp = 0;
        int count = 0;
        for(int i = 0; i < Binary_num.length(); i++){
            if(Binary_num.charAt(i) == '1'){
                count += 1;
            }
        }
        System.out.print("\nCount: " + count);
    }
}