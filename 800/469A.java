import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int p=sc.nextInt();
        Set<Integer> set=new HashSet<>();
        while(p-->0)set.add(sc.nextInt());
        
        int q=sc.nextInt();
        while(q-->0)set.add(sc.nextInt());

        if(set.size()==n)System.out.println("I become the guy.");
        else System.out.println("Oh, my keyboard!");

    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}