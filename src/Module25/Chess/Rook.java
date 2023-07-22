package Module25.Chess;
/*
В классе Rook:
Реализуйте метод getColor() так, чтобы он возвращал цвет фигуры.
Реализуйте метод canMoveToPosition() так, чтобы ладья не могла выйти за доску (доска в нашем случае — это двумерный массив размером 8 на 8, напоминаем, что индексы начинаются с 0)
и могла ходить только по прямой, также фигура не может сходить в точку, в которой она сейчас находится.
Если ладья может пройти от точки (line, column) до точки (toLine, toColumn) по всем правилам (указанным выше), то функция вернет true, иначе — false.
Реализуйте метод getSymbol так, чтобы он возвращал символ фигуры, в нашем случае ладья — R.
 */
public class Rook extends ChessPiece{

    private String symbol = "R";

    public Rook(String color) {
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
                return line == toLine || column == toColumn;
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return this.symbol;
    }
}
