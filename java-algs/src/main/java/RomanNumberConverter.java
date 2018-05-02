import java.util.HashMap;

class RomanNumberConverter {

    private static HashMap<Character, Integer> toArabic = new HashMap<Character, Integer>();

    static {
        toArabic.put('I', 1);
        toArabic.put('V', 5);
        toArabic.put('X', 10);
        toArabic.put('L', 50);
        toArabic.put('C', 100);
        toArabic.put('D', 500);
        toArabic.put('M', 1000);
    }

    // assume that correct roman number is provided
    int convert(String romanNumber) {
        int last = toArabic.get(romanNumber.charAt(0));
        int acc = last;
        int temp;
        for (int i = 1; i < romanNumber.length(); i++) {
            temp = toArabic.get(romanNumber.charAt(i));
            if (last >= toArabic.get(romanNumber.charAt(i)))
                acc += temp;
            else
                acc +=  temp - 2*last;
            last = temp;
        }
        return acc;
    }

}

