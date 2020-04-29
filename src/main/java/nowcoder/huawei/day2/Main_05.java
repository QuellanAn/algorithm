package nowcoder.huawei.day2;

import java.util.Scanner;

/**
 * @ClassName Main_05
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/29 13:28
 * @Version 1.0
 */
public class Main_05 {


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        String s=in.next();

        StringBuilder stringBuilder=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            stringBuilder.append(s.charAt(i));
        }
        System.out.println(stringBuilder.toString());
    }


}
