package nowcoder.pingan2020;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName Main02
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/27 16:59
 * @Version 1.0
 */
public class Main02 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.next();
        String str2=scanner.next();

        //小串在前面
        if(str1.length()>str2.length()){
            String temp=str2;
            str2=str1;
            str1=temp;
        }
        int n=str1.length();
        int m=str2.length();
        Set<String> set=new TreeSet<>();
        int flag=0;
        for(int i=n;i>0;i--){
            for(int j=0;j<n-i+1;j++){
                if(str2.contains(str1.substring(j,j+i))){
                    flag=1;
                    set.add(str1.substring(j,i+j));
                }
            }
            if(flag==1)break;
        }
        set.forEach(e->System.out.println(e));

    }
}
