import java.util.*;
import java.util.regex.Pattern;


class A{
    int y = 5;
    public void test(){
        System.out.println("A's test");
    }
}
public class rough extends A{

    int y = 10;
    public void test(){
        System.out.println("R's test");
    }
    public static void main(String[] args) {
        rough r = new rough();
        System.out.println(r.y);
        r.test();
        A a = new rough();
        System.out.println(a.y);
        a.test();
    }
}

