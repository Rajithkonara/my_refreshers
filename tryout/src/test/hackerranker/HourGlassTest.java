package hackerranker;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class HourGlassTest {

    @Test
    public void testHourGlass() {

        int[][] case1 =
                {{1, 2, 3, 0, 0},
                        {0, 0, 0, 0, 0},
                        {2, 1, 4, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 1, 0, 1, 0}};

        int[][] case2 =
                {{1, 1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0},
                        {0, 0, 2, 4, 4, 0},
                        {0, 0, 0, 2, 0, 0},
                        {0, 0, 1, 2, 4, 0}};

        Assertions.assertThat(HourGlass.hourglassSum(case1, 5)).isEqualTo(13);
        Assertions.assertThat(HourGlass.hourglassSum(case2, 6)).isEqualTo(19);


    }

}
