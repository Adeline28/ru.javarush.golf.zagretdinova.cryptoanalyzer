import java.util.HashMap;

public class Alphabet{
    private static final String LETTERS_UPPERCASE_RU = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String PUNCTUATION = " ,.:?!\"";

    private static final char[] PUNCT_ARRAY = PUNCTUATION.toCharArray();
    private static final char[] LETTERS_ARRAY_RU = LETTERS_UPPERCASE_RU.toCharArray();

    private static double length = LETTERS_ARRAY_RU.length;


    //getter for length
    public static double getLength() {
        return length;
    }

//getter for PUNCT_ARRAY
    public static char[] getPunctArray() {
        return PUNCT_ARRAY;
    }



    public static HashMap<Character, Character> createCryptoHashMap(int key) {
        //создание шифрованного алфавита
        HashMap<Character,Character> cryptoKeySet = new HashMap<>();
        //System.out.println("Key is " + key);


        //check key status
        while (key < 0) {
            key = (int) (key + length*length);
        }

        for (int i = 0; i < length; i++) {
            cryptoKeySet.put(LETTERS_ARRAY_RU[i], LETTERS_ARRAY_RU[(int)((i + key) % length)]);
        }
//                                                for (var pair: cryptoKeySet.entrySet()) {
//                                                    System.out.println(pair.getKey() + " || " + pair.getValue());
//                                                }

return cryptoKeySet;
    }



}
