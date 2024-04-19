package com.suda.generic_record;

public record Pair<K,V> (K key,V value) implements Show {

	@Override
	public void display() {
	System.out.println("Record implements interface "+key()+" "+value);
		
	}

}
