import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.BonusService;

public class BonusServiceTest {

    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        int expected = 30;

        int actual = service.calculate(1000, true);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        int expected = 500;

        int actual = service.calculate(1_000_000, true);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateUnRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        int expected = 10;

        int actual = service.calculate(1000, false);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateUnRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        int expected = 500;

        int actual = service.calculate(1_000_000, false);
        Assertions.assertEquals(expected, actual);
    }
}
