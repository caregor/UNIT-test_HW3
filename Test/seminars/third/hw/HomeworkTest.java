package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
}