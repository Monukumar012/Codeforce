import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            ans[x-1]=i+1;
        }
        for(int e:ans){
            System.out.print(e+" ");
        }
        System.out.println();
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}