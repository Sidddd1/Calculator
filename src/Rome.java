public class Rome extends Number {
    private String a;
    private String b;
    private String znak;

    public Rome(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.znak = c;
    }

    private int translateToArab(String s) {
        String[] smallrom = {"null", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i < smallrom.length; i++) {
            if (s.equals(smallrom[i])) {
                return i;
            }
        }
        throw new RuntimeException("Нет такого числа");
    }

    private String translateToRome(int resultArab) {
        String[] smallRome = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] bigRome = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        int a = resultArab / 10;
        int b = resultArab - a * 10;
        String resultRome = "";
        if (resultArab == 0) {
            return "null";
        }
        if (resultArab < 0) {
            resultRome += "-";
            a *= -1;
            b *= -1;
        }
        resultRome += bigRome[a] + smallRome[b];
        return resultRome;
    }

    private int operation(int a, int b) {
        if (znak.equals("+")) {
            return a + b;
        }
        if (znak.equals("-")) {
            return a - b;
        }
        if (znak.equals("/")) {
            return a / b; // 0
        }

        if (znak.equals("*"))
            return a * b;
        throw new RuntimeException("Нет знака");
    }

    @Override
    public void result() {
        int r = translateToArab(a);
        int t = translateToArab(b);
        int result = operation(r, t);
        String p = translateToRome(result);
        System.out.println(p);
    }
}
