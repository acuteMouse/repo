package com.classtrst;

public class Basess {
    private static String baseName = "base";

    public Basess() {
        callName();
    }

    public void callName() {
        System.out.println("super:"+baseName);

    }

    public static void main(String[] args) {
        Basess sub=new Sub();

        sub.callName();
    }
}

class Sub extends Basess {
    private  String baseName = "sub";

    public void callName() {
        System.out.println("suber:"+baseName);
    }
}
