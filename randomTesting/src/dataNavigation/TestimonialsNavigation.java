package dataNavigation;

import pages.AbstractPage;
import pages.testimonials.*;

public enum TestimonialsNavigation implements NavigationItem {

    LOTTERIES_DRAWINGS("Lotteries and Drawings", LotteriesAndDrawingsPage.class, ExpectedTitles.LOTTERIES_DRAWINGS_TITLE),
    GAMES_GAMBLING("Games and Gambling", GamesAndGamblingPage.class, ExpectedTitles.GAMES_GAMBLING_TITLE),
    RANDOM_SAMPLING("Random Sampling", RandomSamplingPage.class, ExpectedTitles.RANDOM_SAMPLING_TITLE),
    SIMULATIONS_MODELING("Simulation and Modelling", SimulationAndModellingPage.class, ExpectedTitles.SIMULATIONS_MODELING_TITLE),
    SECURITY("Security", SecurityPage.class, ExpectedTitles.SECURITY_TITLE),
    ARTS("The Arts", TheArtsPage.class, ExpectedTitles.ARTS_TITLE),
    MISCELLANEOUS("Miscellaneous", MiscellaneousPage.class, ExpectedTitles.MISCELLANEOUS);

    private final String description;

    private final Class<? extends AbstractPage<?>> redirectionTarget;

    private final String expectedTitle;

    TestimonialsNavigation(String description, Class<? extends AbstractPage<?>> redirectionTarget, ExpectedTitles expectedTitles){
        this.description = description;
        this.redirectionTarget = redirectionTarget;
        this.expectedTitle = expectedTitles.getExpectedTitle();
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
