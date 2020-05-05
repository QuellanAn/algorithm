package nowcoder.huawei.day4;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner in= new Scanner(System.in);
        while(in.hasNext()){
            String s=in.nextLine();
            s=s.replace("$"," ");
            s=s.replace("*"," ");
            s=s.replace("!"," ");
            s=s.replace("#"," ");
            String[] arr=s.split(" ");

            StringBuilder builder=new StringBuilder();
            for(int i=arr.length-1;i>=0;i--){
                if(!arr[i].equals("")){
                    builder.append(arr[i]+" ");
                }
            }
            String str=builder.substring(0,builder.length()-1);
            System.out.println(str);
        }


    }
}
