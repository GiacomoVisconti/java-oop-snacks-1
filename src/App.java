import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {

        ContoBancario giacomoConto = new ContoBancario(1);

        giacomoConto.deposito(100000F);
        giacomoConto.prelievo(399.99F);
        giacomoConto.prelievo(128.56F);
        giacomoConto.prelievo(128.56F);
        giacomoConto.prelievo(128.56F);
        giacomoConto.prelievo(1254F);
        
        
        System.out.println(giacomoConto.getSaldo());
        
    }
}
