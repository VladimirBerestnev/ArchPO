package Task2;
/**
 * Класс для получения акций Газпрома
 */
public class GazpromSharesGenerator extends ItemGenerator{
    @Override
    public GameItem createItem() {
        return new GazpromSharesReward();
    }
}
