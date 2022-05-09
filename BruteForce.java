
public class BruteForce {

    static String[] phraseWordsWithNoSpacesArray;
    static String decryptedPhraseArrayToString;
    static char[] punctArr = Alphabet.getPunctArray();

    //var for key possible range
    static int rightKey = 0;
    static int maxRightKeyCounter = 0;



//подбор верного ключа

    static void checker() {
        for (int key = 1; key < Alphabet.getLength(); key++) {
            Key.setKEY(key);
            Alphabet.createCryptoHashMap(key);

            Decrypter.decrypt(Key.getKEY(), Encrypter.cryptoPhraseArray);//1 получили вариант
            arrayToFindKey();//сделали проверку
            //findTheKey();//вернули значение каунтера

            int chanceofKey = findTheKey();
            if(chanceofKey > maxRightKeyCounter) {
                maxRightKeyCounter = chanceofKey;
                rightKey = key;
            }
        }


    }


//создание массива для поиска ключа
    public static void arrayToFindKey() {

        decryptedPhraseArrayToString = String.valueOf(Decrypter.decryptoPhraseArray).toUpperCase();
        phraseWordsWithNoSpacesArray = decryptedPhraseArrayToString.toUpperCase().split("\s");

        //wordsFromArrWithNoPunct = phraseWordsWithNoSpacesArray;

    }

    public static int findTheKey() {
        int rightKeyCounter = 0;

        //loop through each word in the text
        for (String s : phraseWordsWithNoSpacesArray) {
        if(rightKeyCounter < maxRightKeyCounter ) {
            break;
        }
            //findtheKey method (for Exceptions)
            String noWordEnds = "ъ".toUpperCase();
            char[] noWordStarts = "ъыь".toUpperCase().toCharArray();
            char[] oneLetterWord = "абвежикосуя".toUpperCase().toCharArray();


            //check possible one-letter words
            if (s.length() == 0) {
                break;
            }
            if (s.length() == 1) {
                for (int i = 0; i < oneLetterWord.length; i++) {
                    if (s.equals(String.valueOf(oneLetterWord[i]))) {
                        rightKeyCounter++;
                    }
                }
            }

            //check no word starts with
            for (int i = 0; i < noWordStarts.length; i++) {
                if (s.startsWith(String.valueOf(noWordStarts[i]))) {
                    rightKeyCounter--;
                    break;
                }
            }
            //check no word ends with
            if (s.endsWith(noWordEnds)) {
                rightKeyCounter--;
            }

            //check for punct marks inside words
            for (int i = 0; i < Alphabet.PUNCTUATION.length(); i++) {
                char punct = Alphabet.PUNCTUATION.charAt(i);
                if (s.contains(String.valueOf(punct))) {
                    for (int j = 0; j < punctArr.length; j++) {
                        if (!(s.endsWith(String.valueOf(punctArr[j])))) { //if ends with punct mark it's ok
                            rightKeyCounter--;
                            break;
                        }
                    break;
                    }
break;
                }
            }
        }
    return rightKeyCounter;}
}
//    //подбор верного ключа с помощью исключений
//    static void findTheKeyExc() {
//        String [] phraseWordsArray = phraseWordsWithNoSpacesArray;
//        int rightKeyCounter = maxRightKeyCounter;
//
//        String noWordEnds = "ъ".toUpperCase();
//        char[] noWordStarts = "ъыь".toUpperCase().toCharArray();
//        char[] oneLetterWord = "абвежикосуя".toUpperCase().toCharArray();
//        //char[] shipyashieArr = "фхщц".toUpperCase().toCharArray();
//
//        //check possible one-letter words
//        for (String s: phraseWordsArray) {
//            if(s.length() == 0) {
//                continue;
//            }
//            if(s.length() == 1) {
//                for (int i = 0; i < oneLetterWord.length; i++) {
//                    if(s.equals(oneLetterWord[i])) {
//                        rightKeyCounter++;
//                    }
//                }
//            }
//
//            //check no word starts with
//            for (int i = 0; i < noWordStarts.length; i++) {
//                if(s.startsWith(String.valueOf(noWordStarts[i]))) {
//                    break;
//                }
//            }
//            //check no word ends with
//            if(s.endsWith(noWordEnds)) {
//                rightKeyCounter--;
//            }
//
//            //присвоение key для шифра по каунтеру
//            if(rightKeyCounter > maxRightKeyCounter) {
//
//            }
//            rightKey = ;
//
//
// }







