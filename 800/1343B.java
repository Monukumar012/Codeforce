import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        if((n/2)%2!=0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
            int sum=0,num=2;
            for(int i=0;i<n/2;i++){
                System.out.print(num+" ");
                sum+=num;
                num+=2;
            }
            num=1;
            for(int i=1;i<n/2;i++){
                System.out.print(num+" ");
                sum-=num;
                num+=2;
            }
            System.out.println(sum);
        }
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        solve();
    }
}