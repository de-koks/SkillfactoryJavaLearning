package Module25.Chess;
/*
Создайте класс Pawn (пешка), который так же, как и Horse, должен быть наследником класса ChessPiece.

В классе Pawn:
Реализуйте конструктор, который будет принимать цвет фигуры.
Реализуйте метод getColor() так, чтобы он возвращал цвет фигуры.
Реализуйте метод canMoveToPosition() так, чтобы пешка не могла выйти за доску и могла ходить только вперед.
Помните, что первый ход пешка может сдвинуться на 2 поля вперед, сделать это можно, например, сравнив координаты.
То есть, если пешка белая (color == "White") и находится в line == 1, то она может пойти на 2 поля вперед, иначе — нет, аналогично с черными пешками.
Также фигура не может сходить в точку, в которой она сейчас находится.
Если пешка может пройти от точки (line, column) до точки (toLine, toColumn) по всем правилам (указанным выше), то функция вернет true, иначе — false.
Реализуйте метод getSymbol так, чтобы он возвращал символ фигуры, в нашем случае пешка — это P.
 */
public class Pawn extends ChessPiece {
    private String symbol = "P";
    public Pawn(String color) {
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
            if (chessBoard.board[toLine][toColumn] == null && column == toColumn) {
                return (this.getColor().equals("White") && line == 1 && toLine == 3 && chessBoard.board[2][column] == null) ||
                        (this.getColor().equals("Black") && line == 6 && toLine == 4 && chessBoard.board[5][column] == null) ||
                        (this.getColor().equals("White") && toLine == line + 1) ||
                        (this.getColor().equals("Black") && toLine == line - 1);
            }

            if (chessBoard.board[toLine][toColumn] != null && !chessBoard.board[toLine][toColumn].color.equals(this.color)) {
                return (this.getColor().equals("White") && toLine == line + 1 && Math.abs(toColumn - column) == 1) ||
                        (this.getColor().equals("Black") && toLine == line - 1 && Math.abs(toColumn - column) == 1);
            }

        }
        return false;
    }

    @Override
    public String getSymbol() {
        return this.symbol;
    }
}
