package Module27.ExceptionHandling2;
/*
Method copyFileUsingStream() reads a text file and its encoding type and then writes the content
in a new created text file with another mentioned encoding type.
This program is created in order to use an exception handling.
Try-with-resources is used here so this program is much shorter and the code looks easier comparing with the previous program.
 */
import java.io.*;

public class Main {

    public static void main(String[] args)  { //we don't need "throws" here
        //we may change any parameter here and the program will still work
        if (copyFileUsingStream("src/win1251.txt",
                "windows-1251",
                "src/utf8.txt",
                "utf-8")){
            System.out.println("The encoding is completed successfully!");
        }
    }

    private static boolean copyFileUsingStream(String sourceFilename, String sourceEnc,
                                               String destFilename, String descEnc) {

        try (Reader fis = new InputStreamReader(new FileInputStream(sourceFilename), sourceEnc);
             Writer fos = new OutputStreamWriter(new FileOutputStream(destFilename), descEnc)) {

            char[] buffer = new char[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        }
        catch (FileNotFoundException ex){
            System.out.println("The file can not be opened " + ex.getMessage());
            return false;
        }
        catch (UnsupportedEncodingException ex) {
            System.out.println("Unsupported encoding type " + ex.getMessage());
            return false;
        }
        catch (IOException ex){
            System.out.println("An error occurs during the copying " + ex.getMessage());
            return false;
        }
        return true;
    }
}
