import java.util.Scanner;

class Find_Largest_Number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int largest = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > a[0]){
                largest = i;
            }
        }
        System.out.print("Largest index: " + largest);
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < i; j++){
        //         if(a[i] > a[j]){
        //             a[i] = a[j];
        //         }
        //     }

        // }
        // int largest = a.length;
        // System.out.print(a[largest]);
    }
}