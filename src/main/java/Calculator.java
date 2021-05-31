public class Calculator {

    public int operator (String op, int num1, int num2) {
        if ("+".equals(op)) {
            return num1 + num2;
        }
        if ("-".equals(op)) {
            return num1 - num2;
        }
        if ("*".equals(op)) {
            return num1 * num2;
        }
        if ("/".equals(op)) {
            return num1 / num2;
        }
        throw new IllegalArgumentException();
    }


    public int changeResult (String input) {

        String[] st = input.split(" ");
        int result = Integer.parseInt(st[0]);
        for (int i = 1; i < st.length - 1; i += 2) {
            String op = st[i];
            result = operator(op, result, Integer.parseInt(st[i + 1]));
        }
        return result;
    }

}
