import java.math.BigInteger;
import java.util.*;
import java.io.*;

class A extends temp{
    public void foo(){
        System.out.println("fo");
    }
}

public class temp {
    public void foo(){
        System.out.println("base");
    }

    public static void main(String[] args) {
        A a = new A();
        a.foo();

    }
}
