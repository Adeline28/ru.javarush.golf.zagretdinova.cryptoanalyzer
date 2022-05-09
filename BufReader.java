import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class BufReader {
    //static BufferedReader reader;
    static Path path = null;
    static String someText = "";
    //создание ридера
    static String startReaderGetContent(String pathString) {
        path = Path.of(pathString);

        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            while (reader.ready()) {
             someText = someText + reader.readLine();
            }
        } catch (FileNotFoundException e) {
           System.out.println("Такого файла нет!");
           e.printStackTrace();
           System.out.println("Выберите другой файл!");
       } catch (IOException e) {
            System.out.println("Произошла какая-то ошибка. Проверьте правильность введённых данных");
            e.printStackTrace();
        }
        return someText;

    }

}

//        try {
//            String pString = pathString;
//
//            reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
//
//            //чтение из файла
//
//            while (reader.ready()) {
//                someText = someText + reader.readLine();
//            }
//reader.reset();


