public class DSA_Q5 {
	    public static int compress(char[] chars) {
	        int anchor = 0; // Start of the current group
	        int writeIndex = 0; // Index to write the compressed characters
	        
	        for (int readIndex = 0; readIndex < chars.length; readIndex++) {
	            // Check if it's the last character or a different character from the next one
	            if (readIndex + 1 == chars.length || chars[readIndex] != chars[readIndex + 1]) {
	                chars[writeIndex++] = chars[anchor]; // Write the character
	                
	                // Check if the group has more than one character
	                if (readIndex > anchor) {
	                    String count = String.valueOf(readIndex - anchor + 1); // Convert the count to string
	                    
	                    // Write each digit of the count
	                    for (char c : count.toCharArray()) {
	                        chars[writeIndex++] = c;
	                    }
	                }
	                
	                anchor = readIndex + 1; // Move the anchor to the start of the next group
	            }
	        }
	        
	        return writeIndex; // Return the new length of the compressed array
	    }
	    
	    public static void main(String[] args) {
	        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
	        int compressedLength = compress(chars);
	        
	        System.out.print("Compressed array: ");
	        for (int i = 0; i < compressedLength; i++) {
	            System.out.print(chars[i] + " ");
	        }
	    }
	}
