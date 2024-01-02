import java.util.*;
 
public class Main{
 
    static void solve(){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int q=sc.nextInt();
        while(q-->0){
            int m=sc.nextInt();
            System.out.println(upperBound(arr,m,n));
        }
    }

    static int upperBound(int arr[], int x, int n){
        int l=0,h=n-1;

        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]>x)h=m-1;
            else l=m+1;
        }
        return Math.max(l,0);
    }
 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}