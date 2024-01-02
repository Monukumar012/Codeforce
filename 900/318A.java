import java.util.*;

public class Main{

    static void solve(){
        long n=sc.nextLong(),k=sc.nextLong();

        long odd=(n+1)/2;
        if(odd>=k){
            System.out.println(2*(k-1)+1);
        }
        else System.out.println(2*(k-odd));
        
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}