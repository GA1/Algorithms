

public class TagSystem {
	
	boolean tendsToInfinity(String[] binaryNumber) {

		return false;
	}
}

//Tag systems. Write a program that reads in a binary string from the command line and applies the following (00, 1101) tag-system: 
//	if the first bit is 0, delete the first three bits and append 00; if the first bit is 1, delete the first three bits and append 1101. 
//	Repeat as long as the string has at least 3 bits. Try to determine whether the following inputs will halt or go into an infinite loop: 
//		10010, 100100100100100100. Use a queue.
