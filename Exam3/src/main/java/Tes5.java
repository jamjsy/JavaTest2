import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Tes5 {

    public class Test2 {
        public static void main(String[] args) {

            new ReadByGet().start();
        }

        static class ReadByGet extends Thread {

            public void run() {
                try {


                    URL url = new URL("http://hq.sinajs.cn/list=sh601006");
                    url.openConnection connection = url.openConnection();
                    InputStream is = ((URLConnection) connection).getInputStream();
                    InputStreamReader isr = new InputStreamReader(is);
                    BufferedReader br = new BufferedBuilder(isr);

                    String line;
                    StringBuilder builder = new StringBuilder();
                    while ((line = br.readLine()) != null) {
                        builder.append(line);
                    }
                    br.close();
                    isr.close();
                    is.close();

                    System.out.println(builder.toString());

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
