package nowcoder.huawei.day2;

import java.util.Scanner;


/**
 * @ClassName Main_06
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/29 13:36
 * @Version 1.0
 */
public class Main_06 {

    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        String s=in.nextLine();
        String[] arr=s.split(" ");
        for(int i=arr.length-1;i>0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr[0]);
    }
}
