package hackerranker.java;

import java.util.Scanner;

public class OneDPartTwo {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int q = scan.nextInt();
    while (q-- > 0) {
      int n = scan.nextInt();
      int leap = scan.nextInt();

      int[] game = new int[n];
      for (int i = 0; i < n; i++) {
        game[i] = scan.nextInt();
      }

      System.out.println((canWin(leap, game)) ? "YES" : "NO");
    }
    scan.close();
  }

  public static boolean canWin(int leap, int[] game) {

  return solution(leap, game, 0);
  }

  public static boolean solution(int leap, int[] game, int i) {

    // if we can get to end of the array
    if (i >= game.length) {
      return  true;
    }

    if (i < 0  || game[i] == 1) {
      return false;
    }

    game[i] = 1;

    boolean b =
        solution(leap, game, i + leap) || solution(leap, game, i + 1) || solution(leap, game,
            i - 1);

    System.out.println(b);

    return b;
  }

}
