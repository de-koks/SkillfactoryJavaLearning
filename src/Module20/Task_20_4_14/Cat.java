package Module20.Task_20_4_14;

import java.util.Scanner;

public class Cat {
    private int catWeight;
    private int catAge;
    private String catName;
    private int catHunger;
    private int catWishesToPlay;

    Cat(String catName) {
        this.catName = catName;
        catWeight = 3000;
        catAge = 0;
        catHunger = 50;
        catWishesToPlay = 50;
    }

    void changeCatWeight(int a) {
        this.catWeight += a;
    }

    void changeCatAge(int a) {
        this.catAge += a;
    }

    void changeCatHunger(int a) {
        this.catHunger += a;
    }

    void changeCatWishesToPlay(int a) {
        this.catWishesToPlay += a;
    }

    void getCatState() {
        System.out.println(catName + "'s age is " + catAge + " years.");
        System.out.println(catName + "s weight is " + catWeight + " grams.");
        System.out.println(catName + "'s hunger is " + catHunger + " (0 - maximum hunger, 100 - not hungry at all.");
        System.out.println(catName + "'s desire to play is " + catWishesToPlay + " (0 - very high, 100 - don't want to play.");
    }

    void catFeed(String food) {
        System.out.println("You may feed " + catName + " with milk, sausage or whiskas. Choose any of them.");
        if (catHunger > 50) {
            System.out.println(catName + "'s hunger is above 50. The cat isn't hungry and doesn't eat.");
        } else {
            String catFood = food;
            switch (catFood) {
                case "milk":
                    System.out.println(catName + " drinks milk. The hunger increases by 10.");
                    catHunger += 10;
                    System.out.println(catName + "'s hunger is " + catHunger + "now.");
                    break;
                case "sausage":
                    System.out.println(catName + " eats a sausage. The hunger increases by 20.");
                    catHunger += 20;
                    System.out.println(catName + "'s hunger is " + catHunger + "now.");
                    break;
                case "whiskas":
                    System.out.println(catName + " eats whiskas. The hunger increases by 30.");
                    catHunger += 30;
                    System.out.println(catName + "'s hunger is " + catHunger + "now.");
                    break;
                default:
                    System.out.println(catName + " doesn't want to eat what you have given.");
                    System.out.println(catName + "'s hunger is " + catHunger + "now.");
                    break;
            }
        }
    }

    void catPlay() {
        if (catHunger <= 20) {
            System.out.println(catName + " is too hungry to play, cat's hunger is " + catHunger + ".");
        } else if (catHunger >= 90) {
            System.out.println(catName + " is too filled to play, cat's hunger is " + catHunger + ".");
        } else if (catWishesToPlay >= 100) {
            System.out.println(catName + " has played enough and doesn't want anymore.");
        } else {
            catWishesToPlay += 10;
            catHunger -= 10;
            System.out.println("You play with " + catName + ". The cat's wish to play is " + catWishesToPlay + " now.");
            System.out.println(catName + "'s hunger is " + catHunger + " now.");
        }
    }
}
