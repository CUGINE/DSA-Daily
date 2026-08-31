package AMCAT;

import java.util.*;

class Q15 {

    static char mostFrequentVowel(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {

            if ("aeiou".indexOf(ch) != -1) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        char answer = 'a';
        int max = 0;

        for (char ch : map.keySet()) {

            if (map.get(ch) > max) {
                max = map.get(ch);
                answer = ch;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(mostFrequentVowel(str));
    }
}
