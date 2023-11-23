import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        String s=sc.next();

        int same=0;
        for(int i=1;i<n;i++){
            if(s.charAt(i-1)==s.charAt(i))same++;
        }
        System.out.print(same);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}