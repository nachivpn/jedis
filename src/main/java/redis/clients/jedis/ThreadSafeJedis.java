/**
Contributors: Nachi
*/
package redis.clients.jedis;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Set;
import redis.clients.jedis.Jedis;

public class ThreadSafeJedis{

	JedisPool objectPool;
	JedisPoolConfig poolConfig;

	public ThreadSafeJedis(String host, int port) {
		objectPool = new JedisPool(host, port);
	}

	public ThreadSafeJedis(String host, int port, int timeout) {
		initializePoolConfig();
		objectPool = new JedisPool(poolConfig, host, port, timeout);
	}

	public ThreadSafeJedis(String host, int port, int timeout, String password) {
		initializePoolConfig();
		objectPool = new JedisPool(poolConfig, host, port, timeout, password);
	}

	public ThreadSafeJedis(URI uri) {
		objectPool = new JedisPool(uri);
	}

	public ThreadSafeJedis(URI uri, int timeout) {
		objectPool = new JedisPool(uri, timeout);
	}

	private void initializePoolConfig(){
		//TODO
	}
	
	public String set(final String key, String value) {
		Jedis client = objectPool.getResource();
		String response = client.set(key, value);
		client.close();
		return response;
	}

	public String get(final String key) {
		Jedis client = objectPool.getResource();
		String response = client.get(key);
		client.close();
		return response;
	}

	public Boolean exists(final String key) {
		Jedis client = objectPool.getResource();
		Boolean response = client.exists(key);
		client.close();
		return response;
	}

	public Long del(final String... keys) {
		Jedis client = objectPool.getResource();
		Long response = client.del(keys);
		client.close();
		return response;
	}

	public Long del(String key) {
		Jedis client = objectPool.getResource();
		Long response = client.del(key);
		client.close();
		return response;
	}

	public String type(final String key) {
		Jedis client = objectPool.getResource();
		String response = client.type(key);
		client.close();
		return response;
	}

	public Set<String> keys(final String pattern) {
		Jedis client = objectPool.getResource();
		Set<String> response = client.keys(pattern);
		client.close();
		return response;
	}

	public String randomKey() {
		Jedis client = objectPool.getResource();
		String response = client.randomKey();
		client.close();
		return response;
	}

	public String rename(final String oldkey, final String newkey) {
		Jedis client = objectPool.getResource();
		String response = client.rename(oldkey, newkey);
		client.close();
		return response;
	}

	public Long renamenx(final String oldkey, final String newkey) {
		Jedis client = objectPool.getResource();
		Long response = client.renamenx(oldkey, newkey);
		client.close();
		return response;
	}

	public Long expire(final String key, final int seconds) {
		Jedis client = objectPool.getResource();
		Long response = client.expire(key, seconds);
		client.close();
		return response;
	}

	public Long expireAt(final String key, final long unixTime) {
		Jedis client = objectPool.getResource();
		Long response = client.expireAt(key, unixTime);
		client.close();
		return response;
	}

	public Long ttl(final String key) {
		Jedis client = objectPool.getResource();
		Long response = client.ttl(key);
		client.close();
		return response;
	}

	public Long decr(final String key) {
		Jedis client = objectPool.getResource();
		Long response = client.decr(key);
		client.close();
		return response;
	}

	public Long incrBy(final String key, final long integer) {
		Jedis client = objectPool.getResource();
		Long response = client.incrBy(key, integer);
		client.close();
		return response;
	}

	public Long incr(final String key) {
		Jedis client = objectPool.getResource();
		Long response = client.incr(key);
		client.close();
		return response;
	}

	public Long hset(final String key, final String field, final String value) {
		Jedis client = objectPool.getResource();
		Long response = client.hset(key, field, value);
		client.close();
		return response;
	}

	public String hget(final String key, final String field) {
		Jedis client = objectPool.getResource();
		String response = client.hget(key, field);
		client.close();
		return response;
	}

	public Long hincrBy(final String key, final String field, final long value) {
		Jedis client = objectPool.getResource();
		Long response = client.hincrBy(key, field, value);
		client.close();
		return response;
	}

	public Boolean hexists(final String key, final String field) {
		Jedis client = objectPool.getResource();
		Boolean response = client.hexists(key, field);
		client.close();
		return response;
	}

	public Long hdel(final String key, final String... fields) {
		Jedis client = objectPool.getResource();
		Long response = client.hdel(key, fields);
		client.close();
		return response;
	}

	public Long hlen(final String key) {
		Jedis client = objectPool.getResource();
		Long response = client.hlen(key);
		client.close();
		return response;
	}

	public Set<String> hkeys(final String key) {
		Jedis client = objectPool.getResource();
		Set<String> response = client.hkeys(key);
		client.close();
		return response;
	}

	public Map<String, String> hgetAll(final String key) {
		Jedis client = objectPool.getResource();
		Map<String, String> response = client.hgetAll(key);
		client.close();
		return response;
	}

	public Long rpush(final String key, final String... strings) {
		Jedis client = objectPool.getResource();
		Long response = client.rpush(key, strings);
		client.close();
		return response;
	}

	public Long lpush(final String key, final String... strings) {
		Jedis client = objectPool.getResource();
		Long response = client.lpush(key, strings);
		client.close();
		return response;
	}

	public Long llen(final String key) {
		Jedis client = objectPool.getResource();
		Long response = client.llen(key);
		client.close();
		return response;
	}

	public List<String> lrange(final String key, final long start,
			final long end) {
		Jedis client = objectPool.getResource();
		List<String> response = client.lrange(key, start, end);
		client.close();
		return response;
	}

	public String lpop(final String key) {
		Jedis client = objectPool.getResource();
		String response = client.lpop(key);
		client.close();
		return response;
	}

	public String rpop(final String key) {
		Jedis client = objectPool.getResource();
		String response = client.rpop(key);
		client.close();
		return response;
	}

	public Long sadd(final String key, final String... members) {
		Jedis client = objectPool.getResource();
		Long response = client.sadd(key, members);
		client.close();
		return response;
	}

	public Set<String> smembers(final String key) {
		Jedis client = objectPool.getResource();
		Set<String> response = client.smembers(key);
		client.close();
		return response;
	}

	public Long srem(final String key, final String... members) {
		Jedis client = objectPool.getResource();
		Long response = client.srem(key, members);
		client.close();
		return response;
	}

	public Long scard(final String key) {
		Jedis client = objectPool.getResource();
		Long response = client.scard(key);
		client.close();
		return response;
	}

	public Boolean sismember(final String key, final String member) {
		Jedis client = objectPool.getResource();
		Boolean response = client.sismember(key, member);
		client.close();
		return response;
	}

	public Set<String> sunion(final String... keys) {
		Jedis client = objectPool.getResource();
		Set<String> response = client.sunion(keys);
		client.close();
		return response;
	}

	public Long sunionstore(final String dstkey, final String... keys) {
		Jedis client = objectPool.getResource();
		Long response = client.sunionstore(dstkey, keys);
		client.close();
		return response;
	}

	public String watch(final String... keys) {
		Jedis client = objectPool.getResource();
		String response = client.watch(keys);
		client.close();
		return response;
	}

	public void close() {
		objectPool.destroy();
	}

	public List<String> blpop(int timeout, String key) {
		Jedis client = objectPool.getResource();
		List<String> response = client.blpop(key, String.valueOf(timeout));
		client.close();
		return response;
	}

	public List<String> brpop(int timeout, String key) {
		Jedis client = objectPool.getResource();
		List<String> response = client.brpop(key, String.valueOf(timeout));
		client.close();
		return response;
	}


}
