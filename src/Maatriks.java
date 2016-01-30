import java.util.Arrays;

/**
 * Prindi konsooli 10x100 maatriks, kus läheb joon sikk-sakk ülevalt alla.
 *
 * Näide:
 * x
 *  x
 *   x
 *    x
 *     x
 *      x
 *       x
 *        x
 *         x
 *          x
 *         x
 *        x
 *       x
 *      x
 *     x
 *    x
 *   x
 *  x
 * x
 *  x
 *   x
 *    x
 *     x
 *      jne.
 *
 * Kasuta mis iganes tähiseid soovid ülesande lahendamiseks.
 */
public class Maatriks {

    public static void main(String[] args) {
        String[][] maatriks= new String[100][10];
        String tahis = new String("o");
        int j = new Integer(0);
        int suund = new Integer(1);

        for (int i = 0; i < maatriks.length; i++) {
            maatriks[i][j] = tahis;
            j= j + suund;
            if (j==9) { suund = -1;}
            if (j==0) { suund = 1;}
        }

        for (String[] arr : maatriks) {
            System.out.println(Arrays.toString(arr));
        }
    }

}
