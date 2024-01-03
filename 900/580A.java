import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        
        // int i=0,j=1,max=1;
        // while(j<n){
        //     while(j<n && arr[j-1]<=arr[j])j++;

        //     max=Math.max(max,j-i);
        //     i=j;
        //     j++;
        // }
        // System.out.println(max);

        int cnt=0,max=1,pre=-1;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(pre>x)cnt=1;
            else cnt++;

            pre=x;
            max=Math.max(max,cnt);
        }
        System.out.println(max);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}