import java.util.*;

class Array_method{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[5];
      for(int i = 0; i < arr.length; i++){
        int n = sc.nextInt();
        arr[i] = n;
      }

      System.out.print(Arrays.toString(arr));
  }
}