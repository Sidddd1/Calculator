public class Arab extends Number{
    private int a;
    private int b;
    private String znak;

    public Arab(int a, int b, String znak) {
        this.a = a;
        this.b = b;
        this.znak = znak;
    }

    private int operation() {
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
        int res = operation();
        System.out.println(res);
    }
}


