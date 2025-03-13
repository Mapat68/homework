package калькулятор;

public class Калькулятор {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        calc.setDivider(b);
        int c = calc.devide.apply(a, b);   // деление на ноль ,нужно бросить исключение
        calc.println.accept(c);
    }

}
