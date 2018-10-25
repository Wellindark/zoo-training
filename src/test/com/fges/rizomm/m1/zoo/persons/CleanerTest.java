package com.fges.rizomm.m1.zoo.persons;
import com.fges.rizomm.m1.zoo.animals.Cat;
import com.fges.rizomm.m1.zoo.animals.Food;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CleanerTest {
    @Test
    void test_Cleaner() {

        Cleaner cleaner = new Cleaner();
        Cat cat = new Cat();
        cleaner.clean(cat);

    }
}
