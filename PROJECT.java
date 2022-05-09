import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class PROJECT {
    static String phraseToBruteForce = null;

    public static void main(String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);// ввод с консоли

        System.out.println("Введите адрес файла для шифрования, начиная с //Users/..." );
//        BufferedReader reader = null;
//        BufferedReader reader1 = null;
//        //создание ридера
//        Path path1 = null;
//        try {
//            String pathString = sc.nextLine();
//            path1 = Path.of(pathString);
//            reader = Files.newBufferedReader(path1, StandardCharsets.UTF_8);
//            //чтение из файла
//            String someText = "";
//            while (reader.ready()) {
//                someText = someText + reader.readLine();
//            }
        String someText = BufReader.startReaderGetContent(sc.nextLine());

        System.out.println("Введите ключ для шифрования: ");
            //key request
            Key.setKEY(sc.nextInt());
            //зашифровка
            Encrypter.encrypt(someText);
            //расшифровка
            Decrypter.decrypt(Key.getKEY(), Encrypter.getCryptoPhraseArray());
            //запись в файл
            System.out.println("Введите адрес файла куда записать расшифрованное сообщение");
            String pathtoWrite = sc.nextLine();
            BufWriter.startWriter(pathtoWrite);
            System.out.println(Decrypter.decryptoPhraseArray);
            System.out.println("-----------------------------------");

            //brute force
//            System.out.println("Введите адрес файла для взлома: ");
//
//            String bruteF = BufReader.startReaderGetContent(sc.nextLine());
//
//            Encrypter.setCryptoPhraseArray(bruteF.toUpperCase().toCharArray());
//
//            BruteForce.checker();
//            Decrypter.decrypt(BruteForce.rightKey, Encrypter.cryptoPhraseArray);
            //Decrypter.decrypt(BruteForce.rightKey, someText.toCharArray());
            //result
           // System.out.println(Decrypter.decryptoPhraseArray);

        }

    }
