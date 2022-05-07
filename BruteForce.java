import java.util.HashMap;

public class BruteForce {

    static char[] phraseToBruteForce;
    static String arrToString;
    static String[] wordsFromArr;
    static String[] wordsFromArrWithNoPunct;

    //static char[] guessDecryptoPhraseArray;



    static String[] wordsFromArrAll;


//подбор верного ключа

    static void checker() {
        for (int key = 0; key < Alphabet.getLength(); key++) {
            Decrypter.decrypt(key);
            arrayWithNoPunct();


        }

    }
//создание массива без знаков припинания
    static void arrayWithNoPunct() {
        phraseToBruteForce = Decrypter.decryptoPhraseArray;
        arrToString = String.valueOf(phraseToBruteForce);
        wordsFromArr = arrToString.split("\s");

        char[] punctArr = Alphabet.getPunctArray();
        String[] wordsWithNoPunct = wordsFromArr;
        for (String s : wordsWithNoPunct) {
            for (int i = 0; i < punctArr.length; i++) {
                if (punctArr[i] == s.charAt(s.length() - 1)) {
                    //if(s.endsWith(String.valueOf(punctArr[i])) == ) {
                    s = s.substring(0, s.length() - 1);
                    break;
                }
            }
            //System.out.print(s + "|");
        }
        wordsFromArrWithNoPunct = wordsWithNoPunct;

    }

    //подбор верного ключа с помощью исключений
    static void findTheKey() {
        String [] phrase = wordsFromArrWithNoPunct;

        String noWordEnds = "ъ";
        char[] noWordStarts = "ъыь".toCharArray();
        char[] oneLetterWord = "абвежикосуя".toCharArray();
        char[] zvonkieArr = "бг                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               джз".toCharArray();
        char[] shipyashieArr = "фхщц".toCharArray();





        for (String s: phrase) {



            //if(s.)
        }



    }
}





