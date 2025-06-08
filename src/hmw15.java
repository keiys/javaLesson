import java.util.ArrayList;

public class hmw15 {
    public static void main(String[] args) {
        String someText = "hellomypreciousworld";
        System.out.println(zigzag(someText, 3));
    }

    public static String zigzag(String text, int numRows){
        if (numRows <= 1) return text;
        ArrayList<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : text.toCharArray()) {
            rows.get(currentRow).append(c);
            if (currentRow == 0 || currentRow == numRows - 1) goingDown = !goingDown;
            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        return result.toString();
    }
}

