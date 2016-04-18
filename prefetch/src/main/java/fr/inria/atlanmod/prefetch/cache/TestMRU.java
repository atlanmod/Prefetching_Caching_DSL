package fr.inria.atlanmod.prefetch.cache;

public class TestMRU {
	public static void main(String[] args) {
		MyMRUMap c = new MyMRUMap(3, 1);
		c.put("1", 1);
		c.put("2", 2);
		c.put("3", 3);
		c.get("2");
		System.out.println(c);
		c.put("4", 4);
		System.out.println(c);
		c.get("1");
		System.out.println(c);
		c.put("2", 2);
		System.out.println(c);
	}
}
