import org.junit.Test;

import java.util.*;

/**
 * @autor cgl
 * @time 2016/6/2.
 * 作用:
 */
public class TestSet {

    @Test
    public void testS() {
        Set<String> sets = new HashSet<String>();
        sets.add("1");
        sets.add("2");
        sets.add("4");
        sets.add("3");
        sets.add("3");
//        for (String s:sets){
//            System.out.println(s);
//        }
        Iterator<String> iterator = sets.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test(){

    }
}
