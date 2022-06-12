import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

public class lab4 {

    static String fileName = "input.txt";

    public static void main(String[] args) {

        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            try {
                String expression;
                while ((expression = in.readLine()) != null) {
                    MatchParserPlusMinus pm = new MatchParserPlusMinus();
                    try {
                        System.out.println(expression + " = " + pm.Parse(expression));
                    } catch (Exception e) {
                        System.err.println("Error while parsing '" + expression + "' with message: " + e.getMessage());
                    }
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}