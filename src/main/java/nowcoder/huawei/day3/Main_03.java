package nowcoder.huawei.day3;

import java.util.Scanner;

public class Main_03 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int[] arr=new int[26];

            String str=in.next();
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                arr[c-'a']++;
            }
            int min=20;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0 && arr[i]<min){
                    min=arr[i];
                }
            }

            for(int i=0;i<arr.length;i++){
                if(arr[i]==min){
                    String c= (char) (i+'a')+"";
                    str=str.replace(c,"");
                }
            }
            System.out.println(str);




        }



    }
}
