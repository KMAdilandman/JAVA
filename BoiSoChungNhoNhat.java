/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;
import java.util.*;
import java.math.*;
/**
 *
 * @author khanh
 */
public class BoiSoChungNhoNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            BigInteger a=sc.nextBigInteger();
            BigInteger b=sc.nextBigInteger();
            BigInteger x =a.gcd(b);
            BigInteger y=a.multiply(b);
            BigInteger z=y.divide(x);
            System.out.println(z);
        }
    }
}
