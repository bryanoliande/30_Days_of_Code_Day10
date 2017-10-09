import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int getConsecutiveOnesBinary(int n) {
        int maxOnes = 0;
        int currentOnes = 0;
        
        while(n > 0) {
            if(n % 2 == 1){
                currentOnes += 1;
                if(currentOnes > maxOnes) {
                    maxOnes = currentOnes;
                }
            }
           else {
                    currentOnes = 0;
                }
           n /= 2;
        }
        
        return maxOnes;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(getConsecutiveOnesBinary(n));
    }
}