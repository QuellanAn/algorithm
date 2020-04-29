package nowcoder.huawei.day1;

import java.util.Scanner;

/**
 * @ClassName Main_03
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/28 19:37
 * @Version 1.0
 */
public class Main_03 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        long ulDataInput=in.nextLong();
        System.out.println(getResult(ulDataInput));
    }
    public static String getResult(long ulDataInput){
        StringBuffer result=new StringBuffer();
        int i=2;
        while(i<= ulDataInput){
            if(ulDataInput % i==0){
                result.append(i+" ");
                ulDataInput=ulDataInput/i;
            }else {
                i++;
            }

        }

        return result.toString();
    }


}
