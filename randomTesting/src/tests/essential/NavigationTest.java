package tests.essential;

import dataNavigation.NavigationItem;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AbstractPage;
import pages.components.NavigationPage;
import pages.homePages.HomePage;
import tests.AbstractTest;
import tests.data.NavigationDataProvider;
import utils.DriverProvider;
import utils.ElementUtils;
import utils.WaitUtils;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NavigationTest extends AbstractTest {

    private NavigationPage<?> navigationPage;

    @BeforeTest
    public void loudHomePage(){
        navigationPage = new HomePage().get();
    }

    @Test(dataProviderClass = NavigationDataProvider.class, dataProvider = "gamesNavigation")
    public void testGamesNavigation(NavigationItem item){
        testNavigation(item);
    }

    @Test(dataProviderClass = NavigationDataProvider.class, dataProvider = "numbersNavigation")
    public void testNumbersNavigation(NavigationItem item){
        testNavigation(item);
    }

    @Test(dataProviderClass = NavigationDataProvider.class, dataProvider = "listsNavigation")
    public void testList_MoreNavigation(NavigationItem item){
        testNavigation(item);
    }

    @Test(dataProviderClass = NavigationDataProvider.class, dataProvider = "drawingsNavigation")
    public void testDrawingsNavigation(NavigationItem item){
        testNavigation(item);
    }

    @Test(dataProviderClass = NavigationDataProvider.class, dataProvider = "webToolsNavigation")
    public void testWebToolsNavigation(NavigationItem item){
        testNavigation(item);
    }

    @Test(dataProviderClass = NavigationDataProvider.class, dataProvider = "statisticsNavigation")
    public void testStatisticsNavigation(NavigationItem item){
        testNavigation(item);
    }

    @Test(dataProviderClass = NavigationDataProvider.class, dataProvider = "testimonialsNavigation")
    public void testTestimonialsNavigation(NavigationItem item){
        testNavigation(item);
    }

    @Test(dataProviderClass = NavigationDataProvider.class, dataProvider = "learnMoreNavigation")
    public void testLearnMoreNavigation(NavigationItem item){
        testNavigation(item);
    }

    private void testNavigation(NavigationItem item){
        navigationPage.navigateTo(item);

        WaitUtils.waitUntilLoaded(item.getRedirectionTarget());

        Assert.assertEquals(DriverProvider.getCurrentDriver().getTitle(), item.getExceptedTitle());
        ElementUtils.windowMoveBack();



    }
}

