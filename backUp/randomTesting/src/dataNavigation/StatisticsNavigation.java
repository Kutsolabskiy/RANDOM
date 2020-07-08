package dataNavigation;

import pages.AbstractPage;
import pages.statistics.*;

public enum StatisticsNavigation implements NavigationItem {

    REAL_TIME("Real-Time Statistics", RealTimeStatisticsPage.class, ExpectedTitles.REAL_TIME_TITLE),
    GRAPH_BROWSER("Graph Browser", GraphBrowserPage.class, ExpectedTitles.GRAPH_BROWSER_TITLE),
    TESTING_RANDOM("Testing Random Numbers", TestingRandomNumbersPage.class, ExpectedTitles.TESTING_RANDOM_TITLE),
    TOTAL_BIT("Total Bit Tally", TotalBitTallyPage.class, ExpectedTitles.TOTAL_BIT_TITLE),
    YOUR_QUOTA("Your Quota", YourQuotaPage.class, ExpectedTitles.YOUR_QUOTA_TITLE);

    private final String description;

    private final Class<? extends AbstractPage<?>> redirectionTarget;

    private final String expectedTitle;

    StatisticsNavigation(String description, Class<? extends AbstractPage<?>> redirectionTarget, ExpectedTitles expectedTitle){
        this.description = description;
        this.redirectionTarget = redirectionTarget;
        this.expectedTitle = expectedTitle.getExpectedTitle();
    }

    @Override
    public String getName() {
        return description;
    }

    @Override
    public String getExceptedTitle() {
        return expectedTitle;
    }

    @Override
    public Class<? extends AbstractPage<?>> getRedirectionTarget() {
        return redirectionTarget;
    }
}
