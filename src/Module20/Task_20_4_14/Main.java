package Module20.Task_20_4_14;

import java.util.Objects;
import java.util.Scanner;

/*
Задача 20.4.14
Программа «Жизнь кота»

Задача состоит в следующем: необходимо написать программу, которая будет эмулировать тамагочи 80-х годов.
У нас есть возможность кормить кота, играть с котом, показывать его общее состояние. Также отсчитывать время жизни кота.
Первое, что должно быть — это создание кота. Программа должна просить ввод имени кота и задавать ему следующие параметры:
Вес кота: 3 кг
Возраст кота: 0 лет

После создания кота должно появиться «Меню кота». Каждый 20-й раз появление этого меню должно сопровождаться прибавлением 1 года к жизни кота.
Каждый вызов этого меню должен сопровождаться уменьшением его массы на несколько грамм и увеличением голода:

1. Состояние кота
В состоянии кота должна открываться следующая информация: его возраст, вес, голод, желание играть.
В пунктах Голод и Желание играть находится значение от 0 до 100, где 0 — сильно хочется, а 100 — полное насыщение.

2. Кормление кота
Меню питания должно состоять из нескольких кормов на ваше усмотрение. Каждое блюдо должно прибавлять разную массу к коту и утолить его голод на несколько пунктов.
Кот должен отказываться от еды, если его Голод находится на отметке свыше 50.

3. Игра с котом
Кот должен отказываться от игры, если его голод в зонах: от 0 до 20 и от 90 до 100. Кот не должен хотеть играть, если он наигрался на 100.
Программа должна нас оповестить, почему именно кот отказывается от игры.
Программа должна управляться командами: конкретными символами или любым символом. Программа должна завершаться при нажатии на клавишу «S».
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Since now you have your own cat! How will you name it?");
        Cat cat = new Cat(scan.next());

        String input = "input";
        int getStatusCounter = 0;
        while (!Objects.equals(input, "q")) {
            if (cat.getCatAge() >= 20) {
                System.out.println("Your " + cat.getCatName() + " becomes 20 years old and dies. I'm sorry.");
                System.exit(0);
            }
            if (cat.getCatHunger() < 0) {
                System.out.println("You didn't feed your " + cat.getCatName() + ", so them die because of hunger. You're not a careful pet owner.");
                System.exit(0);
            }

            System.out.println("Here is what you can do with your cat:");
            System.out.println("1. Type \"status\" to get an information about your cat.");
            System.out.println("2. Type \"feed\" in order to give your cat some food.");
            System.out.println("3. Type \"play\" if you want to play with your cat.");
            System.out.println("4. Type \"q\" if you want to exit the program.");

            input = scan.next();
            switch (input) {
                case "status":
                    getStatusCounter += 1;
                    if (getStatusCounter >= 10) {
                        cat.changeCatAge((byte) 1);
                        getStatusCounter = 0;
                    }
                    cat.getCatState();
                    cat.changeCatWeight((short) -100);
                    cat.changeCatHunger((byte) -10);
                    cat.changeCatWishesToPlay((byte) -10);
                    break;
                case "feed":
                    System.out.println("You may feed " + cat.getCatName() + " with milk, sausage or whiskas. Choose any of them.");
                    String food = scan.next();
                    cat.catFeed(food);
                    break;
                case "play":
                    cat.catPlay();
                    break;
                case "q":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("I don't understand what you want. Type 1 of 3 appropriate commands.");
                    break;
            }
        }
    }
}
