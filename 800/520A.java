import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        String s=sc.next();
        Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray()){
            if(c>'Z')c-=32;
            set.add(c);
        }
        // System.out.println(set);

        if(set.size()==26)
            System.out.println("YES");
        else System.out.print("NO");
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}