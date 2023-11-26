import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int dol[]={100,20,10,5,1};
        int i=0,cnt=0;
        while(n!=0){
            cnt+=n/dol[i];
            n%=dol[i++];
        }
        System.out.println(cnt);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}