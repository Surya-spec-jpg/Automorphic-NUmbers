//Print the 3rd positioned Automorphic number within the range
import java.util.Scanner;
public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit :");
        int u = sc.nextInt();
        int l = sc.nextInt();
        int loc=0;
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
                loc++;
                if(loc%3==0) {
                    System.out.println(dup);
                }
            }
        }
    }
}