package com.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//An Anagram is a word or phrase formed by rearranging the letters of a
//different word or phrase, typically using all the original letters exactly
//once.
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
public class AnagramsGrouping {

	public static void main(String[] args) {
		String[] s = { "eat", "tea", "tan", "ate", "nat", "bat" };
		Map<String,List<String>> hm=new HashMap<>();
		for (int i = 0; i < s.length; i++) {
			char[] p=s[i].toCharArray();
			Arrays.sort(p);
			String g=new String(p);
			if(hm.containsKey(g)) {
				hm.get(g).add(s[i]);
			}
			else {
				List<String> l=new ArrayList<>();
				l.add(s[i]);
				hm.put(g, l);
			}
		}
		for(String q:hm.keySet()) {
			//if(hm.get(q).size()>1) {
			System.out.print(hm.get(q));
		//}
		}
}}