
package baitap;
import java.util.*;

public class TinhTong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextLong();
            System.out.println((1+n)*n/2);
            t--;
        }
    }
}
