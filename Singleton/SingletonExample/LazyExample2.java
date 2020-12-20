/**
 * @Description
 * @Author Hanbin
 * @Date 2020/11/20
 */
//双重检验加锁
public class LazyExample2 {


        private static volatile LazyExample2 hungruExample2;

        private LazyExample2(){}

        public static LazyExample2 getInstance(){
            if(hungruExample2==null){
                //只有当第一次访问的时候才会使用synchronized关键字
                synchronized (LazyExample2.class){
                    if (hungruExample2 == null) {

                        hungruExample2 = new LazyExample2();
                    }
                }
            }
            return hungruExample2;
        }
}
