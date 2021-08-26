package Test;

/**
 * @author Xiong
 * @create 2021-08-15-15:50
 */
class Base {
    int count = 10;
    public void display() {
        System.out.println(this.count);
    }
}
public class Wolf {
    public static void main(String[] args){
        Sub s = new Sub();
        System.out.println(s.count);
        s.display();
        Base b = s;
        System.out.println(b == s);
        System.out.println(b.count);
        b.display();
    }
}

class Sub extends Base {
    int count = 20;
    public void display() {
        System.out.println(this.count);
    }
}

