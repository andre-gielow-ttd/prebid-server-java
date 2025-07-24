import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        System.out.println("Result: [" + BigDecimal.valueOf(8.90).toPlainString() + "]");
        System.out.println("Result: [" + BigDecimal.valueOf(8.9).toPlainString() + "]");
        System.out.println("Result: [" + new BigDecimal("8.90").toPlainString() + "]");
    }
} 