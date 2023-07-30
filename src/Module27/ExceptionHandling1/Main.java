package Module27.ExceptionHandling1;
/*
Method copyFileUsingStream() reads a text file and its encoding type and then writes the content
in a new created text file with another mentioned encoding type.
This program is created in order to use an exception handling.
Try-with-resources isn't used here, so the program looks too big and the code looks too complex.
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
        Reader fis;
        Writer fos;
        try {
            fis = new InputStreamReader(new FileInputStream(sourceFilename), sourceEnc);
        } catch (FileNotFoundException e) {
            System.out.println("The source file is not found.");
            return false;
        } catch (UnsupportedEncodingException e) {
            System.out.println("The source file has an unsupported encoding type.");
            return false;
        }

        try {
            fos = new OutputStreamWriter(new FileOutputStream(destFilename), descEnc);
        } catch (UnsupportedEncodingException e) {
            System.out.println("The output file has an unsupported encoding type.");
            return false;
        }
        catch (IOException e) {
            System.out.println("The output file can not be created.");
            return false;
        }

        char[] buffer = new char[1024];
        int length;
        try {
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (IOException ex){
            System.out.println("An error occurs while copying and writing in the output file.");
            return false;
        }
        finally {
            try {
                fis.close();
                fos.close();
            }
            catch (IOException ex){
                System.out.println("The streams can not be closed.");
                return false;
            }
        }
        return true;
    }
}