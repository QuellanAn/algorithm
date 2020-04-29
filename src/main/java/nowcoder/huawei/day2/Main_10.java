package nowcoder.huawei.day2;

import java.util.Scanner;

/**
 * @ClassName Main_10
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/29 14:57
 * @Version 1.0
 */
public class Main_10 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while (in.hasNextLine()){
            String str=in.nextLine();
            if(str.length()<=8){
                System.out.println("NG");
            }else{
                int[] cla = new int[4];
                for(int i=0;i<str.length();i++){
                    char ch=str.charAt(i);
                    if(ch>='0'&&ch<='9'){
                        cla[0]=1;
                    }else if(ch>='a'&&ch<='z'){
                        cla[1]=1;
                    }else if(ch>='A'&&ch<='Z'){
                        cla[2]=1;
                    }else{
                        cla[3]=1;
                    }
                }
                if(cla[0]+cla[1]+cla[2]+cla[3]<3){
                    System.out.println("NG");
                }else{
                    System.out.println(isHasSubString(str));
                }

            }
        }

    }
    private static String isHasSubString(String str) {
        for (int i = 0; i < str.length() -3; i++) {
            String str1=str.substring(i,i+3);
            String str2=str.substring(i+3, str.length());
            if(str2.contains(str1))
                return "NG";
        }
        return "OK";
    }
}
