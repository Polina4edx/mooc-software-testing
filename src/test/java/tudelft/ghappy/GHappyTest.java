package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void doubleg () {
        GHappy gh = new GHappy ();
        boolean result = gh.gHappy("xxggxx");
        Assertions.assertTrue(result);


    }

    @Test
    public void singleg () {
        GHappy gh = new GHappy ();
        Assertions.assertFalse(gh.gHappy("xxgxx"));
    }

    @Test
    public void doubleandsingleg () {
        GHappy gh = new GHappy ();
        Assertions.assertFalse(gh.gHappy("xxggyygxx"));
    }
}
