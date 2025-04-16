// Linear Search Basics

import java.util.Scanner;

class Find_Target{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter Target: ");
        int target = sc.nextInt();
        for(int i = 0; i < n; i++){
            int val = sc.nextInt();
            a[i] = val;
        }
        for(int j=0; j<=a.length - 1; j++){
            if(target == a[j]){
                System.out.print(j + "\n");
                break;
            }
            else{
                System.out.print(-1);
            }
        }

    }
}