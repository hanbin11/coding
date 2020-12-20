/**
 * @Description
 * @Author Hanbin
 * @Date 2020/11/20
 */
public class HungryExample {


    private static HungryExample hungryExample = new HungryExample();

        private HungryExample(){}

        public static HungryExample getInstance(){
            return hungryExample;
        }

}
