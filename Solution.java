import java.io.*;
import java.util.*;
import java.io.*;

public class Solution {

    private static StringBuilder reverse;

	public static void main(final String[] args) {

        final Scanner sc = new Scanner(System.in);
        final String A = new String(sc.next());
        
        /* Enter your code here. Print output to STDOUT. */
        final StringBuilder B = new StringBuilder(A);
        reverse = B.reverse();
        if(A.equals(reverse))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        }

    }




