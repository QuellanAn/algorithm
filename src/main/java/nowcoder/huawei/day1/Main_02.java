package nowcoder.huawei.day1;

import java.util.Scanner;

/**
 * @ClassName Main_02
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/28 19:31
 * @Version 1.0
 */
public class Main_02 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        while(in.hasNext()){
            String s=in.next().substring(2);

            System.out.println(Integer.parseInt(s,16));
        }
    }
}
