import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt(),m=sc.nextInt();
        int arr[]=new int[m];
        for(int i=0;i<m;i++)arr[i]=sc.nextInt();
        Arrays.sort(arr);

        int i=0,j=n-1,min=(int)1e9;
        while(j<m){
            min=Math.min(min,arr[j++]-arr[i++]);
        }
        System.out.println(min);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}