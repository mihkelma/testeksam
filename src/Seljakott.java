import java.util.ArrayList;

/**
 * Created by mihkelm on 30/01/16.
 */
public class Seljakott {
    public String omanikuNimi;
    private ArrayList asjadKotis;

    public Seljakott() {
        this.omanikuNimi = "";
        this.asjadKotis = new ArrayList();

    }

    public Seljakott(String omanikuNimi) {
        this.omanikuNimi = omanikuNimi;
        this.asjadKotis = new ArrayList();
    }

    public void lisaAsi(String asi) { this.asjadKotis.add(asi);}

    public void eemaldaAsi(String asi) {
        if (asjadKotis.contains(asi)) {
            asjadKotis.remove(asi);
        } else {
            System.out.println("Seda sa küll kotti ei pannud!");
        }
    }

    public String misOnKotis() {
        if (asjadKotis.size() == 0) {
            return "Kott on tühi!";
        } else {
            return asjadKotis.toString();
        }
    }

    public int mituAsjaOnKotis() {
        if (asjadKotis.size() == 0) {
            return 0;
        } else {
            return asjadKotis.size();
        }
    }

    public void rebene() {
        asjadKotis.clear();
    }

    public String omanikuNimi() { return omanikuNimi;}


}
