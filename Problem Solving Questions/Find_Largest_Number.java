import java.util.Scanner;

class Find_Largest_Number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            int val = sc.nextInt();
            a[i] = val;
        }

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[i] > a[j]){
                    a[i] = a[j];
                }
            }

        }
        int largest = a.length;
        System.out.print(a[largest]);
    }
}