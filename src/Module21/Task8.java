package Module21;

import java.util.Arrays;

/*
Объявлены два массива: strings и output.
Ваша задача — из каждой строки массива strings взять nth-ый символ и положить его в массив output.
Вы можете поменять значение nth, а также строки в массиве, но для прохождения теста верните все значения на изначальные.
 */
public class Task8 {
    static Character[] output;
    static int inth = 0;
    static String[] strings = new String[]{
            "Claudius, King of Denmark.",
            "Hamlet, Son to the former, and Nephew to the present King.",
            "Polonius, Lord Chamberlain.",
            "Horatio, Friend to Hamlet.",
            "Laertes, Son to Polonius.",
            "Voltimand, Courtier.",
            "Cornelius, Courtier.",
            "Rosencrantz, Courtier.",
            "Guildenstern, Courtier.",
            "Osric, Courtier.",
            "A Gentleman, Courtier.",
            "A Priest.",
            "Marcellus, Officer.",
            "Bernardo, Officer.",
            "Francisco, a Soldier",
            "Reynaldo, Servant to Polonius.",
            "Players.",
            "Two Clowns, Grave-diggers.",
            "Fortinbras, Prince of Norway.",
            "A Captain.",
            "English Ambassadors.",
            "Ghost of Hamlet's Father."
    };

    public static void main(String[] args) {
        output = new Character[strings.length];
        for (int i = 0; i < strings.length; i++) {
            output[i] = strings[i].charAt(inth);
        }
        Arrays.stream(output).forEach(System.out::print);
    }
}
