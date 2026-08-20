package STRINGS;
import java.util.*;

public class MICRON {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      String str= sc.nextLine();

      System.out.println(S(str)) ;
    }

    static String S(String str){
      String res="";

      str=str.replaceAll("[^A-Za-z]","");

      res=str;
      return res;
    }


}