import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        //Данные
        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        //Вызываем целевой метод
        long actual = service.calculate(amount, registered);
        //Производим проверку(сравнение ожиданемого результата и фактического)
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        //Данные
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;
        //Вызываем целевой метод
        long actual = service.calculate(amount, registered);
        //Производим проверку(сравнение ожиданемого результата и фактического)
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();
        //Данные
        long amount = 1000;
        boolean registered = false;
        long expected = 10;
        //Вызываем целевой метод
        long actual = service.calculate(amount, registered);
        //Производим проверку(сравнение ожиданемого результата и фактического)
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();
        //Данные
        long amount = 1_000_000;
        boolean registered = false;
        long expected = 500;
        //Вызываем целевой метод
        long actual = service.calculate(amount, registered);
        //Производим проверку(сравнение ожиданемого результата и фактического)
        Assertions.assertEquals(expected, actual);
    }




}