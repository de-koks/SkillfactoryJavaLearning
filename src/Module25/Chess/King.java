package Module25.Chess;

/*
Реализуйте конструктор, который будет принимать лишь цвет фигуры.
Реализуйте метод getColor() так, чтобы он возвращал цвет фигуры.
Реализуйте метод canMoveToPosition() так, чтобы фигуры не могли выйти за доску (доска в нашем случае — это двумерный массив размером 8 на 8, напоминаем, что индексы начинаются с 0)
и могли ходить так, как ходят в шахматах (Королева ходит и по диагонали и по прямой), также фигура не может сходить в точку, в которой она сейчас находится.
Если фигура может пройти от точки (line, column) до точки (toLine, toColumn) по всем правилам (указанным выше), то функция вернет true, иначе — false.
Реализуйте метод getSymbol так, чтобы он возвращал строку — символ фигуры для короля — K.
Отдельно в классе King создайте метод isUnderAttack(ChessBoard board, int line, int column), возвращающий логическое (boolean) значение.
Этот метод должен проверять, находится ли поле, на котором стоит король (или куда собирается пойти) под атакой.
Если это так, то метод должен вернуть true, иначе — false. Это позволит нам проверять шахи.
 */
public class King extends ChessPiece {
    private String symbol = "K";

    public King(String color) {
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
                return Math.abs(toLine - line) <= 1 && Math.abs(toColumn - column) <= 1;
            }
        }
        return false;
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        for (int i = 0; i < board.board.length; i++) {
            for (int j = 0; j < board.board[i].length; j++) {
                if (board.board[i][j] != null &&
                        !board.board[i][j].color.equals(this.color) &&
                        board.board[i][j].canMoveToPosition(board, i, j, line, column))
                    return true;
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return this.symbol;
    }
}
