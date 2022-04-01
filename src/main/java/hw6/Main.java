package hw6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "abcde";
        String newStr = "";
        char[] chars = str.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            newStr += chars[i];
        }
        System.out.println(newStr);
    }
}