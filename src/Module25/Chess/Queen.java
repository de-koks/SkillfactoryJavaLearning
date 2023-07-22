package Module25.Chess;
/*
Реализуйте конструктор, который будет принимать лишь цвет фигуры.
Реализуйте метод getColor() так, чтобы он возвращал цвет фигуры.
Реализуйте метод canMoveToPosition() так, чтобы фигуры не могли выйти за доску (доска в нашем случае — это двумерный массив размером 8 на 8, напоминаем, что индексы начинаются с 0)
и могли ходить так, как ходят в шахматах (Королева ходит и по диагонали и по прямой, Король — в любое поле вокруг себя),
также фигура не может сходить в точку, в которой она сейчас находится.
Если фигура может пройти от точки (line, column) до точки (toLine, toColumn) по всем правилам (указанным выше), то функция вернет true, иначе — false.
Реализуйте метод getSymbol так, чтобы он возвращал строку — символ фигуры для ферзя — Q.
 */
public class Queen extends ChessPiece{
    private String symbol = "Q";
    public Queen(String color) {
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
                return line == toLine || column == toColumn || Math.abs(column - toColumn) == Math.abs(line - toLine);
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return this.symbol;
    }
}
