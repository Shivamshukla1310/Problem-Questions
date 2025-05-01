import java.util.*;

public class Rain_Trapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // number of test cases

        while (T-- > 0) {
            int N = sc.nextInt();  // number of towers
            int[] height = new int[N];
            
            for (int i = 0; i < N; i++) {
                height[i] = sc.nextInt();
            }

            System.out.println(trapWater(height, N));
        }
        sc.close();
    }

    static int trapWater(int[] height, int n) {
        if (n <= 2) return 0;

        int[] left = new int[n];
        int[] right = new int[n];
        int water = 0;

        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        for (int i = 0; i < n; i++) {
            water += Math.min(left[i], right[i]) - height[i];
        }

        return water;
    }
}
