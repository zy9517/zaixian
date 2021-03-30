import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test20 {
    public static void main(String[] args) {
//        tran1();
        tran2();
    }

    public static void tran1() {
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(new File("C:Users/风雪江南/Desktop/test/3.jpg")));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File("C:Users/风雪江南/Desktop/test/bbb.jpg")));
            byte[] by = new byte[2048];
            int len = -1;
            while ((len = in.read(by, 0, by.length)) != -1) {
                out.write(by, 0, len);
            }
            out.flush();
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void tran2() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:Users/风雪江南/Desktop/test/123.txt")));
            String line = null;
            while ((line = in.readLine()) != null && !"#".equals(line)) {
                out.write(line);
                out.newLine();
            }
            out.flush();
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
