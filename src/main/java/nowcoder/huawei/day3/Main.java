package nowcoder.huawei.day3;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        while(in.hasNext()){
            String str=in.next();
            StringBuilder builder= new StringBuilder();
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                if(c>=65 && c<90){
                    char c1= (char) (c+32+1);
                    builder.append(c1);
                }else if(c==90){
                    builder.append("a");
                }else if( c>=97 && c<=99){
                    builder.append(2);
                }else if(c>=100 && c<=102){
                    builder.append(3);
                }else if(c>=103 && c<=105){
                    builder.append(4);
                }else if(c>=106 && c<=108){
                    builder.append(5);
                }else if(c>=109 && c<=111){
                    builder.append(6);
                }else if(c>=112 && c<=115){
                    builder.append(7);
                }else if(c>=116 && c<=118){
                    builder.append(8);
                }else if(c>=119 && c<=122){
                    builder.append(9);
                }else {
                    builder.append(c);
                }
            }

            System.out.println(builder.toString());
        }
    }
}
