
package dia9;

import java.util.Arrays;

class Solution {
    public void gameOfLife(int[][] board) {
        int borde_derecho = board[0].length-1 , borde_bajo = board.length-1;
        int[][] board_copia = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            board_copia[i] = board[i].clone();
        }
        for (int i = 0; i <=borde_bajo; i++) {
            for (int j = 0; j <= borde_derecho; j++) {
                int cont = 0;
                if (i-1>=0 && j-1>=0) {
                    if (board_copia[i-1][j-1]==1) {
                        cont++;
                    }
                }
                if (i-1>=0 && j>=0) {
                    if (board_copia[i-1][j]==1) {
                        cont++;
                    }
                }
                if (i-1>=0 && j+1<=borde_derecho) {
                    if (board_copia[i-1][j+1]==1) {
                        cont++;
                    }
                }
                if (i>=0 && j+1<=borde_derecho) {
                    if (board_copia[i][j+1]==1) {
                        cont++;
                    }
                }
                if (i+1<=borde_bajo && j+1<=borde_derecho) {
                    if (board_copia[i+1][j+1]==1) {
                        cont++;
                    }
                }
                if (i+1<=borde_bajo && j>=0) {
                    if (board_copia[i+1][j]==1) {
                        cont++;
                    }
                }
                if (i+1<=borde_bajo && j-1>=0) {
                    if (board_copia[i+1][j-1]==1) {
                        cont++;
                    }
                }
                if (i<=borde_bajo && j-1>=0) {
                    if (board_copia[i][j-1]==1) {
                        cont++;
                    }
                }
                
                if (cont<2 && board_copia[i][j]==1) {
                    board[i][j]=0;
                }
                if ((cont==2 || cont == 3) && board_copia[i][j]==1) {
                    board[i][j]=1;
                }
                if (cont>3 && board_copia[i][j]==1) {
                    board[i][j]=0;
                }
                if (cont==3 && board_copia[i][j]==0) {
                    board[i][j]=1;
                }
            }
            
        }
        System.out.print("[");
        for (int[] i : board) {
            System.out.print(Arrays.toString(i));
            if (i!=board[borde_bajo]) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println("");
    }
}

public class ejercicio3 {

    public static void main(String[] args) {
        int[][] matrix = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        Solution s = new Solution();
        s.gameOfLife(matrix);
    }
    
}
