import java.util.*;

public class Main{

    static void solve(){
        int n=sc.nextInt();
        int cnt=0;
        while(n-->0){
            String s=sc.next();
            if("Tetrahedron".equals(s))cnt+=4;
            else if("Cube".equals(s))cnt+=6;
            else if("Octahedron".equals(s))cnt+=8;
            else if("Dodecahedron".equals(s))cnt+=12;
            else cnt+=20;

        }
        System.out.println(cnt);
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}