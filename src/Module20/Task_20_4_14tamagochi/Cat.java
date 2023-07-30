package Module20.Task_20_4_14tamagochi;

public class Cat {
    private short catWeight;
    private byte catAge;
    private String catName;
    private byte catHunger;
    private byte catWishesToPlay;

    Cat(String catName) {
        this.catName = catName;
        catWeight = 3000;
        catAge = 0;
        catHunger = 50;
        catWishesToPlay = 50;
    }

    String getCatName() {
        return catName;
    }

    void changeCatWeight(short a) {
        this.catWeight += a;
    }

    void changeCatAge(byte a) {
        this.catAge += a;
    }

    byte getCatAge() {
        return catAge;
    }

    void changeCatHunger(byte a) {
        this.catHunger += a;
    }

    byte getCatHunger() {
        return catHunger;
    }

    void changeCatWishesToPlay(byte a) {
        this.catWishesToPlay += a;
    }

    void getCatState() {
        System.out.printf("%s's age is %d years.\n", catName, catAge);
        System.out.printf("%s's weight is %d grams.\n", catName, catWeight);
        System.out.printf("%s's hunger is %d (0 - maximum hunger, 100 - not hungry at all).\n", catName, catHunger);
        System.out.printf("%s's desire to play is %d (0 - very high, 100 - don't want to play).\n", catName, catWishesToPlay);
    }

    void catFeed(String food) {
        if (catHunger > 50) {
            System.out.printf("%s's hunger is above 50. The cat isn't hungry and doesn't eat.\n", catName);
        } else {
            String catFood = food;
            switch (catFood) {
                case "milk":
                    System.out.printf("%s drinks milk. The hunger increases by 10.\n", catName);
                    catHunger += 10;
                    catWeight += 100;
                    System.out.printf("%s's hunger is %d now.\n", catName, catHunger);
                    break;
                case "sausage":
                    System.out.printf("%s eats a sausage. The hunger increases by 20.\n", catName);
                    catHunger += 20;
                    catWeight += 200;
                    System.out.printf("%s's hunger is %d now.", catName, catHunger);
                    break;
                case "whiskas":
                    System.out.printf("%s eats whiskas. The hunger increases by 30.\n", catName);
                    catHunger += 30;
                    catWeight += 300;
                    System.out.printf("%s's hunger is %d now.\n", catName, catHunger);
                    break;
                default:
                    System.out.printf("%s doesn't want to eat what you have given.\n", catName);
                    System.out.printf("%s's hunger is %d now.\n", catName, catHunger);
                    break;
            }
        }
    }

    void catPlay() {
        if (catHunger <= 20) {
            System.out.printf("%s is too hungry to play, cat's hunger is %d.\n", catName, catHunger);
        } else if (catHunger >= 90) {
            System.out.printf("%s is too filled to play and goes to sleep, cat's hunger is %d.\n", catName, catHunger);
        } else if (catWishesToPlay >= 100) {
            System.out.printf("%s has played enough and doesn't want anymore.\n", catName);
        } else {
            catWishesToPlay += 20;
            catHunger -= 20;
            catWeight -= 200;
            System.out.printf("You play with %s. The cat's wish to play is %s now.\n", catName, catWishesToPlay);
            System.out.printf("%s's hunger is %d now.\n", catName, catHunger);
            System.out.printf("%s's weight is %d now.\n", catName, catWeight);
        }
    }
}
