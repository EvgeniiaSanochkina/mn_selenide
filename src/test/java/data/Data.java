package data;
import com.github.javafaker.Faker;

import java.io.File;
import java.util.Date;

import static java.util.concurrent.TimeUnit.DAYS;
public class Data {

    public static String baseURL = "";

    private static final Faker faker = new Faker();

    public static String generateTile() {
        return faker.shakespeare().asYouLikeItQuote();
    }

    public static String generateDescription() {
        return faker.yoda().quote();
    }

    public static String generateEmail() {
        return faker.internet().emailAddress();
    }

    public static String generateLink() {
        return faker.internet().url();
    }

    public static String generatePartnerName() {
        return faker.company().name();
    }

    public static Date generateDate() {
        return faker.date().future(100, DAYS);
    }

}
