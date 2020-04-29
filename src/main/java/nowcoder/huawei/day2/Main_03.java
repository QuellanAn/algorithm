package nowcoder.huawei.day2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName Main_03
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/29 13:09
 * @Version 1.0
 */
public class Main_03 {


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s=in.nextLine();
        Set<Character> set =new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            set.add(c);
        }
        System.out.println(set.size());

    }
}
