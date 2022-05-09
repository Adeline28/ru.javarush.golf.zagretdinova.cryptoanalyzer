import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;

public class BufWriter {

    static Path pathToWrite;

    //Path path2 = Path.of("/Users/Rus/Desktop/Project/JavaRush-git-test/DeCryptedSomeText");
    static void startWriter(String pathLine) throws Exception {
        pathToWrite = Path.of(pathLine);
        try (Writer writer = new FileWriter(String.valueOf(pathToWrite.getFileName()).concat("Decrypted"));
             BufferedWriter bufWriter = new BufferedWriter(writer)) {
            for (char value : Decrypter.decryptoPhraseArray) {
                writer.write(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//    //BufferedWriter writer = Files.newBufferedWriter(path2, StandardCharsets.UTF_8);
//    String s = Decrypter.decryptoPhraseArray.toString();
////        while(true) {
//    //writer.write(Decrypter.decryptoPhraseArray, 0, Decrypter.decryptoPhraseArray.length);
////            //writer.write(Decrypter.decryptoPhraseArray);
////        }
//        try (
//    FileWriter writer = new FileWriter(String.valueOf(path1.getFileName()).concat("Decrypted"));
//    BufferedWriter bw = new BufferedWriter(writer)) {
//        for (char ch : Decrypter.decryptoPhraseArray) {
//            bw.write(ch);
//
//        }
//    } catch (
//    IOException e) {
//        System.err.format("IOException: %s%n", e);
//    }
//}
//    }
//}