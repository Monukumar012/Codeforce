import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int f=0,s=0,i=0,j=n-1;
        boolean flag=true;
        while(i<=j){
            if(arr[i]>arr[j]){
                if(flag)f+=arr[i];
                else s+=arr[i];
                i++;
            }
            else{
                if(flag)f+=arr[j];
                else s+=arr[j];
                j--;
            }
            flag=!flag;
        }

        System.out.println(f+" "+s);
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}