 import java.util.HashMap;

public class Alphabet{
   //previous realization with separate arrays (for letters and punctuation)
    private static final String LETTERS_UPPERCASE_RU = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    public static final String PUNCTUATION = " ,.:?!\"";

    private static final char[] PUNCT_ARRAY = PUNCTUATION.toCharArray();


    //current realization with 1 array
    private static String alphabet = LETTERS_UPPERCASE_RU + PUNCTUATION;
    private static final char[] ALPHABET_WITH_PUNCT_RU = alphabet.toUpperCase().toCharArray();
    private static double length = ALPHABET_WITH_PUNCT_RU.length;


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
            cryptoKeySet.put(ALPHABET_WITH_PUNCT_RU[i], ALPHABET_WITH_PUNCT_RU[(int)((i + key) % length)]);
        }
        //previous realisation

//        for (int i = 0; i < length; i++) {
//            cryptoKeySet.put(LETTERS_ARRAY_RU[i], LETTERS_ARRAY_RU[(int)((i + key) % length)]);
//        }
//        for (int i = 0; i < length; i++) {
//            cryptoKeySet.put(LETTERS_ARRAY_RU[i], LETTERS_ARRAY_RU[(int)((i + key) % length)]);
//        }
        //ArrayList realisation
//        for (int i = 0; i < length; i++) {
//            cryptoKeySet.put(alphabetWithPunctRu.get(i), alphabetWithPunctRu.get((int) ((i + key) % length)));
//        }


//                                                for (var pair: cryptoKeySet.entrySet()) {
//                                                    System.out.println(pair.getKey() + " || " + pair.getValue());
//                                                }

return cryptoKeySet;
    }
}
