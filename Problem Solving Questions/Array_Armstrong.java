import java.util.*;

class Array_Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int armstrong = 0;
        System.out.println("Enter Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int length_arr = arr.length();

        for(int i = 0; i < n; i++){
            armstrong = armstrong + Math.pow(arr[i],length_arr);
        }

        System.out.println(armstrong);
    }
}