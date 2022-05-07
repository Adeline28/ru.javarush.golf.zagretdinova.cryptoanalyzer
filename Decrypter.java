import java.util.HashMap;

public class Decrypter extends Alphabet {
    static char[] decryptoPhraseArray;

    public static void decrypt(int key) {
        key = -1 * key;
        double length = Alphabet.getLength();
        char[] cryptoPhraseArray = Encrypter.cryptoPhraseArray;
        HashMap<Character, Character> cryptoKeySet = Alphabet.createCryptoHashMap(-1 * key);
        char[] punctArray = Alphabet.getPunctArray();
        decryptoPhraseArray = new char[cryptoPhraseArray.length];


        while (key < 0) {
            key = (int) ((key + length*length)% length);
        }
        //starting decrypting
        for (int i = 0; i < cryptoPhraseArray.length; i++) {
            if (cryptoKeySet.containsValue(cryptoPhraseArray[i])) {
                for (var pair : cryptoKeySet.entrySet()) {
                    if(cryptoPhraseArray[i] == pair.getValue()) {
                        decryptoPhraseArray[i] = pair.getKey();
                    break;
                    }
                }
            }
            else {
                for (int j = 0; j < punctArray.length; j++) {
                    if (cryptoPhraseArray[i] == punctArray[j]) {
                        decryptoPhraseArray[i] = punctArray[j];
                        break;
                    }
                }
            }
//        for (int l = 0; l < cryptoPhraseArray.length; l++) {
            //System.out.println(cryptoPhraseArray);
//        }
        }
       System.out.println(decryptoPhraseArray);
    }

}
