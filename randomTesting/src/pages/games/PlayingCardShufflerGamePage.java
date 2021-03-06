package pages.games;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.components.NavigationPage;
import utils.ElementUtils;

public class PlayingCardShufflerGamePage extends NavigationPage<PlayingCardShufflerGamePage> {
    @FindBy(xpath = "//h2[text() = 'Playing Card Shuffler']")
    private WebElement pageHeadingElement;

    @Override
    public boolean isLoaded() {
        return ElementUtils.isDisplayed(pageHeadingElement);
    }
}
