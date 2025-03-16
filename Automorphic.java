//Print the Automorphic numbers within the range
import java.util.Scanner;
public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit :");
        int u = sc.nextInt();
        int l = sc.nextInt();
        for (int i = u; i <= l; i++) {
            int n = i;
            long sq = (long) n * n;
            int dup = n;
            int count = 0;
            while (n > 0) {
                n = n / 10;
                count++;
            }
            long value = sq % (long) Math.pow(10, count);
            if (value == dup) {
                System.out.println(dup);
            }
        }
    }
}
