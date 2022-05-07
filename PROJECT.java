public class PROJECT {

    public static void main(String[] args) {

        Encrypter.encrypt("Мои мечты сбываются! Чего бы мне ни хотелось, всё обязательно сбудется: загадывай желания, ок?");
        Decrypter.decrypt(Key.getKEY());

        System.out.println("-----------------------------------");

        //System.out.println(BruteForce.arrToString);
       // System.out.println(BruteForce.wordsFromArr);
       // BruteForce.arrayWithNoPunct();
       // BruteForce.checker();
        //System.out.println(BruteForce.guessDecryptoPhraseArray);






    }
}