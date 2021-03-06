package uInteraction;

import errors.MyException;
import errors.Response;
import data.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Read {

    public static List<Data> readFile(String fileName) {
        List<Data> data = new ArrayList<Data>();
        try {
            InputStream inputStream = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                String[] s = sCurrentLine.split("\t");
                if (s[0].equals("A") || s[0].equals("B") || (((s[0].equals("ID") && s.length == 2) && s[1].equals("VALUE")))) {
                } else if (s.length == 2 && s[1].length() <= 100) {
                    data.add(new Data(Integer.parseInt(s[0]), s[1]));
                } else {
                    throw new NumberFormatException();
                }
            }
            return data;
        } catch (NumberFormatException e) {
            throw new MyException(Response.NUBER_FORMAT_EXCEPTION);
        } catch (UnsupportedEncodingException e) {
            throw new MyException(Response.INVALID_INPUT_DATA);
        } catch (IOException e) {
            throw new MyException(Response.FILE_NOT_FOUND);
        }
    }

}
