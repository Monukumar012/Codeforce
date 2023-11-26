import java.util.*;

public class Main{

    static void solve(){
        int arr[]=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int a=arr[3]-arr[0];
        int b=arr[2]-a;
        int c=arr[1]-a;
        System.out.println(a+" "+b+" "+c);
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}