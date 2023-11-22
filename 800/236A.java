import java.util.*;

public class Main{

    static void solve(){
        String s=sc.next();
        Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray())set.add(c);
        if(set.size()%2!=0)
            System.out.println("IGNORE HIM!");
        else System.out.print("CHAT WITH HER!");
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}