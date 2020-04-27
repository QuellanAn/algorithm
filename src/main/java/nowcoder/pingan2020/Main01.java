package nowcoder.pingan2020;

import java.util.Scanner;

/**
 * @ClassName Main01
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/27 16:47
 * @Version 1.0
 */
public class Main01 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
            sum+=arr[i];
        }
        if(sum%n>0){
            System.out.println(-1);
            return;
        }
        int pre=sum/n;
        int count=0;
        for(int i=0;i<n;i++){
            if(pre<arr[i]){
                int temp=arr[i]-pre;
                if(temp%2>0){
                    System.out.println(-1);
                    return;
                }
                count+=temp/2;
            }
        }
        System.out.println(count);

    }
}
