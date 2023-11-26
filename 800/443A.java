import java.util.*;

public class Main{

    static void solve(){
        String s=sc.nextLine();
        int n=s.length();
        Set<Character> set=new HashSet<>();

        for(int i=1;i<n-1;i+=3){
            set.add(s.charAt(i));
        }
        System.out.println(set.size());
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}