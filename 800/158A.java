import java.util.*;

public class Main{

    // static void solve(){
    //     int n=sc.nextInt();
    //     int k=sc.nextInt();
    //     int arr[]=new int[n];
    //     for(int i=0;i<n;i++)arr[i]=sc.nextInt();
    //     int cnt=0;
    //     for(int e:arr){
    //         if(e==0)break;
    //         if(e>=arr[k-1])cnt++;
    //     }
    //     System.out.println(cnt);
    // }

    static void solve2(){
        int n=sc.nextInt();
        int k=sc.nextInt();
        int kth=0;
        for(int i=0;i<k;i++){
            kth=sc.nextInt();
            if(kth==0){
                System.out.println(i);
                return;
            }
        }
        int kNext=0;
        for(int i=k;i<n;i++){
            kNext=sc.nextInt();
            if(kth!=kNext){
                System.out.println(i);
                return;
            }
        }
        System.out.println(n);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve2();
    }
}