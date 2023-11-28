import java.util.*;

public class Main{

    static void solve(){
        
        int cnt=0,tim=sc.nextInt();
        for(int i=0;i<3;i++){
            if(sc.nextInt()>tim)cnt++;
        }
        System.out.println(cnt);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}