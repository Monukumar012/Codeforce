import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        String s=sc.next();
        if(s.contains("...")){
            System.out.println(2);
        }
        else{
            int cnt=0;
            for(char c:s.toCharArray()){
                if(c=='.')cnt++;
            }
            System.out.println(cnt);
        }
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}