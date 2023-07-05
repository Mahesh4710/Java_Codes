package com.hashtable;

import java.util.LinkedList;

public class HashTable {
	static class Pair{
		private int key;  //key=rollno
		private String value;  //value=name
		
		public Pair() {
			key=0;
			value="";
		}
		public Pair(int key,String value) {
			this.key=key;
			this.value=value;
		}
		@Override
		public String toString() {
			return "Pair [key=" + key + ", value=" + value + "]";
		}
		
	}
	private static final int SLOTS=10;
	private LinkedList<Pair>[] table;
	
	public int hash(int key) {
		return key %SLOTS;
	}
	
	public String HashTable() {
		table=new LinkedList[SLOTS];
		for(int i=0; i< SLOTS;i++) {
			table[i] =new LinkedList<>();
		}
		public void put(int key,String value) {
			
		}
		public String get(int key) {
			int slot=hash(key);
			
			LinkedList<Pair> bucket =table[slot];
			
			for(Pair pair:bucket) {
				if(key==pair.key)
					return pair.value;
			}
			
			return null;
		}
		
	}
}
