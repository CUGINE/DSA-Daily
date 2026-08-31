package AMCAT;

import java.util.*;

class Q13 {

    static int count(String s) {

        int count = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isLetterOrDigit(ch)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(count(s));
    }
}
