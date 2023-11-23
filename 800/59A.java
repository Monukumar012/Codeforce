import java.util.*;

public class Main{

    static void solve(){
        String s=sc.next();
        int up=0;
        for(char c:s.toCharArray()){
            if(c>'Z')up--;
            else up++;
        }
        if(up>0)s=s.toUpperCase();
        else s=s.toLowerCase();

        System.out.print(s);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}