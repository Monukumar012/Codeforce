import java.util.*;

public class Main{

    static void solve(){
        String s=sc.next();

        String ans=s.replaceAll("WUB", " ").trim().replaceAll(" +", " ");
        System.out.println(ans);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}