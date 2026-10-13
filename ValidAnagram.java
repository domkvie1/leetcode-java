import java.util.*;

public class ValidAnagram{ 
    public static void main(String[] args){
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        while(run){
            System.out.println("Give me two strings:");
            String s = sc.next();
            String t = sc.next();
            System.out.println("Count: " + isAnagramCount(s, t));
            System.out.println("Sort: " + isAnagramSort(s, t)); 
            System.out.println("Would you like to go again? (yes/no)");
            if(sc.next().equalsIgnoreCase("no")) run = false;
            }
        System.out.println("Have a great day:)");
    }
    public static boolean isAnagramCount(String s, String t){
        if(s.length() != t.length()) return false;
        s = s.toLowerCase();
        t = t.toLowerCase();
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(count[i] != 0) return false;
        }
        return true;
    }   
        
public static boolean isAnagramSort(String s, String t){
    if(s.length() !=t.length()) return false;
    // CLAUDE FIX: lowercase both so "Listen" and "Silent" match, same as the count method
    s = s.toLowerCase();
    t = t.toLowerCase();
    char[] a = s.toCharArray();
    char[] b = t.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    return Arrays.equals(a, b);
}
}
