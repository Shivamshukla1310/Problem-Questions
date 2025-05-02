import java.util.Scanner;

class Array_Reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int arr[] = new int[n];


        System.out.println("Enter Array Elements: ");
        for(int i = n - 1; i > 0; i--){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + "");
        }
    }
}