package com.tmobile.digital.aeolus;

import redis.clients.jedis.Jedis;

public class Aeolus {

	public Aeolus() {
		try {
			Jedis jedis = new Jedis("red2.f3gq02.clustercfg.use1.cache.amazonaws.com"); 
			System.out.println("Connection to server sucessfully"); 
			System.out.println("Server is running: " + jedis.ping());
			//red2.f3gq02.clustercfg.use1.cache.amazonaws.com:6379
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Aeolus();

	}

}
