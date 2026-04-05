class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if(rows < 2) {
            return encodedText;
        }

        int n = encodedText.length();
        int columns = n/rows;

        char [][] matrix = new char[rows][columns];
        int index = 0;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                matrix[i][j] = encodedText.charAt(index++);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int columnValue = 0;columnValue < columns;columnValue++) {
            int row=0;
            int j=columnValue;

            while(row < rows && j < columns) {
                sb.append(matrix[row][j]);
                row++;
                j++;
            }
        }

        while(sb.length() > 0 && sb.charAt(sb.length()-1) == ' ') {
            sb.deleteCharAt(sb.length()-1);
        }

        return sb.toString();
    }
}