import java.util.*;

public class Main{

    static void solve(){
        String s=sc.next();
        Queue<Character> pq=new PriorityQueue<>((a,b)->a-b);
        int n=s.length();
        for(int i=0;i<n;i+=2)pq.add(s.charAt(i));

        while(!pq.isEmpty()){
            System.out.print(pq.poll());
            if(!pq.isEmpty())System.out.print('+');
        }
        System.out.println();
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // int t=sc.nextInt();
        // while(t-->0)
        solve();
    }
}