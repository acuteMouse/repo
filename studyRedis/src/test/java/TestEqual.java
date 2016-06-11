/**
 * @autor cgl
 * @time 2016/6/1.
 * 作用:
 */
public class TestEqual {
    public static boolean equal(String s) {
        if (!"".equals(s)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(equal(new String("")));
        String s=null;
        System.out.println(equal(s));
    }
}
