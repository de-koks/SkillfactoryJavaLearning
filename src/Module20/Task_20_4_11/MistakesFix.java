package Module20.Task_20_4_11;
/*
исправить ошибки
 */

public class MistakesFix {
    public static void main(String[] args) {

        int value = add(7, 8);
        int result = add(value, 15);

        System.out.println(result);
    }
    private static int add ( int x, int y){
        int result = (x + y);
        return result;
    }
}

