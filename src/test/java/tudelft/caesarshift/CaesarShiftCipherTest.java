package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    @ParameterizedTest(name = "shift={0}, message={1}, result={2}")
    @CsvSource({"3, abc, def", "3, xyz, abc", "3, Zab, invalid", "3, !yz, invalid", "3, 5an, invalid"})
    public void Shift3 (int shift, String message, String Expectedresult){
        CaesarShiftCipher CSC = new CaesarShiftCipher();
        String result = CSC.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(Expectedresult, result);
    }

    @ParameterizedTest(name = "shift={0}, message={1}, result={2}")
    @CsvSource({"-3, abc, xyz", "-3, xyz, uvw", "-3, Zab, invalid", "-3, !yz, invalid", "-3, 5an, invalid"})
    public void Shiftminus3 (int shift, String message, String Expectedresult){
        String result = new CaesarShiftCipher().CaesarShiftCipher(message, shift);
        Assertions.assertEquals(Expectedresult, result);
    }

    @ParameterizedTest(name = "shift={0}, message={1}, result={2}")
    @CsvSource({"0, abc, abc", "0, prq, prq", "0, Zab, invalid", "0, !yz, invalid", "0, 5an, invalid"})
    public void Shift0 (int shift, String message, String Expectedresult){
        String result = new CaesarShiftCipher().CaesarShiftCipher(message, shift);
        Assertions.assertEquals(Expectedresult, result);
    }
}
