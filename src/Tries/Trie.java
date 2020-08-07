package Tries;

public class Trie {
	
	static class TrieNode{
		
		//Each node has 26 possibilities
		TrieNode[] children = new TrieNode[26];
		
		//Check if a particular node is the end
		boolean isEnd;
		 
		TrieNode() {
			isEnd = false;
			for(int i= 0;i < 26; i++) {
				children[i] = null;
			}
		}
	}
	
	static TrieNode curr;

	static void insert(String word) {
			
		TrieNode crawler = curr;
		for(int i= 0;i < word.length(); i++) {
			int index = word.charAt(i) - 'a';
			if(crawler.children[index] == null) {
				crawler.children[index] = new TrieNode();
			}
			crawler = crawler.children[index];
		}
		
		crawler.isEnd = true;
	}
	
	static boolean search(String word) {
		TrieNode crawler = curr;
		for(int i= 0;i < word.length(); i++) {
			int index = word.charAt(i) - 'a';
			if(crawler.children[index] == null) {
				return false;
			}
			crawler = crawler.children[index];
		}
		
		if(crawler != null && crawler.isEnd) {
			return true;
		}
		return false;
	}
	
	 public static void main(String args[]) 
	    { 
	        // Input keys (use only 'a' through 'z' and lower case) 
	        String keys[] = {"the", "a", "there", "answer", "any", 
	                         "by", "bye", "their"}; 
	       
	        String output[] = {"Not present in trie", "Present in trie"}; 
	       
	       
	        curr = new TrieNode(); 
	       
	        // Construct trie 
	        int i; 
	        for (i = 0; i < keys.length ; i++) 
	            insert(keys[i]); 
	       
	        // Search for different keys 
	        if(search("the") == true) 
	            System.out.println("the --- " + output[1]); 
	        else System.out.println("the --- " + output[0]); 
	          
	        if(search("these") == true) 
	            System.out.println("these --- " + output[1]); 
	        else System.out.println("these --- " + output[0]); 
	          
	        if(search("their") == true) 
	            System.out.println("their --- " + output[1]); 
	        else System.out.println("their --- " + output[0]); 
	          
	        if(search("thaw") == true) 
	            System.out.println("thaw --- " + output[1]); 
	        else System.out.println("thaw --- " + output[0]); 
	         
	    } 
	} 
