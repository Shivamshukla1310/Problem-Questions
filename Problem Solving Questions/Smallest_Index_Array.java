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
        int smallest = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < a[0]){
                smallest = i;
            }
        }
        System.out.print("Smallest index: " + smallest)
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

// a = a + b = 2 + 3 = 5
// b = a - b = 5 - 2 = 3
// a = a - b = 5 - 3 = 2