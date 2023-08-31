package org.example;
import com.github.javafaker.Faker;

public class AppConfig {
    public final static String APP_URL = "http://qa-scooter.praktikum-services.ru/";
    public static Faker faker = new Faker();
    public final static String LOGIN = "Yana";
    public final static String PASSWORD = "password000";
    public final static String FIRST_NAME = "Yana";
    public final static String CUSTOMER_FIRST_NAME = "Yana";
    public final static String CUSTOMER_LAST_NAME = "Munchkin";
    public final static String ADDRESS = "москва-Сити, 12";
    public final static int METRO_STATION = 4;
    public final static String PHONE_NUMBER = "+7-800-355-35-35";
    public final static int RENT_TIME = 5;
    public final static String DELIVERY_DATE = "2023-07-12";
    public final static String TEST_COMMENT = "test comment";
    public final static String BASIC_COLOR = "BLACK";
    public final static Login LOGIN_COURIER = new Login (LOGIN,PASSWORD);
    public final static CreateUser CREATE_COURIER = new CreateUser (LOGIN,PASSWORD,FIRST_NAME);
    public final static CreateOrder CREATE_ORDER = new CreateOrder(
            CUSTOMER_FIRST_NAME,
            CUSTOMER_LAST_NAME,
            ADDRESS,
            METRO_STATION,
            PHONE_NUMBER, RENT_TIME,
            DELIVERY_DATE,TEST_COMMENT,
            new String[]{BASIC_COLOR}
    );


}
