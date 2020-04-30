package quellanan;

/**
 * @ClassName A
 * @Description DOTO
 * @Author zhulinfeng
 * @Date 2020/4/30 14:32
 * @Version 1.0
 */
public class A {

    public static void main(String[] args) throws Exception {

        Thread threads1=new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.print("A");
                }
            });
        Thread threads2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("B");
            }
        });

        Thread threads3=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("C");
            }
        });
        threads1.run();
        threads2.start();
        threads3.start();

        threads3.join(10);
        System.out.print("D");
    }
}
