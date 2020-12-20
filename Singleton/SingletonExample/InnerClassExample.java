/**
 * @Description
 * @Author Hanbin
 * @Date 2020/11/20
 */
//静态内部类
public class InnerClassExample {

    private InnerClassExample() {
    }

    private static InnerClassExample instatnce;

    private static class SingletonHolder {
        private static InnerClassExample instatnce = new InnerClassExample();
    }

    public static InnerClassExample getInstance() {
        return SingletonHolder.instatnce;
    }
}
