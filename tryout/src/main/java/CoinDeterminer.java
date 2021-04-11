/**
 * Have the function CoinDeterminer(num) take the input, which will be an integer ranging from 1 to
 * 250, and return an integer output that will specify the least number of coins, that when added,
 * equal the input integer. Coins are based on a system as follows: there are coins representing the
 * integers 1, 5, 7, 9, and 11. So for example: if num is 16, then the output should be 2 because
 * you can achieve the number 16 with the coins 9 and 7. If num is 25, then the output should be 3
 * because you can achieve 25 with either 11, 9, and 5 coins or with 9, 9, and 7 coins. *
 */


public class CoinDeterminer {

  public static int CoinDeterminer(int num) {

    int[] coins = {1, 5, 7, 9, 11};

    int[] arr = new int[num + 1];
    arr[0] = 0;

    for (int i = 1; i <= num; i++) {
      arr[i] = Integer.MAX_VALUE;

      for (int j : coins) {

        if (i - j >= 0 && arr[i - j] != Integer.MAX_VALUE) {
          arr[i] = Math.min(arr[i], arr[i - j] + 1);
        }

      }

    }

    return arr[num] == Integer.MAX_VALUE ? 0 : arr[num];
  }


  public static void main(String[] args) {
    // keep this function call here

    int i = CoinDeterminer(25);

    System.out.println(i);

  }


}
