import java.util.Scanner;

public class Pikaptcha {
    public static void main(String args[]) {

      char[][] tab=readElementsInput () ;
      solution (tab) ;

     }

     public static char[][] readElementsInput()   {

        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int height = in.nextInt();
        char[][] tab = new char[height][width];

        for (int i=0 ; i < height; i++) {
                  String line = in.next();
                  tab[i] = line.toCharArray();
        }

        return tab;
    }

    public static void solution(char[][] tab ) {
        int height = tab.length;
        int width = tab[0].length;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int nb_neighbor_cell = 0;

                if (tab[i][j] == '#')  System.out.print('#');
                else {
                     nb_neighbor_cell = calculateNbrNeighbors(tab, i, j, width, height);
                     System.out.print(nb_neighbor_cell);
                }

            }
            System.out.println();
        }
    }

     public static int calculateNbrNeighbors(char[][] tab, int i, int j, int width, int height) {
        int nb_neighbor_cell = 0;

        // Top Cell
        if (i > 0 && tab[i - 1][j] == '0') nb_neighbor_cell += 1;

        // Buttom cell
        if (i < height - 1 && tab[i + 1][j] == '0') nb_neighbor_cell += 1;

        // Left cell
        if (j > 0 && tab[i][j - 1] == '0') nb_neighbor_cell += 1;

        // Right cell
        if (j < width - 1 && tab[i][j + 1] == '0') nb_neighbor_cell += 1;

        return nb_neighbor_cell;

    }




}