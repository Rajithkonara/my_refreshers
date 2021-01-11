package hackerranker;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class RepeatedStringTest {

    @Test
    public void testRepeatedString() {

        Assertions.assertThat(RepeatedString.repeatedString("aba", 10)).isEqualTo(7);
        Assertions.assertThat(RepeatedString.repeatedString("a", 1000000000)).isEqualTo(1000000000);
        Assertions.assertThat(RepeatedString.repeatedString("aab", 882787)).isEqualTo(588525);

    }

}
