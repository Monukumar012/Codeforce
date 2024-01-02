import java.util.*;

public class Main{

    static void solve(){
        // char s[]=sc.next().toCharArray();
        // char hello[]="hello".toCharArray();
        // int n=s.length;

        // int i=0,j=0;
        // while(i<n && j<5){
        //     if(s[i]==hello[j])j++;
        //     i++;
        // }
        // if(j==5){
        //     System.out.println("YES");
        // }
        // else System.out.println("NO");

    // second
        String s=sc.next();
        String hello=".*h.*e.*l.*l.*o.*";
        if(s.matches(hello)){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}