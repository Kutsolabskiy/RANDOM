package dataNavigation;

import pages.AbstractPage;
import pages.integers.*;

public enum NumbersNavigation implements NavigationItem {

    INTEGERS("Integers", IntegerGeneratorNumberPage.class, ExpectedTitles.INTEGERS_TITLE),
    SEQUENCES("Sequences", SequencesNumbersPage.class, ExpectedTitles.SEQUENCES_TITLE),
    INTEGER_SETS("Integer Sets", IntegerSetsNumberPage.class, ExpectedTitles.INTEGER_SETS_TITLE),
    GAUSSIAN_NUMBERS("Gaussian Numbers", GaussianNumberPage.class, ExpectedTitles.GAUSSIAN_NUMBERS_TITLE),
    DECIMAL_FRACTIONS("Decimal Fractions", DecimalFractionNumberPage.class, ExpectedTitles.DECIMAL_FRACTIONS_TITLE),
    RAW_BYTES("Raw Bytes", RawBytesNumbersPage.class, ExpectedTitles.RAW_BYTES_TITLE);

    private final String description;

    private final Class<? extends AbstractPage<?>> redirectionTarget;

    private final String exceptedTitle;

    NumbersNavigation(String description, Class<? extends AbstractPage<?>> redirectionTarget, ExpectedTitles exceptedTitle){
        this.description = description;
        this.redirectionTarget = redirectionTarget;
        this.exceptedTitle = exceptedTitle.getExpectedTitle();

    }

    @Override
    public String getName() {
        return this.description;
    }

    @Override
    public String getExceptedTitle() {
        return this.exceptedTitle;
    }

    @Override
    public Class<? extends AbstractPage<?>> getRedirectionTarget() {
        return this.redirectionTarget;
    }
}
