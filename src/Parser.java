import java.io.*;
//import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

public class Parser {
    ArrayList<String> parse(File file) {

        ArrayList<String> lines = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                lines.addAll(Arrays.asList(line.split("[^а-яА-я]+")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}