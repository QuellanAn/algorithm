package nowcoder.huawei.day3;

import java.util.Scanner;

public class Main_01 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            if(n==0){
                break;
            }
            int sum=0;
            while(n>1){
                int temp=n/3;
                int m=n%3;
                sum+=temp;
                n=temp+m;
                if(n==2){
                    sum++;
                    n--;
                }
            }
            System.out.println(sum);
        }

    }
}
