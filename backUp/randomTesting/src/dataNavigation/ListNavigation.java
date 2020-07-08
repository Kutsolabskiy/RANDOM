package dataNavigation;

import pages.AbstractPage;
import pages.lists_more.*;

public enum  ListNavigation implements NavigationItem {

    LIST_RANDOM("List Randomizer", ListRandomizerPage.class, ExpectedTitles.LIST_RANDOM_TITLE),
    STRINGS("Strings", StringsPage.class, ExpectedTitles.STRINGS_TITLE),
    PASSWORDS("Passwords", PasswordsGeneratorPage.class, ExpectedTitles.PASSWORDS_TITLE),
    CLOCK_TIME("Clock Times", ClockTimeGeneratorPage.class, ExpectedTitles.CLOCK_TIME_TITLE),
    CALENDAR("Calendar Dates", CalendarDataGeneratorPage.class, ExpectedTitles.CALENDAR_TITLE),
    GEOGRAPHIC_COORDINATE("Geographic Coordinates", GeographicCoordinatesPage.class, ExpectedTitles.GEOGRAPHIC_COORDINATE_TITLE),
    BITMAP("Bitmaps",BitmapGeneratorPage.class,ExpectedTitles.BITMAP_TITLE),
    COLOR("Hex Color Codes",ColorGeneratorPage.class, ExpectedTitles.COLOR_TITLE), //ITS NOT WORKING
    PRE_GENERETED_FILE("Pregenerated Files", PreGeneratedFilePage.class, ExpectedTitles.PRE_GENERETED_FILE_TITLE),  //ITS NOT WORKING
    JAZZ("Jazz Scales", JazzGeneratorPage.class, ExpectedTitles.JAZZ_TITLE),
    AUDIO_NOISE("Pure White Audio Noise", AudioNoiseGeneratorPage.class, ExpectedTitles.AUDIO_NOISE_TITLE),
    SAMUEL_BECKETT("Samuel Beckett", SamuelBeckettInfoPage.class,ExpectedTitles.SAMUEL_BECKETT_TITLE);

    private final String description;

    private final Class<? extends AbstractPage<?>> redirectionTarget;

    private final String expectedTitle;

    ListNavigation(String description, Class<? extends AbstractPage<?>> redirectionTarget, ExpectedTitles expectedTitle){
        this.description = description;
        this.redirectionTarget = redirectionTarget;
        this.expectedTitle = expectedTitle.getExpectedTitle();
    }

    @Override
    public String getName() {
        return this.description;
    }

    @Override
    public String getExceptedTitle() {
        return this.expectedTitle;
    }

    @Override
    public Class<? extends AbstractPage<?>> getRedirectionTarget() {
        return this.redirectionTarget;
    }
}
