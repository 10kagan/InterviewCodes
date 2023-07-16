package part11_LeetcodeString;

import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet {
    public static void main(String[] args) {
        String s = "K1:L2";
//        Output: ["K1","K2","L1","L2"]
//        Explanation:
//        The above diagram shows the cells which should be present in the list.
//                The red arrows denote the order in which the cells should be presented.
        System.out.println(cellsInRange(s));
    }
    public static List<String> cellsInRange(String s) {
        List<String> list = new ArrayList<>();
        String [] cells = s.split(":");

        String startCell = cells[0];
        String endCell = cells[1];

        char startCol = startCell.charAt(0);
        int startRow = Integer.parseInt(startCell.substring(1));

        char endCol = endCell.charAt(0);
        int endRow = Integer.parseInt(endCell.substring(1));

        for (char col = startCol; col <= endCol; col++) {
            for (int row = startRow; row <= endRow; row++) {
                String cell = col + Integer.toString(row);
                list.add(cell);
            }
        }
        return list;
    }
}
