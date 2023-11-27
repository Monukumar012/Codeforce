import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            if(arr[i]-arr[i-1]>1){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}