import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test19 {
    public static void main(String[] args) {
        try {
            //tran1();
            tran2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void tran1() throws IOException {
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:Users/风雪江南/Desktop/test/1.txt"));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:Users/风雪江南/Desktop/test/aaa.txt"));
        byte[] by = new byte[2048];
        int len = -1;
        while((len = in.read(by, 0, by.length))!= -1 ){
            System.out.print(new String(by));
            out.write(by, 0, len);
        }
        out.flush();
        in.close();
        out.close();
    }

    public static void tran2() throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("C:Users/风雪江南/Desktop/test/1.txt")));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:Users/风雪江南/Desktop/test/bbb.txt")));
        String line = null;
        while((line = in.readLine()) != null){
            System.out.print(line);
            out.write(line);
            out.newLine();
        }
        out.flush();
        in.close();
        out.close();
    }
}
