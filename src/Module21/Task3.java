package Module21;

import java.util.Arrays;
import java.util.Random;

/*
Прошло соревнование среди 5 участников: Саша, Игорь, Миша, Коля и Владимир, по 5 различным дисциплинам.
Организаторами был создан двухмерный массив: каждая i-ая строка — это количество полученных баллов i-го игрока.
Задание: вывести одномерный массив в виде "<Имя игрока>  <сумма баллов>".
 */
public class Task3 {
    public static void main(String[] args) {
//        Random rand = new Random();
//        int i, j;
        String[] result = new String[5];
//        int[][] points = new int[5][5];
//        for (int k = 0; k < 5; k++) {
//            for (int l = 0; l < 0; l++) {
//                points[k][l] = rand.nextInt(100);
//            }
//        }
        int[][] points = {
                {4, 3, 2, 5, 1},
                {3, 4, 4, 6, 2},
                {2, 5, 4, 3, 2},
                {8, 4, 2, 0, 4},
                {4, 4, 3, 2, 9},
        };
        int[] sumPoints = new int[5];
        String[] names = {"Alex", "Igor", "Michael", "Nicolay", "Vladimir"};
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                sumPoints[i] += points[i][j];
            }
            result[i] = names[i] + " " + sumPoints[i];
            System.out.println(result[i]);
        }
//        for (int k = 0; k < points[k].length; k++) {
//            System.out.println(Arrays.toString(points[k]));
//        }
    }
}
