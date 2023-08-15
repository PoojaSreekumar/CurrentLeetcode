package com.interview.amazon;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomNote = "aa", magazine = "ab";
		System.out.println(canConstruct(ransomNote,magazine));
	}
	
	public static boolean canConstruct(String ransomNote, String magazine) {

        if(ransomNote.length()>magazine.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            if(map.containsKey(c)){
                if(map.get(c)>0){
                map.put(c,map.get(c)-1);
                }
            }
            

        }
        for(int i:map.values()){
            if(i>0){
                return false;
            }
        }
       return true;
    }

	
	
	///
	private Map<Character, Integer> makeCountsMap(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            int currentCount = counts.getOrDefault(c, 0);
            counts.put(c, currentCount + 1);
        }
        return counts;
    }
    
    
    public boolean canConstruct1(String ransomNote, String magazine) {
        
        // Check for obvious fail case.
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        // Make the count maps.
        Map<Character, Integer> ransomNoteCounts = makeCountsMap(ransomNote);
        Map<Character, Integer> magazineCounts = makeCountsMap(magazine);
        
        // For each unique character, c, in the ransom note:
        for (char c : ransomNoteCounts.keySet()) {
            // Check that the count of char in the magazine is equal
            // or higher than the count in the ransom note.
            int countInMagazine = magazineCounts.getOrDefault(c, 0);
            int countInRansomNote = ransomNoteCounts.get(c);
            if (countInMagazine < countInRansomNote) {
                return false;
            }
        }
        
        // If we got this far, we can successfully build the note.
        return true;
    }
}


/*
 *   
    // Please, if there's a nicer way of doing this, without getting tangled in
    // primitives vs Java's generics let me know in the article comments :-)
    private Stack<Character> sortedCharacterStack(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        Stack<Character> stack = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            stack.push(charArray[i]);
        }
        return stack;
    }
    
    
    public boolean canConstruct(String ransomNote, String magazine) {
        
        // Check for obvious fail case.
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        
        // Reverse sort the characters of the note and magazine, and then
        // put them into stacks.
        Stack<Character> magazineStack = sortedCharacterStack(magazine);
        Stack<Character> ransomNoteStack = sortedCharacterStack(ransomNote);
        
        // And now process the stacks, while both have letters remaining.
        while (!magazineStack.isEmpty() && !ransomNoteStack.isEmpty()) {
            // If the tops are the same, pop both because we have found a match.
            if (magazineStack.peek().equals(ransomNoteStack.peek())) {
                ransomNoteStack.pop();
                magazineStack.pop();
            } 
            // If magazine's top is earlier in the alphabet, we should remove that 
            // character of magazine as we definitely won't need that letter.
            else if (magazineStack.peek() < ransomNoteStack.peek()) {
                magazineStack.pop();
            }
            // Otherwise, it's impossible for top of ransomNote to be in magazine.
            else {
                return false;
            }
        }
                
        // Return true iff the entire ransomNote was built.
        return ransomNoteStack.isEmpty();
        
    }
    
    */
