package dataNavigation;

import pages.AbstractPage;

public interface NavigationItem {

    String getName();

    String getExceptedTitle();

    Class<? extends AbstractPage<?>> getRedirectionTarget();
}

