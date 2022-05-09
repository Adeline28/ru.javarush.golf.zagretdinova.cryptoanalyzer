import java.util.HashMap;

public class Encrypter extends Alphabet {

    // variables for Letters and Punctuation
    static HashMap<Character, Character> cryptoKeySet;

    public static char[] getCryptoPhraseArray() {
        return cryptoPhraseArray;
    }

    public static void setCryptoPhraseArray(char[] cryptoPhraseArr) {
        Encrypter.cryptoPhraseArray = cryptoPhraseArr;
    }

    //static char[] punctArray = Alphabet.getPunctArray();
    static char[] cryptoPhraseArray;


    public static char[] encrypt(String phrase) {
       cryptoKeySet = Alphabet.createCryptoHashMap(Key.getKEY());//создать
         char[] phraseArray = phrase.toUpperCase().toCharArray();
         cryptoPhraseArray = new char[phraseArray.length];


        // starting encrypting

        //1-Array Realisation
        for (int i = 0; i < phraseArray.length; i++) {
            if (cryptoKeySet.containsKey(phraseArray[i])) {
                cryptoPhraseArray[i] = cryptoKeySet.get(phraseArray[i]);
            } else {
                cryptoPhraseArray[i] = phraseArray[i]; //unknown symbols
                    }
                }



               // 2-Arrays realisation
//        for (int i = 0; i < phraseArray.length; i++) {
//            if (cryptoKeySet.containsKey(phraseArray[i])) {
//                cryptoPhraseArray[i] = cryptoKeySet.get(phraseArray[i]);
//            } else {
//                for (int j = 0; j < punctArray.length; j++) {
//                    if (phraseArray[i] == punctArray[j]) {
//                        cryptoPhraseArray[i] = punctArray[j];
//                        break;
//                    }
//                }
//            }
//        }
        System.out.println(cryptoPhraseArray);
        return cryptoPhraseArray;
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
