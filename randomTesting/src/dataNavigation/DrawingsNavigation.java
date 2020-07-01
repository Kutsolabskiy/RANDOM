package dataNavigation;

import pages.AbstractPage;
import pages.FAQ_Page;
import pages.drawings.*;

public enum  DrawingsNavigation implements NavigationItem {

    HOW_PICK_WINNER("How to Pick a Winner (FREE)", HowPickWinner.class, ExpectedTitles.HOW_PICK_WINNER_TITLE),
    THIRD_PARTY_DRAW("Third-Party Draw Service", ThirdPartyDrawServicePage.class, ExpectedTitles.THIRD_PARTY_DRAW_TITLE),
    STEP_BY_GUIDE("Step by Step Guide", StepByStepGuidePage.class, ExpectedTitles.STEP_BY_GUIDE_TITLE),
    STEP_BY_VIDEO("Step by Step Video", StepByStepVideoPage.class, ExpectedTitles.STEP_BY_VIDEO_TITLE),
    PRICE_CALCULATOR("Price Calculator", PriceCalculatorPage.class, ExpectedTitles.PRICE_CALCULATOR_TITLE),
    PUBLIC_RECORDS("Public Records", PublicRecordsPage.class, ExpectedTitles.PUBLIC_RECORDS_TITLE),
    TERMS_CONDTINIONS("Terms and Conditions", TermsAndConditionsPage.class, ExpectedTitles.TERMS_CONDTINIONS_DRAWING_TITLE),
    DRAWING_FAQ("Drawing FAQ", FAQ_Page.class, ExpectedTitles.DRAWING_FAQ_TITLE);


    private final String description;

    private final Class<? extends AbstractPage<?>> redirectionTarget;

    private final String expectedTitle;

    DrawingsNavigation(String description, Class<? extends AbstractPage<?>> redirectionTarget, ExpectedTitles expectedTitle){
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
