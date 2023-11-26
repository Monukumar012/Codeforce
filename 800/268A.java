import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int cnt=0;
        for(int e:a){
            for(int ee:b){
                if(e==ee)cnt++;
            }
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