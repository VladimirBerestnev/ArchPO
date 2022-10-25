package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main1 {

    public static void main(String[] args) {

        /**
         * Создаем список наград
         */

        Random random = ThreadLocalRandom.current();
        List<ItemGenerator> itemGenerators = new ArrayList<>();
        itemGenerators.add(new GemGenerator());
        itemGenerators.add(new GoldGenerator());
        itemGenerators.add(new CookieGenerator());
        itemGenerators.add(new MoneyGenerator());
        itemGenerators.add(new GazpromSharesGenerator());

        for (int i = 0; i < 10; i++) {

            int index = (int) (Math.random()*5);
            ItemGenerator itemGenerator = itemGenerators.get(index);
            itemGenerator.openReward();
        }
    }
}
