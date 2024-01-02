import java.util.*;

public class Main{

    static void solve(){
        int s=sc.nextInt(),n=sc.nextInt();
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);

        for(int e[]:arr){
            if(e[0]>=s){
                System.out.println("NO");
                return;
            }
            s+=e[1];
        }
        System.out.println("YES");
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}