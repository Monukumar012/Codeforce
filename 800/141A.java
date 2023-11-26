import java.util.*;

public class Main{

    static void solve(){
        String s1=sc.next(), s2=sc.next();
        int map[]=new int[26];
        for(char c:s1.toCharArray()){
            map[c-'A']++;
        }
        for(char c:s2.toCharArray()){
            map[c-'A']++;
        }
        String s=sc.next();
        for(char c:s.toCharArray())map[c-'A']--;

        for(int e:map){
            if(e!=0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }


    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}