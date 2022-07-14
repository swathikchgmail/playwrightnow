import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

public class PwTest {

    @Test
    public void test1() {
        //playwright
        try (Playwright pw = Playwright.create()) {

            //browser type
            BrowserType browserType = pw.chromium();

            //Browser
            Browser browser = browserType.launch();

            //Page
            Page page = browser.newPage();

            //Page navigation
            page.navigate("http://www.servicenow.com");
            System.out.println(page.title());
        }
    }

    @Test
    public void test2() {
        //playwright
        try (Playwright pw = Playwright.create()) {

            //Page
            Page page = pw.chromium().launch().newPage();

            //Page navigation
            page.navigate("http://www.servicenow.com");
            System.out.println(page.title());
        }

    }
}
