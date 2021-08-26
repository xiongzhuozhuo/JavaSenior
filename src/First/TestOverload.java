package First;

/**
 * @author Xiong
 * @create 2021-08-15-11:46
 */
public class TestOverload {
    public void test(String[] msg){
        System.out.println("含字符串数组参数的test方法 ");
    }
    public void test1(String book){
        System.out.println("****与可变形参方法构成重载的test1方法****");
    }
    public void test1(String ... books){
        System.out.println("****形参长度可变的test1方法****");
    }
    public static void main(String[] args){
        TestOverload to = new TestOverload();
        //下面两次调用将执行第二个test方法
        to.test1();
        to.test1("aa" , "bb");
        //下面将执行第一个test方法
        to.test1(new String[]{"aa"});
    }

}
