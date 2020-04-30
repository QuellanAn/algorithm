package quellanan;

/**
 * @ClassName Main
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/30 13:08
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        int i,j=0;
        for( i=0;i<=10;++i){
            for( j=0;j<10;j++){
                if(i<5){
                    continue;
                }
                if(j>5){
                    break;
                }
            }
        }
        System.out.println(i+","+j);
    }
}
