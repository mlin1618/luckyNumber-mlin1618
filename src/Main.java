/**
 * Created by ml996 on 9/9/16.
 */


import java.util.Scanner;
import java.util.*;
public class temp {
    public static class perfectRandom{
        public String name;
        public int r;
        public perfectRandom(String s){
            name = s;
        }
        public int randomGen(){
            r = (int)(Math.pow( (int)(Math.random() * (Math.sqrt(Math.pow(2,31) - 1))), 2));
            return r;
        }
    }
    public static void main(String[] args){
        List<perfectRandom> a = new ArrayList<perfectRandom>();
        loop1:
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("What is your name?");
            String n = sc.nextLine();
            perfectRandom p = new perfectRandom(n);
            p.randomGen();
            a.add(p);
            System.out.println("Nice to meet you " + n + "! Your lucky number is " + p.r + ".");
            loop2:
            while(true) {
                System.out.println("Press 0 to exit, 1 for a listing of names, 2 to input another name.");
                int x = 0;
                try{
                    Scanner sc2 = new Scanner(System.in);
                    x = sc2.nextInt();
                }
                catch(Exception e){
                    System.out.println("Please enter a valid integer. ");
                    continue loop2;
                }
                if (x == 0) {
                    break loop1;
                } else if (x == 1) {
                    System.out.println("Name \t Number");
                    for (int i = 0; i < a.size(); i++) {
                        System.out.println(a.get(i).name + "\t\t" + a.get(i).r);
                    }
                    continue loop1;
                } else if (x == 2) {
                    continue loop1;
                } else {
                    System.out.println("Please enter a valid integer. ");
                }
            }
        }
    }
}
