package nowcoder.huawei.day2;

import java.util.*;

/**
 * @ClassName Main_07
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/29 13:42
 * @Version 1.0
 */
public class Main_07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n=in.nextInt();
        Map<String,Integer> map =new TreeMap<>();
        for(int i=0;i<n;i++){
            String str=in.next();
            int count=1;
            if(map.containsKey(str)){
                count+=map.get(str);
            }
            map.put(str,count);
        }
        for(Map.Entry<String ,Integer> entry:map.entrySet()){
            for(int i=0;i<entry.getValue();i++){
                System.out.println(entry.getKey());
            }
        }
    }
}
