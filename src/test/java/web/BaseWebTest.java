package web;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseWebTest {
    @BeforeAll
    public static void setup ()  {Configuration.baseUrl = "https://www.playtech.ee";}
}
