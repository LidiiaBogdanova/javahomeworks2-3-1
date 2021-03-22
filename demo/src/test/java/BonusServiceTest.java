import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);


        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldcalculateRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1000_000_60;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);


        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateUnRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount, registered);


        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldcalculateUnegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1000_000_60;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);


        assertEquals(expected, actual);
    }
}