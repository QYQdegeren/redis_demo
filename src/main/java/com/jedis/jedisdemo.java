package com.jedis;

import redis.clients.jedis.Jedis;

public class jedisdemo {
    public static void main(String[] args) {
        //创建jedis对象
        Jedis jedis = new Jedis("192.168.253.130",6379);//会与端口号中的redis创建连接
        //测试,远程连接，需要修改linux中redis的的配置文件
        String ping = jedis.ping();
        System.out.println(ping);
    }

}
