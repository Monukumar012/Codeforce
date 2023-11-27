import java.util.*;

public class Main{

    static void solve(){
        // char[] s=sc.next().toCharArray();
        // if("yY".indexOf(s[0])==-1 || "eE".indexOf(s[1])==-1 || "sS".indexOf(s[2])==-1 )
        //     System.out.println("NO");
        // else System.out.println("YES");

        String s=sc.next();

        if(s.equalsIgnoreCase("Yes"))System.out.println("YES");
        else System.out.println("NO");
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}