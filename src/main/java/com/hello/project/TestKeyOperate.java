package com.hello.project;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestKeyOperate {
    static Jedis jedis = new Jedis("127.0.0.1", 6379);

    public static void main(String[] args) {
        jedis.auth("myredis");
        System.out.println("Redis Server Started. " + jedis.ping());
        jedis.flushDB();
    }

    @Test
    public void setTest() {
        jedis.auth("myredis");
        String key = jedis.set("company", "itcast");
        System.out.println(key);
    }

    @Test
    public void msetTest() {
        jedis.auth("myredis");
        String mkey = jedis.mset("brand1", "heima", "brand2", "chuanzhihui", "brand3", "kudingyu", "brand4", "boxuegu", "brand5", "czzzxy", "brand6", "yuanxiaobang");
        System.out.println(mkey);
    }

    @Test
    public void keysTest() {
        jedis.auth("myredis");
        Set<String> keys = jedis.keys("*");
        Iterator<String> itKeys = keys.iterator();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            System.out.println(key);
        }
    }

    @Test
    public void mgetTest() {
        jedis.auth("myredis");
        List<String> values = jedis.mget("brand1", "brand3", "brand");
        for(String value : values) {
            System.out.println(value);
        }
    }

    @Test
    public void existTest() {
        jedis.auth("myredis");
        Boolean result1 = jedis.exists("company");
        Boolean result2 = jedis.exists("brand0");
        System.out.println(result1 + "-----" + result2);
    }

    @Test
    public void renameTest() {
        jedis.auth("myredis");
        String rename = jedis.rename("company", "companyNew");
        System.out.println(rename);
    }

    @Test
    public void delTest() {
        jedis.auth("myredis");
        Long result = jedis.del("companyNew");
        System.out.println(result);
    }
}
