package nowcoder.huawei.day2;

import java.util.Scanner;

/**
 * @ClassName Main_09
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/29 14:26
 * @Version 1.0
 */
public class Main_09 {


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        while(in.hasNextLine()){
            String s=in.nextLine();
            String[] arr=s.split(";");
            int x=0;
            int y=0;
            for(int i=0;i<arr.length;i++){
                String str=arr[i];
                try{
                    int temp= Integer.parseInt(str.substring(1));
                    char c=str.charAt(0);
                    if(c=='A'){
                        x=x-temp;
                    }else if(c=='D'){
                        x=x+temp;
                    }else if(c=='S'){
                        y=y-temp;
                    }else if(c=='W'){
                        y=y+temp;
                    }
                }catch (Exception e){
                }
            }
            System.out.println(x+","+y);
        }

    }
}
