import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        String s=sc.next();
        int cnt=0;
        for(char c:s.toCharArray()){
            if(c=='A')cnt++;
            else cnt--;
        }
        if(cnt>0)System.out.println("Anton");
        else if(cnt<0) System.out.println("Danik");
        else System.out.println("Friendship");
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}