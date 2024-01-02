import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int arr[]=new int[n];
        int suf=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            suf+=arr[i];
        }
        Arrays.sort(arr);
        int curr=0;
        for(int i=n-1;i>=0;i--){
            suf-=arr[i];
            curr+=arr[i];
            if(curr>suf){
                System.out.println(n-i);
                break;
            }
        }
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}