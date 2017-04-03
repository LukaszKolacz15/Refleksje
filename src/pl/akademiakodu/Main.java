package pl.akademiakodu;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {

        Class myClass = Player.class;
        Field[] fileds = myClass.getDeclaredFields();

        for(Field filed : fileds){
            System.out.println(filed.getName());
        }

    }
}
