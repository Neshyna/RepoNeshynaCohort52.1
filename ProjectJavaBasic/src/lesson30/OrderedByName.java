package lesson30;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//alphabetic order
@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrderedByName {

    @Test
    @Order(10)
    void testB(){
        System.out.println("testB");
    }
    @Test
    @Order(10)
    void testA(){
        System.out.println("testA");
    }
    @Test
    @Order(10)
    void testC(){
        System.out.println("testC");
    }
}
