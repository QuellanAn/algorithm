package nowcoder.pingan2020;

import java.util.Scanner;

/**
 * @ClassName Main
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/27 16:39
 * @Version 1.0
 */


public class Main {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.next();
        String s2=scanner.next();

        while(!s1.isEmpty() && !s2.isEmpty() &&s1.length()==s2.length()){
            String temp=s1.substring(0,1);
            s1=s1.replace(temp,"");
            s2=s2.replace(temp,"");
        }
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
