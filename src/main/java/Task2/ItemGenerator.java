package Task2;

public abstract class ItemGenerator {
    /**
     * Открываем сундук с наградой
     */
    public void openReward(){

        GameItem gameItem = createItem();
        gameItem.open();
    }
    /**
     * Создание награды
     */
    public abstract GameItem createItem();

}
