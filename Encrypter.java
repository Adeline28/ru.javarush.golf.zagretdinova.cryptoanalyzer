import java.util.HashMap;

public class Encrypter extends Alphabet {

    // variables for Letters and Punctuation
    static HashMap<Character, Character> cryptoKeySet = Alphabet.createCryptoHashMap(Key.getKEY());//создать геттер для мапы
    static char[] punctArray = Alphabet.getPunctArray();
    static char[] cryptoPhraseArray;


    public static char[] encrypt(String phrase) {
         char[] phraseArray = phrase.toUpperCase().toCharArray();
         cryptoPhraseArray = new char[phraseArray.length];


        // starting encrypting
        for (int i = 0; i < phraseArray.length; i++) {
            if (cryptoKeySet.containsKey(phraseArray[i])) {
                cryptoPhraseArray[i] = cryptoKeySet.get(phraseArray[i]);
            } else {
                for (int j = 0; j < punctArray.length; j++) {
                    if (phraseArray[i] == punctArray[j]) {
                        cryptoPhraseArray[i] = punctArray[j];
                        break;
                    }
                }
            }
        }
        System.out.println(cryptoPhraseArray);
        return cryptoPhraseArray;
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
