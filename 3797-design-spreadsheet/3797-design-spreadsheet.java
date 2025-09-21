class Spreadsheet {

    private final int ROWS;
    private final int COLS = 26;
    private final int[][] sheet;

    private int[] getRowsCols(String cell) {
        if(cell==null || cell.isEmpty()) throw new IllegalArgumentException("Empty Cell references");

        int pos = 0;
        int col = -1;

        char FirstChar = cell.charAt(0);

        if(FirstChar >= 'A' && FirstChar <='Z') {
            col = FirstChar-'A';
            pos=1;
        }

        int row = 0;
        while (pos < cell.length()) {
            char ch = cell.charAt(pos);
            if(ch<'0' || ch >'9') throw new IllegalArgumentException("invalid character in cell");

            row = row*10 + (ch-'0');
            pos++;
        }
        return new int[]{row,col};
    }

    public Spreadsheet(int rows) {
        if(rows < 1) throw new IllegalArgumentException("rows must be greather than or equal to 1");

        this.ROWS = rows;
        this.sheet = new int[rows+1][COLS];  
    }
    
    public void setCell(String cell, int value) {
         int[] rc = getRowsCols(cell);
         if(rc[1] == -1) throw new IllegalArgumentException("Set Cell expects a cell references like A1");
         sheet[rc[0]][rc[1]] = value;  
    }
    
    public void resetCell(String cell) {
         int[] rc = getRowsCols(cell);
         if(rc[1] == -1) throw new IllegalArgumentException("reset cell expects a cell references like A1");
         sheet[rc[0]][rc[1]] = 0;
    }
    
    public int getValue(String formula) {

        if(formula == null || formula.isEmpty() || formula.charAt(0) != '=') throw new IllegalArgumentException("formula must starts with '=");
        
        int PlusPos = formula.indexOf('+');
        if(PlusPos == -1) throw new IllegalArgumentException("Formula must contains '+'");

        String lefttoken = formula.substring(1,PlusPos).trim();
        String righttoken = formula.substring(PlusPos+1).trim();

        int[] leftRC = getRowsCols(lefttoken);
        int[] rightRC = getRowsCols(righttoken);

        int leftVal = (leftRC[1] == -1) ? leftRC[0] : sheet[leftRC[0]][leftRC[1]];
        int rightVal = (rightRC[1] == -1) ? rightRC[0] :sheet[rightRC[0]][rightRC[1]];

        return leftVal+rightVal;

    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */