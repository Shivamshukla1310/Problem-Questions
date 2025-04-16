import java.util.Scanner;

class Ascending_Array_Bubble_Sort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < a.length; i++){
            for(int j = i; j < n; j++){
                if(a[i] > a[j]){
                    a[i] = a[j];
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(a[i]);
        }
    }
}
