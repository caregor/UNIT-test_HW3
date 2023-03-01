package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminars.third.coverage.hw.Homewowrk;

import static org.junit.jupiter.api.Assertions.*;

public class HomeworkTest {
    private Homewowrk hw;
    @BeforeEach
    void init(){
        hw = new Homewowrk();
    }
    @Test
    void evenNumber(){
    assertTrue(hw.evenOddNumber(2));
}
    @Test
    void oddNumber(){
        assertFalse(hw.evenOddNumber(1));
    }
    @ParameterizedTest
    @ValueSource(ints = {26,50,99})
    void positiveInput (int input){
        assertTrue(hw.numberInInterval(input));
    }
    @ParameterizedTest
    @ValueSource(ints = {25,100})
    void negativeInput (int input){
        assertFalse(hw.numberInInterval(input));
    }
}