/**
 * Created by ml996 on 9/26/16.
 */
import java.util.*;
public class twip2 {
    public static char[] sort(char[] a){
        char[] n = a;
        for(int i = 0; i < n.length-1; i++){
            for(int j = 0; j < n.length-1; j++){
                if(n[j+1] < n[j]){
                    char temp = n[j+1];
                    n[j+1] = n[j];
                    n[j] = temp;
                }
            }
        }
        return n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String a = sc.nextLine().replaceAll("\\s", "");
        System.out.println("Enter second string: ");
        String b = sc.nextLine().replaceAll("\\s", "");
        char[] a1 = a.toLowerCase().toCharArray();
        char[] b1 = b.toLowerCase().toCharArray();
        if(Arrays.equals(sort(a1), sort(b1))){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
