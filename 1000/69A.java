import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int x=0,y=0,z=0;
        for(int i=0;i<n;i++){
            x+=sc.nextInt();
            y+=sc.nextInt();
            z+=sc.nextInt();
        }
        if(x==0 && y==0 && z==0){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}