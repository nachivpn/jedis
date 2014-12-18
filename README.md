#ThreadSafeJedis

Usage Options:

```java
    ThreadSafeJedis threadSafeJedis = new ThreadSafeJedis("host", 6379, "password");
```

```java
    JedisPoolConfig poolConfig = new JedisPoolConfig();
    poolConfig.setMaxTotal(500);
    ThreadSafeJedis threadSafeJedis = new ThreadSafeJedis(poolConfig, "host", 6379, "password");
```

..etc

The ```threadSafeJedis``` object is thread safe and can be used in a multi-threaded environment without having to worry about pool and resource management. This class is version-independant, and can be used with any version of Jedis by simply adding the [ThreadSafeJedis](https://github.com/nachivpn/jedis/blob/master/src/main/java/redis/clients/jedis/ThreadSafeJedis.java) class to the redis.clients.jedis package in main/java folder and re-building the source.  
