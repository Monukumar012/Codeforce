import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=n-3;i++){
            if(arr[i]!=arr[i+1] && arr[i+1]!=arr[i+2]){
                System.out.println(i+2);
                break;
            }
            else if(arr[i]!=arr[i+1]){
                System.out.println(i+1);
                break;
            }
            else if(arr[i+1]!=arr[i+2]){
                System.out.println(i+3);
                break;
            }
        }
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}