package pl.pjwstk.s18946;
        import org.junit.jupiter.api.AfterEach;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;

        import static org.hamcrest.CoreMatchers.is;
        import static org.hamcrest.MatcherAssert.assertThat;

public class Testy {

    private WebDriver driver;

    @BeforeEach
    public void init() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterEach
    public void clean() {
        driver.close();
        driver.quit();
    }

    @Test
    public void check_search_allegro_test() throws InterruptedException {
        // wejscie na strone allegro
        driver.get("https://allegro.pl/");

        driver.findElement(By.xpath("//*[@id=\"opbox-gdpr-consents-modal\"]/div/div[2]/div/div[2]/button[1]")).click();

        // wpisanie "zabawki" w oknie wyszukiwarki
        WebElement elementSearch = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div[3]/header/div/div/div/div/form/input"));
        String input = "zabawki";
        elementSearch.sendKeys(input);
        elementSearch.submit();

        Thread.sleep(2000);

        // wybranie pierwszej pozycji
        driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[5]/div/div/div[1]/div/div/section[1]/article[1]/div/div/div[2]/div[1]/h2/a")).click();

        Thread.sleep(2000);

        // znalezienie tekstu buttona
        String buttonName = driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).getText();

        assertThat("KUP TERAZ", is(buttonName));
    }

    @Test
    public void login_to_pjatk_test() throws InterruptedException {
        // wejscie na strone planu zajec pjatk
        driver.get("https://gakko.pjwstk.edu.pl/");

        Thread.sleep(2000);
        String login = "s00000";
        String password = "haslo";

        // wpisanie loginu
        WebElement element = driver.findElement(By.xpath("//*[@id=\"userNameInput\"]"));
        element.sendKeys(login);

        Thread.sleep(2000);
        // wpisanie hasla
        element = driver.findElement(By.xpath("//*[@id=\"passwordInput\"]"));
        element.sendKeys(password);

        // wcisniecie zaloguj
        driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();

        // pobiera komunikat o nieudanym logowaniu
        String error = driver.findElement(By.xpath("//*[@id=\"errorText\"]")).getText();

        String ExpectedError="Nieprawidłowy identyfikator użytkownika lub nieprawidłowe hasło. Wpisz prawidłowy identyfikator użytkownika i hasło, a następnie spróbuj ponownie.";

        assertThat(ExpectedError, is(error));
    }
}