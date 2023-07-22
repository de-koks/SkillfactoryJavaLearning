package Module25.Chess;

/*
Напишите класс Bishop (слон). Этот класс должен быть наследником от класса ChessPiece, который вы сделали в предыдущей задаче.
В классе Bishop:
Реализуйте метод getColor() так, чтобы он возвращал цвет фигуры.
Реализуйте метод canMoveToPosition() так, чтобы слон не мог выйти за доску (доска в нашем случае — это двумерный массив размером 8 на 8, напоминаем, что индексы начинаются с 0)
и мог ходить только по диагонали, также фигура не может сходить в точку, в которой она сейчас находится.
Если слон может пройти от точки (line, column) до точки (toLine, toColumn) по всем правилам (указанным выше), то функция вернет true, иначе — false.
Реализуйте метод getSymbol так, чтобы он возвращал символ фигуры, в нашем случае слон — B.
 */
public class Bishop extends ChessPiece {
    private String symbol = "B";

    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line == toLine && column == toColumn) return false; // нельзя остаться на месте
        if (0 <= toLine && toLine <= 7 && 0 <= toColumn && toColumn <= 7) { // нельзя выйти за границы поля
            if (chessBoard.board[toLine][toColumn] == null || !chessBoard.board[toLine][toColumn].color.equals(this.color)) {
                return Math.abs(column - toColumn) == Math.abs(line - toLine);
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return this.symbol;
    }
}
