package com.jdc.app;

public class OrderPair<K, V> implements Pair<K, V> {

	private K key;
	private V value;

	public OrderPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}

}
