package dataNavigation;

import pages.AbstractPage;
import pages.FAQ_Page;
import pages.learnMore.*;

public enum LearnMoreNavigation implements NavigationItem {

    ABOUT_CONTACT("About & Contact", About_ContactPage.class, ExpectedTitles.ABOUT_CONTACT_TITLE),
    TERMS_AND_CONDITIONS_LEARN("Terms and Conditions", TermsAndConditionsPage.class, ExpectedTitles.TERMS_AND_CONDITIONS_LEARN_TITLE),
    FAQ_LEARN_MORE("FAQ", FAQ_Page.class, ExpectedTitles.FAQ_LEARN_MORE_TITLE),
    INTRODUCTION("Introduction to Randomness", IntroductionToRandomnessPage.class, ExpectedTitles.INTRODUCTION_TITLE),
    HISTORY("History of RANDOM.ORG", HistoryPage.class, ExpectedTitles.HISTORY_TITLE),
    ACKNOWLEDGEMENTS("Acknowledgements", AcknowledgementsPage.class, ExpectedTitles.ACKNOWLEDGEMENTS_TITLE),
    MEDIA_SCIENTIFIC("Media and Scientific Citations", MediaAndScientificPage.class, ExpectedTitles.MEDIA_SCIENTIFIC_TITLE),
    NEWSLETTER("Newsletter", NewsletterPage.class, ExpectedTitles.NEWSLETTER_TITLE),
    QUOTATION("Quotations about Randomness", QuotationsPage.class, ExpectedTitles.QUOTATION_TITLE),
    WHATS_NEW("What\'s New!", WhatsNewPage.class, ExpectedTitles.WHATS_NEW_TITLE);

    private final String description;

    private final Class<? extends AbstractPage<?>> redirectionTarget;

    private final String expectedTitle;

    LearnMoreNavigation(String description, Class<? extends AbstractPage<?>> redirectionTarget, ExpectedTitles expectedTitle){
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
