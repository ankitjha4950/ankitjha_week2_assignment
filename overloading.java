class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 50));       // Output: 60
        System.out.println(calc.add(10, 30, 40));   // Output: 80
    }
}