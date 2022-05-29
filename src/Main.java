import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println();
        File file = new File("voyna.txt");
        Parser parser = new Parser();
        ParserScanner parserScanner = new ParserScanner();
        ArrayList<String> sufferingWords = new ArrayList<>();

        for (String elem : parser.parse(file)) {
            if (elem.matches("^[Сс]трада(.*)")) {
                sufferingWords.add(elem);
                System.out.println(elem);
            }
        }
        System.out.println("Встречается " + sufferingWords.size() + " раза");
        System.out.println();

        System.out.println("Задание 2");
        System.out.println();
        ArrayList<String> sufferingWordsScanner = new ArrayList<>();

        for (String elem : parserScanner.parse(file)) {
            if (elem.matches("^[Сс]трада(.*)")) {
                sufferingWordsScanner.add(elem);
                System.out.println(elem);
            }
        }
        System.out.println("Встречается " + sufferingWordsScanner.size() + " раза");
        System.out.println();

        System.out.println("Задание 3");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();

        }

    }
}

