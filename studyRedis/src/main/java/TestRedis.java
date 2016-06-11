import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

/**
 * @autor cgl
 * @time 2016/5/31.
 * 作用:联系redis的用法
 */

public class TestRedis {
    private Jedis jedis;

    @Before
    public void getRedisConnection() {
        jedis = new Jedis("127.0.0.1", 6379);
//        jedis.auth()
    }

    @Test
    /**
     * redis 列表操作
     * l**
     */
    public void testList() {
        jedis.del("users"); //删除key=users
        jedis.lpush("users", "a"); //在列表头添加一条数据
        jedis.lpush("users", "bb");
        jedis.rpush("users", "ccc");//在列表尾添加一条数据
        jedis.lrem("users", -1, "a");//lrem(key,count,value),在key中删除 count 个value, count >0,从头开始，count<0，从尾开始，count=0，删除全部
        System.out.println(jedis.lrange("users", 0, 5));
        System.out.println("列表长度为：》》》" + jedis.llen("users"));
        jedis.lpush("letees", "a");
//        String firstOfUsers=jedis.lpop("users");
//        Assert.assertEquals("not equal","bb",firstOfUsers);
    }

    /**
     * 操作字符串
     */
    @Test
    public void testString() {
        jedis.set("work", "worker");//设置string类型，
        jedis.setnx("work", "cook");//key存在则不复制，work依然是worker
        jedis.setex("phone", 4, "135");//第二个参数为key的有效期，单位为秒
        System.out.println(jedis.exists("work"));//简单key是否存在
//        jedis.del("work");//删除key
//        System.out.println(jedis.exists("work")); //
//        try {
//            Thread.sleep(5000l);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        设置的有效期为4秒，线程停顿5秒之后，输出null
        System.out.println(jedis.get("phone"));
        jedis.mset("1", "a", "2", "b");
        jedis.append("1", "aaa");
        System.out.println(jedis.get("1"));//aaaa
        System.out.println(jedis.strlen("1"));//长度4
        //redis.clients.jedis.exceptions.JedisDataException: ERR value is not an integer or out of range
//        System.out.println(jedis.incr("1"));
    }

    /**
     * redis操作hash
     * h**
     */
    @Test
    public void testHash() {
        jedis.hset("user", "age", "14");//hash,想法：这个可以把java对象放到内存中，key=对象，field=属性，value=属性值.
//        redis.clients.jedis.exceptions.JedisDataException: ERR Operation against a key holding the wrong kind of value
//        jedis.hset("age","number","123");//key是另一个key的field，报错如上
        System.out.println(jedis.hget("user", "age"));
        System.out.println(jedis.hexists("user", "age"));//验证hash是否含有field，ture
        System.out.println(jedis.hexists("user", "agea"));//false
        System.out.println("filed数量===" + jedis.hlen("user"));//key含有的field数量
        Set<String> keys = jedis.hkeys("user"); //field不允许重复
        for (String key : keys) {
            System.out.println(key);
        }
        List<String> values = jedis.hvals("user"); //value允许重复
        for (String val : values) {
            System.out.println(val);
        }
    }

    /**
     * redis--set
     */
    @Test
    public void testSet() {
        jedis.sadd("list", "a", "b", "c");
        jedis.sadd("set", "a", "e", "r");
        System.out.println(jedis.scard("list"));//数量
//        Set<String> diffs = jedis.sdiff("list", "set");//在前者中，返回前者有，后者没有的元素
        Set<String> diffs = jedis.sdiff("set", "list");
        for (String diff : diffs) {
            System.out.println(diff);
        }
        jedis.srem("list", "a");//remove
        System.out.println(jedis.smembers("list").size());//all
    }

    /**
     * redeis--sortedset
     */
    @Test
    public void testSortedSet() {
        jedis.zadd("zset", 1, "aa");
        jedis.zadd("zset", 2.5, "bb");
        jedis.zadd("zset", 4, "dd");
        jedis.zadd("zset", 5, "ee");
        jedis.zadd("zset", 3, "cc");
//        Set<String> zsets=jedis.zrange("zset",1,4);//返回第start--end个的元素，与scoue无关
        jedis.zrem("zset","aa");//移出某个元素
        Set<String> zsets = jedis.zrangeByScore("zset", 0, 2);//返回start<=score<=end的元素
        for (String set : zsets) {
            System.out.println(set);
        }
        System.out.println(jedis.zcard("zset"));
    }
}
