import java.util.*;

public class Main{

    static void solve(){
        int n=8;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int f=(arr[1]*arr[2])/(arr[6]*arr[0]);
        int s=(arr[3]*arr[4])/(arr[0]);
        int t=(arr[5])/(arr[7]*arr[0]);
        System.out.println(Math.min(f,Math.min(s, t)));
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}