//checking anagram of two string
/*
 * LOGIC:
 *     FIRST CHECK THE LENGTH OF STRING
 *     IF EQUAL LENGTH THEN CALL FUNCTION ISANAGRAM OTHERWISE RETURN FALSE
 *     IN ANAGRAM FUNCTION
 *     FIRST SORT BOTH THE STRINGS
 *     THEN CHECK IF MISMATCH OF CHARACTER FOUND RETURN FALSE OR RETURN TRUE MEANS ANAGRAM
 input format
 2
 abcd acbd
 xsd asd
 
 output:
 YES
 NO
 */

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    //private static Scanner sc1;
	//private static Scanner sc;
	
    // CHECKING ANAGRAM IF LENGTH OF BOTH THE STRING IS SAME
	static boolean isAnagram(char[] A, char[] B) {
        boolean flag = true;
        Arrays.sort(A);      // SORT THE STRING
        Arrays.sort(B);
        
        // IF ANY CHARACTER MISMATCH IS FOUND THEN RETURN FLASE MEANS NOT ANAGRAM ELSE RETURN TRUE
        for(int i = 0; i < A.length; i++) {
            if(A[i] != B[i]) {
                flag = false;
            }
        }
        
        return flag;
    }
  
    public static void main(String[] args) {
    
      Scanner  sc = new Scanner(System.in);
        int T= sc.nextInt();		//FIRST LINE INPUT NUMBER OF TEST CASES
        while(T-->0){
        Scanner	sc1 = new Scanner(System.in);
            String A = sc1.next();       //FIRST STRING
            String B= sc1.next();		//SECOND STRING
        
            boolean result;
	        if(A.length() == B.length()){    //CHECKING THE LENGTH OF STRING IF BOTH ARE SAME LENGTH THEN CHECK FOR ANAGRAM
	             result=isAnagram(A.toLowerCase().toCharArray(), B.toLowerCase().toCharArray());
	            }
	            else{
	            	result=false;
	            }
        System.out.println( (result) ? "YES" : "NO" );    //PRINTING RESULT
        }
    }
}
