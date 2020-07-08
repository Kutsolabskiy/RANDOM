package dataNavigation;

import pages.games.*;
import pages.integers.*;
import pages.lists_more.*;

public enum ExpectedTitles {

    /* GAMES */
    LOTTERY_TITLE("RANDOM.ORG - Lottery Quick Pick"),
    KENO_TITLE("RANDOM.ORG - Keno Quick Pick"),
    COIN_TITLE("RANDOM.ORG - Coin Flipper"),
    DICE_TITLE("RANDOM.ORG - Dice Roller"),
    CARD_SHUFFLER_TITLE("RANDOM.ORG - Playing Card Shuffler"),
    BIRDIE_TITLE("RANDOM.ORG - Birdie Fund Randomizer"),

    /* INTEGERS */
    INTEGERS_TITLE("RANDOM.ORG - Integer Generator"),
    SEQUENCES_TITLE("RANDOM.ORG - Sequence Generator"),
    INTEGER_SETS_TITLE("RANDOM.ORG - Integer Set Generator"),
    GAUSSIAN_NUMBERS_TITLE("RANDOM.ORG - Gaussian Random Number Generator"),
    DECIMAL_FRACTIONS_TITLE("RANDOM.ORG - Decimal Fraction Generator"),
    RAW_BYTES_TITLE("RANDOM.ORG - Byte Generator"),

    /* LIST&MORE */
    LIST_RANDOM_TITLE("RANDOM.ORG - List Randomizer"),
    STRINGS_TITLE("RANDOM.ORG - String Generator"),
    PASSWORDS_TITLE("RANDOM.ORG - Password Generator"),
    CLOCK_TIME_TITLE("RANDOM.ORG - Clock Time Generator"),
    CALENDAR_TITLE("RANDOM.ORG - Calendar Date Generator"),
    GEOGRAPHIC_COORDINATE_TITLE("RANDOM.ORG - Geographic Coordinates"),
    BITMAP_TITLE("RANDOM.ORG - Bitmap Generator"),
    COLOR_TITLE("Random Hex Color Code Generator - RANDOM.ORG"),
    PRE_GENERETED_FILE_TITLE("Pregenerated File Archive - RANDOM.ORG"),
    JAZZ_TITLE("RANDOM.ORG - Jazz Scale Generator"),
    AUDIO_NOISE_TITLE("RANDOM.ORG - Audio Noise Generator"),
    SAMUEL_BECKETT_TITLE("Possible Lessnesses"),

    /* DRAWINGS */
    HOW_PICK_WINNER_TITLE("RANDOM.ORG - Frequently Asked Questions (FAQ)"),
    THIRD_PARTY_DRAW_TITLE("RANDOM.ORG - Third-Party Draw Service - Step "),
    STEP_BY_GUIDE_TITLE("RANDOM.ORG - Guide to Random Drawings"),
    STEP_BY_VIDEO_TITLE("RANDOM.ORG - Video Tutorial #1 - Blog and Business Giveaways"),
    PRICE_CALCULATOR_TITLE("RANDOM.ORG - Third-Party Draw Service - Price Calculator"),
    PUBLIC_RECORDS_TITLE("RANDOM.ORG - Third-Party Draw Service - Public Records"),
    TERMS_CONDTINIONS_DRAWING_TITLE("RANDOM.ORG - Third-Party Draw Service - Description"),
    DRAWING_FAQ_TITLE("RANDOM.ORG - Frequently Asked Questions (FAQ)"),

    /* WEB TOOLS */
    WIDGETS_YOU_PAGE_TITLE("RANDOM.ORG - Web Widgets"),
    API_TITLE("API Dashboard - RANDOM.ORG"),
    OLD_API_TITLE("RANDOM.ORG - HTTP Interface Description"),
    OLD_GUIDELINES_TITLE("RANDOM.ORG - Automated Clients"),
    BANNED_HOSTS_TITLE("RANDOM.ORG - List of Banned Hosts"),

    /* STATISTICS */
    REAL_TIME_TITLE("RANDOM.ORG - Real-Time Statistics"),
    GRAPH_BROWSER_TITLE("RANDOM.ORG - Statistics Browser"),
    TESTING_RANDOM_TITLE("RANDOM.ORG - Statistical Analysis"),
    TOTAL_BIT_TITLE("RANDOM.ORG - Bit Tally"),
    YOUR_QUOTA_TITLE("Quota Top-Up"),

    /* TESTIMONIALS */
    LOTTERIES_DRAWINGS_TITLE("RANDOM.ORG - Testimonials - Lotteries and Draws"),
    GAMES_GAMBLING_TITLE("RANDOM.ORG - Testimonials - Games and Gambling"),
    RANDOM_SAMPLING_TITLE("RANDOM.ORG - Testimonials - Random Sampling"),
    SIMULATIONS_MODELING_TITLE("RANDOM.ORG - Testimonials - Simulation and Modelling"),
    SECURITY_TITLE("RANDOM.ORG - Testimonials - Security"),
    ARTS_TITLE("RANDOM.ORG - Testimonials - The Arts"),
    MISCELLANEOUS("RANDOM.ORG - Testimonials - Miscellaneous"),

    /* LEARN MORE */
    ABOUT_CONTACT_TITLE("RANDOM.ORG - Company Information"),
    TERMS_AND_CONDITIONS_LEARN_TITLE("RANDOM.ORG - Terms and Conditions - Privacy Policy"),
    FAQ_LEARN_MORE_TITLE("RANDOM.ORG - Frequently Asked Questions (FAQ)"),
    INTRODUCTION_TITLE("RANDOM.ORG - Introduction to Randomness and Random Numbers"),
    HISTORY_TITLE("RANDOM.ORG - The History of RANDOM.ORG"),
    ACKNOWLEDGEMENTS_TITLE("RANDOM.ORG - List of Helpful Individuals"),
    MEDIA_SCIENTIFIC_TITLE("RANDOM.ORG - Media Coverage and Citations"),
    NEWSLETTER_TITLE("RANDOM.ORG - Newsletter"),
    QUOTATION_TITLE("RANDOM.ORG - Quotations about Randomness"),
    WHATS_NEW_TITLE("RANDOM.ORG - News");



    private final String expectedTitle;

    ExpectedTitles(String expectedTitle){
        this.expectedTitle = expectedTitle;
    }

    public String getExpectedTitle(){
        return this.expectedTitle;
    }

}
