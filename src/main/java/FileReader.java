import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReader {

    public static void main(String[] args) {

        String filename = "~/Document/test.txt";


        List<String> list = new ArrayList<>();

        Stream<String> stream = null;
        try {
            stream = Files.lines(Paths.get(filename));
            list = stream
                    .filter(line -> line.startsWith("line3"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }


        list.forEach(System.out::println);

    }


}
