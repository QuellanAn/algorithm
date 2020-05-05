package nowcoder.huawei.day4;

import java.util.Scanner;


public class Main_01 {


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            System.out.println(help(n));
        }



    }

    public static int help(int n){
        if(n<=2){
            return 1;
        }else {
            return help(n-1)+help(n-2);
        }
    }


}
