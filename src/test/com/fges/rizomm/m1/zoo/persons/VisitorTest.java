package com.fges.rizomm.m1.zoo.persons;
import com.fges.rizomm.m1.zoo.animals.Cat;
import com.fges.rizomm.m1.zoo.animals.Food;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VisitorTest {
    @Test
    void test_childVisitor(){
        VisitorChild child = new VisitorChild();
        assertTrue(child.age == AgeEnum.Child);
    }
    @Test
    void test_adultVisitor(){
        VisitorAdult adult = new VisitorAdult();
        assertTrue(adult.age==AgeEnum.Adult);
    }

}
