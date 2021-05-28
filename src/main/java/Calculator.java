public class Calculator {

    public int plus (String op, int num1, int num2) {
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
        int result = 0;

        for (int i = 0; i < st.length; i += 2) {
            result = Integer.parseInt(st[i]);
        }
        System.out.println(result);
        return result;
    }



}
