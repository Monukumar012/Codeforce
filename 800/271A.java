import java.util.*;

public class Main{

    static void solve(){
        int year=sc.nextInt();
        while(!isDistinct(++year)){}
        System.out.println(year);
    }

    static boolean isDistinct(int n){
        Set<Integer> set=new HashSet<>();
        while(n>0){
            set.add(n%10);
            n/=10;
        }
        return set.size()==4;
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}