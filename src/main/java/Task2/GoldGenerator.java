package Task2;
/**
 * Класс для получения золота
 */
public class GoldGenerator extends ItemGenerator{
    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}
