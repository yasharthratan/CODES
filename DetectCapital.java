import java.io.*;
import java.util.*;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        boolean check, check2;
        check = Character.isUpperCase(word.charAt(0));
        String caps = word.substring(1).toUpperCase();
        String small = word.substring(1).toLowerCase();
        check2 = word.substring(1).equals(caps)||word.substring(1).equals(small);
        if(check && check2)return true;
        else if(!check && word.substring(1).equals(small))return true;
        return false;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(buffer.readLine());
        while (t-- > 0) {
            String inp = buffer.readLine();
            System.out.println(new DetectCapital().detectCapitalUse(inp));
        }
        System.out.println(sb);
    }
}
