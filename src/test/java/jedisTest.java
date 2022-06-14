import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

public class jedisTest {

    @Test
    public void test1(){

        //创建jedis对象
        Jedis jedis = new Jedis("192.168.253.130",6379);//会与端口号中的redis创建连接

        Set<String> keys = jedis.keys("*");//获得redis中所有的key
        for (String key : keys) {

            System.out.println(key);
        }
    }

    @Test
    public void testset(){
        //创建jedis对象
        Jedis jedis = new Jedis("192.168.253.130",6379);//会与端口号中的redis创建连接

        jedis.set("name","zhangsan");


        jedis.mset("k1","v1","k2","v2");//设置多个值


    }

    @Test
    public void testget(){
        //创建jedis对象
        Jedis jedis = new Jedis("192.168.253.130",6379);//会与端口号中的redis创建连接

        String name = jedis.get("name");//或取key值
        Long name1 = jedis.ttl("name");//获取键的存活时间
        Boolean name2 = jedis.exists("name");//判断key是否存在着
        List<String> mget = jedis.mget("k1", "k2");//获得多个key值
        for (String s : mget) {
            System.out.println(s);
        }
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
    }
}
