package Module22;

/*
Класс Танк.
Танк имеет координаты текущего местоположения X и Y.
Координатная ось Y направлена вниз, ось X направлена вправо.
Танк имеет начальный запас топлива fuel.
Танк может ехать вперед и назад на заданную дистанцию goForward(), goBackyard().
При движении танк расходует топливо в количестве, аналогичном проходимой дистанции.
Если топлива меньше, чем заданная дистанция, то танк проезжает расстояние, соответствующее оставшемуся количеству топлива.
Танк может изменять направление turnLeft(), turnRight() и двигаться в 4 направлениях (начальное направление - right).
Через printPosition можно узнать текущие координаты танка.
Класс танк имеет 3 конструктора:
    1) без аргументов, начальная позиция (0; 0), топливо 100;
    2) с аргументами (int, int) для начальных координат X, Y. Начальное топливо 100.
    3) с аргументами (int, int, int) для начальных X, Y, fuel.
Статичная переменная tankCounter ведет подсчет созданных из класса Tank объектов.
Из tankCounter каждому новому объекту присваивается его номер в переменной tankNumber.
 */
public class Tank {
    private int coordinateX;
    private int coordinateY;
    private String moveDirection = "right";
    private int fuel;
    private final String tankModel = "T34";
    private static int tankCounter;
    private int tankNumber;

    public Tank() {
        this(0, 0, "right", 100);
    }

    public Tank(int coordinateX, int coordinateY) {
        this(coordinateX, coordinateY,"right",100);
    }

    public Tank(int coordinateX, int coordinateY, int fuel) {
        this(coordinateX, coordinateY,"right", fuel);
    }

    public Tank(int coordinateX, int coordinateY, String moveDirection, int fuel) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.moveDirection = moveDirection;
        this.fuel = fuel;
        tankNumber = ++tankCounter;
    }

    public void turnRight() {
        switch (this.moveDirection) {
            case "right":
                this.moveDirection = "down";
                break;
            case "down":
                this.moveDirection = "left";
                break;
            case "left":
                this.moveDirection = "up";
                break;
            case "up":
                this.moveDirection = "right";
                break;
        }
    }

    public void turnLeft() {
        switch (this.moveDirection) {
            case "right":
                this.moveDirection = "up";
                break;
            case "up":
                this.moveDirection = "left";
                break;
            case "left":
                this.moveDirection = "down";
                break;
            case "down":
                this.moveDirection = "right";
                break;
        }
    }

    public void goForward(int distance) {
        if (fuel >= Math.abs(distance)) {
            switch (moveDirection) {
                case "right":
                    this.coordinateX += distance;
                    break;
                case "down":
                    this.coordinateY += distance;
                    break;
                case "left":
                    this.coordinateX -= distance;
                    break;
                case "up":
                    this.coordinateY -= distance;
                    break;
            }
            fuel -= distance;
        } else if (distance < 0) {
            switch (moveDirection) {
                case "right":
                    this.coordinateX -= fuel;
                    break;
                case "down":
                    this.coordinateY -= fuel;
                    break;
                case "left":
                    this.coordinateX += fuel;
                    break;
                case "up":
                    this.coordinateY += fuel;
                    break;
            }
            fuel = 0;
        } else {
            switch (moveDirection) {
                case "right":
                    this.coordinateX += fuel;
                    break;
                case "down":
                    this.coordinateY += fuel;
                    break;
                case "left":
                    this.coordinateX -= fuel;
                    break;
                case "up":
                    this.coordinateY -= fuel;
                    break;
            }
            fuel = 0;
        }
    }

    public void goBackward(int distance) {
        if (fuel >= Math.abs(distance)) {
            switch (moveDirection) {
                case "right":
                    this.coordinateX -= distance;
                    break;
                case "down":
                    this.coordinateY -= distance;
                    break;
                case "left":
                    this.coordinateX += distance;
                    break;
                case "up":
                    this.coordinateY += distance;
                    break;
            }
            fuel -= distance;
        } else if (distance < 0) {
            switch (moveDirection) {
                case "right":
                    this.coordinateX += fuel;
                    break;
                case "down":
                    this.coordinateY += fuel;
                    break;
                case "left":
                    this.coordinateX -= fuel;
                    break;
                case "up":
                    this.coordinateY -= fuel;
                    break;
            }
            fuel = 0;
        } else {
            switch (moveDirection) {
                case "right":
                    this.coordinateX -= fuel;
                    break;
                case "down":
                    this.coordinateY -= fuel;
                    break;
                case "left":
                    this.coordinateX += fuel;
                    break;
                case "up":
                    this.coordinateY += fuel;
                    break;
            }
            fuel = 0;
        }
    }

    public void printPosition() {
        System.out.println("The Tank " + tankModel + "-" + tankNumber + " is at " + coordinateX + ", " + coordinateY + " now.");
    }

    public static void main(String[] args) {
        // At (0;0) fuel=100
        Tank justTank = new Tank();
        System.out.println(justTank.fuel);
        // At (10;10) fuel=100
        Tank anywareTank = new Tank(10, 10);
        System.out.println(anywareTank.fuel);
        // At (20;30) fuel=200
        Tank customTank = new Tank(20, 30, 200);
        System.out.println(customTank.fuel);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
    }
}
