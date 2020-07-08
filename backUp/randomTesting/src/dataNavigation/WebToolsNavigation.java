package dataNavigation;

import pages.AbstractPage;
import pages.webTools.*;

public enum  WebToolsNavigation implements NavigationItem {

    WIDGETS_YOU_PAGE("Widgets for Your Pages", WebWidgetsPage.class, ExpectedTitles.WIDGETS_YOU_PAGE_TITLE),
    API("API for Automated Clients", APIPage.class, ExpectedTitles.API_TITLE),
    OLD_API("Old API for Automated Clients", Old_API_Page.class, ExpectedTitles.OLD_API_TITLE),
    OLD_GUIDELINES("Old Guidelines for Automated Clients", OldGuidelinesPage.class, ExpectedTitles.OLD_GUIDELINES_TITLE),
    BANNED_HOSTS("Banned Hosts", BannedHostsPage.class, ExpectedTitles.BANNED_HOSTS_TITLE);

    private final String description;

    private final Class<? extends AbstractPage<?>> redirectionTarget;

    private final String expectedTitle;

    WebToolsNavigation(String description, Class<? extends AbstractPage<?>> redirectionTarget, ExpectedTitles expectedTitle){
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
