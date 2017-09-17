package com.paymoon.basic.commons.core;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public final class RedisString {
	private static JedisPool pool;
	private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
    	String testString = MyProp.getVariable("redis.password");
    	String testString2 = MyProp.getVariable("redis.port");
//    	System.out.println(tesredis.porttString);
//    	System.out.println(testString2);
    	
	}
    
}
