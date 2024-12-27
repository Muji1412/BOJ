import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String result = "";
        
        for(int i = 0; i<a.length(); i++){
            char c = a.charAt(i);
            
            if('z'>=c && c>='a')
                result += (char) (c - 32);
            if('Z'>=c && c>='A')
                result += (char) (c + 32);                       
        }
        System.out.println(result);
        
    }
}