import java.util.*;

public class Main{

    static void solve(){
        char s[]=sc.next().toCharArray();
        int n=s.length;
        String ans=""+s[0];
        
        for(int i=1;i<n-1;i+=2){
            ans+=s[i];
        }
        System.out.println(ans+s[n-1]);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}