/**
 * if, while, int[]
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
 * Teiseks leia mitu tudengit said üle mediaani?
 */
public class Algoritm {

    // Main klass on ainult sulle endale testimiseks
    public static void main(String[] args) {

        System.out.println(yleMediaani(new int[]{19, 45, 55, 67, 89}));
        System.out.println(yleMediaani(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(yleMediaani(new int[]{21, 85, 45}));

    }

    // Siia meetodi sisse kirjuta lahendus.
    private static int yleMediaani(int[] ints) {
        double mediaan = new Double(0);
        int tublidTudengid = new Integer(0);

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 60) {
                ints[i]= 60;
            }
            mediaan = mediaan + ints[i];
        }

        mediaan = mediaan/ints.length;

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > mediaan) {
                tublidTudengid++;
            }
        }

        return tublidTudengid;
    }
}
