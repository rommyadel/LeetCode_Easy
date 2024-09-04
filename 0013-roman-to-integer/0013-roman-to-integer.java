class Solution {
    public int romanToInt(String s) {
        //Step 1. Set up a HashMap
       Map<Character, Integer> romanToInt = new HashMap<>();
       romanToInt.put('I', 1);
       romanToInt.put('V', 5);
       romanToInt.put('X', 10);
       romanToInt.put('L', 50);
       romanToInt.put('C', 100);
       romanToInt.put('D', 500);
       romanToInt.put('M', 1000);

        //Step 2: Convert the string into a character array
       char [] romanChars = s.toCharArray();
        int total = 0;


        //Step 3: Iterate through the array and do the actual conversion. 
       for (int i = 0; i < romanChars.length; i++){
        int current = romanToInt.get(romanChars[i]);
        if (i < romanChars.length-1 && current < romanToInt.get(romanChars[i+1])){
            total -= current;
        }else{
            total+=current;
        }
       }
       return total;
    }

}