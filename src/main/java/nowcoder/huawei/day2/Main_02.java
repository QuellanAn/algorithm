package nowcoder.huawei.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * @ClassName Main_02
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/29 11:30
 * @Version 1.0
 */
public class Main_02 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        while(n!=0){
            int temp=n%10;
            if(!map.containsKey(temp)){
                sum=sum*10+temp;
                map.put(temp,temp);
            }
            n=n/10;
        }
        System.out.println(sum);
    }
}
