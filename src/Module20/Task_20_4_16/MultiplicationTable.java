package Module20.Task_20_4_16;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (byte i = 1; i <= 10; i++) {
                if (i < 10) {
                    System.out.print(i + "  ");
                } else {
                    System.out.print(i + " ");
                }
            for (byte j = 1; j <= 10; j++) {
               if (j * i < 10) {
                   System.out.print(j * i + "  ");
               } else {
                   System.out.print(j * i + " ");
               }
            }
            System.out.println();
        }
    }
}
