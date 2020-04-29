package nowcoder.huawei.day1;


import java.util.Scanner;

/**
 * @ClassName Main_01
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/28 19:14
 * @Version 1.0
 */
public class Main_01 {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.next();
            int n=s.length();
            while(n>8){
                System.out.println(s.substring(0,8));
                s=s.substring(8);
                n=s.length();
            }
            if(n==0){
                return;
            }
            String temp=s;
            for(int i=0;i<8-n;i++){
                temp+="0";
            }
            System.out.println(temp);
        }
    }
}
