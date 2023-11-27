import java.util.*;

public class Main{

    static void solve(){
        int arr[]=new int[3];
        for(int i=0;i<3;i++)arr[i]=sc.nextInt();
        Arrays.sort(arr);
        if(arr[2]==arr[1]+arr[0]){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}