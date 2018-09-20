package by.iba.railway.eticket.xml.test;

import java.io.*;
import java.nio.charset.Charset;

public class TestUtils {
    protected int timeout = 1000*30;

    protected String getFileToString(String fileName){
        fileName = getClass().getResource(fileName).getPath();
        StringBuilder sb = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File(fileName)), Charset.forName("UTF-8"));
            BufferedReader buffReader = new BufferedReader(inputStreamReader);
            while(buffReader.ready())
                sb.append(buffReader.readLine() + "\r\n");
            buffReader.close();
            inputStreamReader.close();
            return sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
