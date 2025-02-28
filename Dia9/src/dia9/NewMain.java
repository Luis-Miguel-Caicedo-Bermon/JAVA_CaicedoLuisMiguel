
package dia9;

import java.util.Arrays;

class Solution {
    public int[][] generateMatrix(int n) {
        int arriba = 0, abajo = n-1, izquierda = 0, derecha = n-1;
        int[][] lista = new int[n][n];
        int cont =1;
        while (arriba <= abajo && izquierda <= derecha) {
            for (int i = izquierda; i <= derecha; i++) {
                lista[arriba][i]=cont++;
            }
            arriba++;
            for (int i = arriba; i <= abajo; i++) {
                lista[i][derecha]=cont++;
            }
            derecha--;
            for (int i = derecha; i >=izquierda; i--) {
                lista[abajo][i]=cont++;
            }
            abajo--;
            for (int i = abajo; i >= arriba; i--) {
                lista[i][izquierda]=cont++;
            }
            izquierda++;
        }
        return lista;
    }
}
public class NewMain {

    public static void main(String[] args) {
        int n = 3;
        Solution s = new Solution();
        int [][] lista = s.generateMatrix(n);
        for (int[] i : lista) {
            System.out.println(Arrays.toString(i));
        }
    }
}
