import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectTextTest {

    @Test
    public void textSelectionTest() {
        try(Playwright pw = Playwright.create()) {
            BrowserType browserType = pw.chromium();
            Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(2000));
            Page page = browser.newPage();
            page.navigate("https://www.google.com/");
            page.click("I'm Feeling Lucky");
            Assertions.assertEquals(page.title(), "");
        }
    }
}
