import org.junit.*;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertEquals;

public class JUnit_Tests {

    @Rule
    public Timeout globalTimeout = new Timeout(2);
    
}
