import java.util.Scanner;

class Minimum_on_right{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < n; j++){
                arr1[i] = Math.max(arr[i],arr[j]);
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}