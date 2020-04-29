package nowcoder.huawei.day1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName Main
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/28 17:14
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            Set<Integer> set=new TreeSet<>();
            for(int i=0;i<n;i++){
                set.add(in.nextInt());
            }
            for(Integer val:set){
                System.out.println(val);
            }
        }
    }
}
