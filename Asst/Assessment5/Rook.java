/**
 * @Author Zhihao Huang
 * @LoginID zhihhuang
 * @ClassName Rook
 * @Description TODO
 * @date 2019-10-08 00:52
 **/
public class Rook extends ChessPiece{

    Rook(int row, int column) {
        super(row, column);
    }

    public boolean validMove(int toRow, int toColumn)
    {
        return (toRow == this.getRow() || toColumn == this.getColumn())
                && super.validMove(toRow, toColumn)
//                && reachEdge(toRow, toColumn)
                ;
    }

    public String toString()
    {
        return "Rook at (" + this.getRow() + "," + this.getColumn() + ")";
    }


}
