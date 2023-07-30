package Module27.AdditionalTasks;
/*
Написать программу, которая будет считывать целые числа с клавиатуры до тех пор, пока не будет введена строка.
Когда будет введена строка, программа должна поймать исключение и вывести все введенные до этого числа на экран в том же порядке.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputIntegers {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List < Integer > list = new ArrayList < > ();

        try {
            while (true) {
                list.add(Integer.parseInt(reader.readLine()));
            }
        } catch (Exception e) {
            for (Integer i: list) {
                System.out.println(i);
            }
        }
    }
}