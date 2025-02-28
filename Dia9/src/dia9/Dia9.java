
package dia9;

import java.util.ArrayList;
import java.util.List;

class solucion {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lista = new ArrayList<Integer>();
        List<List<Integer>> listica = new ArrayList<List<Integer>>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            listica.add(new ArrayList<Integer>());
            for (int j = 0; j < n; j++) {
                listica.get(i).add(matrix[i][j]);
            }
        }
        for (List<Integer> list : listica) {
            System.out.println(list);
        }
        List<Integer> espiral = new ArrayList<>();
        while (!listica.isEmpty()) {
            for (List<Integer> list : listica) {
                for (Integer i : list) {
                    espiral.add(i);
                }
                listica.remove(list);
                break;
            }
            int cont=0;
            for (List<Integer> list : listica) {
                espiral.add(list.get(list.size()-1));
                list.remove(list.size()-1);
                if (list.isEmpty()) {
                    cont++;
                }
            }
            for (int i = cont-1; i>=0;i--) {
                listica.remove(i);
            }
            if (listica.isEmpty()) {
                break;
            }
            int ultima_lista_l = listica.get(0).size()-1;
            for (int i = ultima_lista_l; i>=0; i--) {
                espiral.add(listica.get(listica.size()-1).get(i));
            }
            listica.remove(listica.size()-1);
            cont=0;
            for (int i = listica.size()-1; i >=0; i--) {
                espiral.add(listica.get(i).get(0));
                listica.get(i).remove(0);
                if (listica.get(i).isEmpty()) {
                    cont++;
                }
            }
            for (int i = cont-1; i>=0;i--) {
                listica.remove(i);
            }
        }
        return espiral;
    }
}
public class Dia9 {
    public static void main(String[] args) {
        // int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        // int[][] matrix = {{7},{9},{6}};
        int[][] matrix ={{1},
                        {2},
                        {3},
                        {4},
                        {5},
                        {6},
                        {7},
                        {8},
                        {9},
                        {10}};
        
        
        solucion s = new solucion();
        System.out.println(s.spiralOrder(matrix));
    }
    
}
