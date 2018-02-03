import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseCityTest {
    @Test
    public void test1(){

        String parrtenZero="[1-9]+";

        Pattern pattern=Pattern.compile(parrtenZero);
        Matcher matcher=pattern.matcher("00000000");
        System.out.println(matcher.find());




    }
}
