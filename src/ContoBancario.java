import java.text.DecimalFormat;
import java.util.Locale;

public class ContoBancario {

    private int nConto;
    private float saldo;  

    public ContoBancario(int nConto){
        this.nConto = nConto;
        this.saldo = 0;
    }

    public String getSaldo(){
        DecimalFormat dfItaliano = new DecimalFormat("#,##0.00", new java.text.DecimalFormatSymbols(Locale.ITALY));
        return dfItaliano.format(this.saldo);
    }
    public int getNconto(){
        return this.nConto;
    }

    public float deposito(float value){
        this.saldo += value;
        return this.saldo;
    }

    public void prelievo(float value){
        this.saldo -= value;
    }

    
}
