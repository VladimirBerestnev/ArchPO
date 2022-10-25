package Task2;
/**
 * Класс для получения алмазов
 */
public class GemGenerator extends ItemGenerator{
    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}
