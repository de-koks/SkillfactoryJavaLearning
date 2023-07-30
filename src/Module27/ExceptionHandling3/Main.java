package Module27.ExceptionHandling3;
/*
Method copyFileUsingStream() reads a text file and its encoding type and then writes the content
in a new created text file with another mentioned encoding type.
This program is created in order to use an exception handling.
Try-with-resources is used here so this program is much shorter.
Also, we use here our own class of Exception - ConvertException in order to handle all exceptions in the main() method.
 */
import java.io.*;

class ConvertException extends Exception{ //creating our own exception class
    ConvertException(String message){
        super(message);
    }
}

public class Main {
    public static void main(String[] args)  {
        //the method is contained in try-catch again, but now we may catch only one class of exceptions - our own class.
        try {copyFileUsingStream("src/win1251.txt",
                "windows-1251",
                "src/utf8.txt",
                "utf-8");
            System.out.println("The encoding is completed successfully!");
        } catch (ConvertException ex){
            //if one is caught then it only type the message from its constructor, not the whole stack trace.
            System.out.println(ex.getMessage());
        }
    }

    private static void copyFileUsingStream //this method is void again because of the exceptions we may not reach the return statement here
            (String sourceFilename, String sourceEnc,String destFilename, String descEnc)
                throws ConvertException{ //the method throws now only one exception - our own class that we created

        try (Reader fis = new InputStreamReader(new FileInputStream(sourceFilename), sourceEnc);
             Writer fos = new OutputStreamWriter(new FileOutputStream(destFilename), descEnc)) {

            char[] buffer = new char[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        }
        catch (FileNotFoundException ex){ //every caught exception creates an object of our new exception class
            throw new ConvertException("The file can not be opened " + ex.getMessage());
        }
        catch (UnsupportedEncodingException ex) {//every object is created with its message corresponded to the exception type
            throw new ConvertException("Unsupported encoding type " + ex.getMessage());
        }
        catch (IOException ex){
            throw new ConvertException("An error occurs during the copying " + ex.getMessage());
        }
    }
}
