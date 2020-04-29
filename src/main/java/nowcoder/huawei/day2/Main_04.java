package nowcoder.huawei.day2;

import java.util.Scanner;

/**
 * @ClassName Main_04
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/29 13:24
 * @Version 1.0
 */
public class Main_04 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        StringBuilder s=new StringBuilder();
        while(n!=0){
            s.append(n%10);
            n=n/10;
        }
        System.out.println(s.toString());
    }
}
