import java.util.*;

public class Main{

    static void solve(){
        String s=sc.next();
        int cnt=0;
        for(char c:s.toCharArray()){
            if(c=='4' || c=='7')cnt++;
        }
        if(cnt==4 || cnt==7)System.out.println("YES");
        else System.out.println("NO");
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}