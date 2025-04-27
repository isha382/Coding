import java.util.Scanner;
public class Hashing
{
    public static void main(String[] args) {
        String s = "abcacbdef";
        int hash[] = new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)- 'a']++;
        }
        Scanner sc =new Scanner(System.in);
        int q;
        q = 3;
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0);
            // fetch:
            System.out.println(hash[c - 'a']);

    }
}
}

