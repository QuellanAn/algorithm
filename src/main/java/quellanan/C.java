package quellanan;

/**
 * @ClassName C
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/30 16:04
 * @Version 1.0
 */
public class C {

    public static void main(String[] args) {
        System.out.println(sum(4));

    }

    public static  int sum(int n){
        int result=0;
        for(int i=0;i<n;i++){
            switch (i){
                case 0:result+=1;
                case 1:result+=2;
                case 2:result+=3;
                break;
                case 3:result+=4;
                default:result+=5;
            }
        }
        return result;
    }
}
