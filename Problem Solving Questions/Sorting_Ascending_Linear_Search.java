import java.util.Scanner;

class Sorting_Ascending_Linear_Search{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n-1; i++){
            int sml = i;
            for(int j = i; j<n; j++){
                if(a[j]<a[sml]){
                    sml = j;
                }
            }
            a[i] = a[i] + a[sml];
            a[sml] = a[i] - a[sml];
            a[i] = a[i] - a[sml];
        }

        for(int i = 0; i < n; i++){
            System.out.print(a[i]);
        }
    }
}