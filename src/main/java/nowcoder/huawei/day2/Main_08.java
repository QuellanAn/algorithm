package nowcoder.huawei.day2;

import java.util.Scanner;

/**
 * @ClassName Main_08
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/29 13:57
 * @Version 1.0
 */
public class Main_08 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        while(n!=0){
            count++;
            n=n & (n-1);
        }
        System.out.println(count);
    }
}
