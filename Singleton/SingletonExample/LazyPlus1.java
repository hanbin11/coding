/**
 * @Description
 * @Author Hanbin
 * @Date 2020/11/20
 */
//加锁
public class LazyPlus1 {


        private static LazyPlus1 lazyPlus1;

        private LazyPlus1(){}

        public static synchronized LazyPlus1 getInstance(){
            if(lazyPlus1 ==null){
                lazyPlus1 =new LazyPlus1();
            }
            return lazyPlus1;
        }

}
