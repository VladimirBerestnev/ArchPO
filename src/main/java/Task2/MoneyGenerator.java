package Task2;
/**
 * Класс для получения денег
 */
public class MoneyGenerator extends ItemGenerator{
    @Override
    public GameItem createItem() {
        return new MoneyReward();
    }
}
