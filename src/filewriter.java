import java.io.FileWriter;
import java.io.IOException;
public class filewriter {
        public static void main(String[] args) throws IOException {
            FileWriter fw;
            fw = new FileWriter("abc.txt");
            fw.write("Hello world");
            fw.close();
        }
    }

