import java.security.Provider;

public class BonusMilesService {
    public int calculate(int price) {
        price = 10_000;
        int part = 20;
        int miles = 1;
        int bonus = price / part * miles;
        return bonus;


    }

}
