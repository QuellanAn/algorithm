package nowcoder.huawei.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @ClassName Main_01
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/29 11:09
 * @Version 1.0
 */
public class Main_01 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        Map<Integer,Integer> map= new TreeMap<>();
        for(int i=0;i<n;i++){
            int key=in.nextInt();
            int value=in.nextInt();
            if(map.containsKey(key)){
                value+=map.get(key);
            }
            map.put(key,value);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
