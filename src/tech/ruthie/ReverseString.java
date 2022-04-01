package tech.ruthie;

public class ReverseString {
    public void reverseString(char[] s) {

        for (int i = 0; i < s.length/2; i++) {

            char char1 = s[i];
            char char2 = s[s.length - 1 - i];

            s[i] = char2;
            s[s.length - 1 - i] = char1;

        }
    }
}
