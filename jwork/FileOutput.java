import java.io.FileWriter;
import java.io.IOException;

public class FileOutput extends TimeCount {
    public void time() {
        try {
            FileWriter fw = new FileWriter("test.txt");
            for (int i = 0; i < 10000; i++) {
                int num = (int)(Math.random() * 9999);
                fw.write(num + "\n");
            }
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}