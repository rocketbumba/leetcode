import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        boolean goingDown = false;

        for(int i = 0; i<s.length(); i++) {
            rows.get(currentRow).append(String.valueOf(s.charAt(i)));
            if(currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder toReturn = new StringBuilder();
        for(StringBuilder row: rows) {
            toReturn.append(row);
        }

        return toReturn.toString();
    }
}
