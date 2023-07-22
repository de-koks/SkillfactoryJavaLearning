package Module25.Chess;

/*
Теперь напишите класс Horse (конь). Этот класс должен быть наследником класса ChessPiece, который вы сделали в предыдущей задаче.
Реализуйте конструктор, который будет принимать лишь цвет фигуры.
Реализуйте метод getColor() так, чтобы он возвращал цвет фигуры.
Реализуйте метод canMoveToPosition() так, чтобы конь не мог выйти за доску (доска в нашем случае — это двумерный массив размером 8 на 8, напоминаем, что индексы начинаются с 0)
и мог ходить только буквой «Г». Также фигура не может сходить в точку, в которой она сейчас находится.
Если конь может пройти от точки (line, column) до точки (toLine, toColumn) по всем правилам (указанным выше), то функция вернет true, иначе — false.
Реализуйте метод getSymbol так, чтобы он возвращал символ фигуры, в нашем случае конь — это  H.
Также вы можете добавить и свои методы для удобства.
 */
public class Horse extends ChessPiece {

    private String symbol = "H";

    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line == toLine && column == toColumn) return false;
        if (0 <= toLine && toLine <= 7 && 0 <= toColumn && toColumn <= 7) {
            if (chessBoard.board[toLine][toColumn] == null || !chessBoard.board[toLine][toColumn].color.equals(this.color)) {
                return (line == toLine - 2 && column == toColumn - 1) || (line == toLine - 1 && column == toColumn - 2) ||
                        (line == toLine - 2 && column == toColumn + 1) || (line == toLine - 1 && column == toColumn + 2) ||
                        (line == toLine + 1 && column == toColumn + 2) || (line == toLine + 2 && column == toColumn + 1) ||
                        (line == toLine + 2 && column == toColumn - 1) || (line == toLine + 1 && column == toColumn - 2);
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return this.symbol;
    }
}
