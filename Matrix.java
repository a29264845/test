/** class to model a 3 x 4 matrix of doubles <br>
 * Supports Gaussian row operations
 * <br> In this version, rows and columns start at 0
 * @author csc 142 class JesseLeu
 */

public class Matrix {  
    private int col,row;
    private double[][] myArr;
    /**Instantiate a ROW x COL matrix, empty
     */
    public Matrix(int row, int col) {
        if (row<0||col<0) throw new IllegalArgumentException("row and col should >=0");
        this.row = row;
        this.col = col;
        myArr= new double[this.row][this.col];
    }

    /** set the value of a particular element in the matrix
     * @param row the row of the element. 0 <= row < Matrix.ROW
     * @param col the column of the element.   0 <= col < Matrix.COL
     * @param value the value to be stored
     * @throws ArrayIndexOutOfBoundsException for invalid row or column
     */
    public void setValue(int row, int col, double value) throws ArrayIndexOutOfBoundsException {
        myArr[row][col] = value;

    }

    /** returns the value of a particular element in the matrix
     * @param row the row of the element. 0 <= row < Matrix.ROW
     * @param col the column of the element.   0 <= col < Matrix.COL
     * @throws ArrayIndexOutOfBoundsException for invalid row or column
     */
    public double getValue(int row, int col)throws ArrayIndexOutOfBoundsException {
        return myArr[row][col];
    }

    /** swap 2 rows of this matrix
     * @param r1 one of the rows to swap.  0 <= r1 < Matrix.ROW
     * @param r2 the other row to swap.   0 <= r2 < Matrix.ROW
     * @throws ArrayIndexOutOfBoundsException for invalid row or column
     */
    public void swapRows(int r1, int r2) throws ArrayIndexOutOfBoundsException{
        double[] temp;
        temp = myArr[r1];
        myArr[r1] = myArr[r2];
        myArr[r2] = temp;
    }

    /** multiply one row by a non-zero constant
     * @param multiple the non-zero constant
     * @param row the row to change
     * @throws IllegalArgumentException if multiple is 0
     * @throws ArrayIndexOutOfBoundsException for invalid row
     */
    public void multiplyRow(double multiple, int row) throws ArrayIndexOutOfBoundsException,IllegalArgumentException{
        if (multiple == 0) throw new IllegalArgumentException("multiple should not be 0");
        for(int i = 0;i<col;i++){
            myArr[row][i]*= multiple;   
        }
    }

    /** add row r1 into row r2. Equivalent to r2 += r1 
     * @param r1 the row to add  0 <= r1 < Matrix.ROW
     * @param r2 the row to add into.  0 <= r2 < Matrix.ROW.  This row will change.
     * @throws ArrayIndexOutOfBoundsException for invalid row
     */
    public void addRows (int r2, int r1)throws ArrayIndexOutOfBoundsException {
        for(int i = 0;i<col;i++){
            myArr[r2][i]+= myArr[r1][i];   
        }
    }

    /**
     * set new row in the matrix
     * @param row the new row to insert
     * @param rIdx the index of this new row  0 <= rIdx < Matrix.ROW
     * @return the old row
     * @throws IllegalArgument exception if row is not the correct length of Matrix.COL
     * @throws ArrayIndexOutOfBoundsException for invalid row
     */
    public double[] replace(double[] row, int rIdx)throws ArrayIndexOutOfBoundsException,IllegalArgumentException{
        if(rIdx<0||rIdx>this.row) throw new IllegalArgumentException("rIdx should between 0 to size of row");
        double[] oldArr = myArr[rIdx];
        myArr[rIdx] = row;
        return oldArr;
    }

    /**
     * Add 2 Matrices together and return a new Matrix
     * @param m the 2nd Matrix
     * @return the matrix sum of this + m
     */

    public Matrix sum(Matrix m){
        Matrix result = new Matrix (this.row, this.col);
        for(int i = 0;i<row;i++){
            for(int j = 0;i<col;i++){
                result.setValue(i,j , myArr[i][j]+m.getValue(i,j)) ;
            }
        }
        return result;
    }

    /** Return this matrix as a String of ROW rows of numbers in COL columns
     */
    public String toString() {
        String result="";
        for(int i = 0;i<row;i++){
            for(int j = 0;i<col;i++){
                result += String.format("%8.2f",myArr[i][j]);
            }
            result += "\n";
        }
        return result;
    } 
} 