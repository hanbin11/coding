import java.util.Objects;

/**
 * @Description
 * @Author Hanbin
 * @Date 2020/11/20
 */
//懒汉模式
public class LazyExample {

    private static LazyExample lazyExample = null;

    private LazyExample() {
    }

    public static LazyExample getInstance() {

        if (Objects.isNull(lazyExample)) {

             lazyExample = new LazyExample();
        }

        System.out.println(lazyExample);
        return lazyExample;
    }

    public static void main(String[] args) {

        Thread thread1 = new ForTest();
        thread1.setName("小红");
        thread1.start();

        Thread thread2 = new ForTest();
        thread1.setName("小花");
        thread2.start();
    }
}



