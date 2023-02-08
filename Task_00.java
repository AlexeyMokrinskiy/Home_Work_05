import java.util.HashMap; 
import java.util.Map; 

/**
 Написать метод, который переведет число из римского формата записи в арабский.
Например, MMXXII = 2022
 */
public class Task_00 {

public static void main(String[] args) {
    
    System.out.println(romanToArabic("mmxxii"));
   
   }
    public static int romanToArabic(String input) { 
        String romanNumeral = input.toUpperCase(); 
        int result = 0; 
        Map<Character, Integer> map = new HashMap<>(); 
        map.put('I', 1); 
        map.put('V', 5); 
        map.put('X', 10); 
        map.put('L', 50); 
        map.put('C', 100); 
        map.put('D', 500); 
        map.put('M', 1000); 

        for (int i = romanNumeral.length() - 1; i >= 0 ; i--) {  
            char ch = romanNumeral.charAt(i);  
            int arabicValue = map.get(ch);   
                if (i > 0 && arabicValue > map.get(romanNumeral.charAt(i - 1))) {  
                    result -= arabicValue;  
                    } 
                else
                    result += arabicValue;  
        }
        return result;               
    }     
}

