package lab8;
import org.junit.jupiter.api.*;

public class StudentTest {
    private StudentTest test1;
    private StudentTest test2;
    @BeforeEach
    public void setUp() {
        this.test1 = new StudentTest();
    }

    @AfterEach
    public void clean() {
        this.test1 = null;
    }
    @Test
    @DisplayName("equals test")
    public void testEquals() {
        Assertions.assertTrue(test1.equals(test1));
        Assertions.assertFalse(test1.equals(test2));
    }

}
