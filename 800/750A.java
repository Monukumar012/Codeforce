import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt(),k=sc.nextInt();
        int t=240-k,time=0;
        for(int i=1;i<=n;i++){
            time+=5*i;
            if(time>t){
                System.out.println(i-1);
                return;
            }
        }
        System.out.println(n);
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}