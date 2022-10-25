package Task2;

/**
 * Класс для получения печенек
 */

public class CookieGenerator extends ItemGenerator{
    @Override
    public GameItem createItem() {
        return new CookieReward();
    }
}
