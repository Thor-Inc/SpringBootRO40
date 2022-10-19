package pl.sdacademy.SpringBootRO40.db;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbInitializer implements CommandLineRunner {

    private final FruitRepository fruitRepository;

    public DbInitializer(final FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public void run(final String... args) throws Exception {
        final Fruit fruitA = new Fruit("Apple", 20.0);
        final Fruit fruitB = new Fruit("Banana", 18.0);
        fruitRepository.createFruit(fruitA); // (x)
        fruitRepository.createFruit(fruitB);
    }
}