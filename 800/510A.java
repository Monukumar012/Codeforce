import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt(),m=sc.nextInt();
        String ff="#";
        StringBuilder sb=new StringBuilder();
        while(m-->1){
            ff+='#';
            sb.append('.');
        }
        sb.append('#');
        for(int i=1;i<=n/2;i++){
            System.out.println(ff);
            System.out.println(sb);
            sb=sb.reverse();
        }
        System.out.println(ff);
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}