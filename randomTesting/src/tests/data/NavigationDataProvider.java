package tests.data;

import dataNavigation.*;
import org.testng.annotations.DataProvider;

public class NavigationDataProvider {

    @DataProvider
    public static Object[][] gamesNavigation(){
        return new Object[][] {
                {GamesNavigation.LOTTERY},
                {GamesNavigation.KENO},
                {GamesNavigation.COIN},
                {GamesNavigation.DICE},
                {GamesNavigation.CARD_SHUFFLER},
                {GamesNavigation.BIRDIE}
        };
    }

    @DataProvider
    public static Object[][] numbersNavigation(){
        return new Object[][]{
                {NumbersNavigation.INTEGERS},
                {NumbersNavigation.SEQUENCES},
                {NumbersNavigation.INTEGER_SETS},
                {NumbersNavigation.GAUSSIAN_NUMBERS},
                {NumbersNavigation.DECIMAL_FRACTIONS},
                {NumbersNavigation.RAW_BYTES}
        };
    }

    @DataProvider
    public static Object[][] listsNavigation(){
        return new Object[][]{
                {ListNavigation.LIST_RANDOM},
                {ListNavigation.STRINGS},
                {ListNavigation.PASSWORDS},
                {ListNavigation.CLOCK_TIME},
                {ListNavigation.CALENDAR},
                {ListNavigation.GEOGRAPHIC_COORDINATE},
                {ListNavigation.BITMAP},
                {ListNavigation.COLOR},
                {ListNavigation.PRE_GENERETED_FILE},
                {ListNavigation.JAZZ},
                {ListNavigation.AUDIO_NOISE},
                {ListNavigation.SAMUEL_BECKETT}
        };
    }

    @DataProvider
    public static Object[][] drawingsNavigation(){
        return new Object[][]{
                {DrawingsNavigation.HOW_PICK_WINNER},
                {DrawingsNavigation.PRICE_CALCULATOR},
                {DrawingsNavigation.PUBLIC_RECORDS},
                {DrawingsNavigation.TERMS_CONDTINIONS},
                {DrawingsNavigation.DRAWING_FAQ},

                {DrawingsNavigation.THIRD_PARTY_DRAW},
                {DrawingsNavigation.STEP_BY_VIDEO},
                {DrawingsNavigation.STEP_BY_GUIDE},
        };
    }

    @DataProvider
    public static Object[][] webToolsNavigation(){
        return new Object[][]{
                {WebToolsNavigation.WIDGETS_YOU_PAGE},
                {WebToolsNavigation.API},
                {WebToolsNavigation.OLD_API},
                {WebToolsNavigation.OLD_GUIDELINES},
                {WebToolsNavigation.BANNED_HOSTS}
        };
    }

    @DataProvider
    public static Object[][] statisticsNavigation(){
        return new Object[][]{
                {StatisticsNavigation.REAL_TIME},
                {StatisticsNavigation.GRAPH_BROWSER},
                {StatisticsNavigation.TESTING_RANDOM},
                {StatisticsNavigation.TOTAL_BIT},
                {StatisticsNavigation.YOUR_QUOTA},
        };
    }

    @DataProvider
    public static Object[][] testimonialsNavigation(){
        return new Object[][]{
                {TestimonialsNavigation.LOTTERIES_DRAWINGS},
                {TestimonialsNavigation.GAMES_GAMBLING},
                {TestimonialsNavigation.RANDOM_SAMPLING},
                {TestimonialsNavigation.SIMULATIONS_MODELING},
                {TestimonialsNavigation.SECURITY},
                {TestimonialsNavigation.ARTS},
                {TestimonialsNavigation.MISCELLANEOUS}
        };
    }

    @DataProvider
    public static Object[][] learnMoreNavigation(){
        return new Object[][]{
                {LearnMoreNavigation.ABOUT_CONTACT},
                {LearnMoreNavigation.TERMS_AND_CONDITIONS_LEARN},
                {LearnMoreNavigation.FAQ_LEARN_MORE},
                {LearnMoreNavigation.INTRODUCTION},
                {LearnMoreNavigation.HISTORY},
                {LearnMoreNavigation.ACKNOWLEDGEMENTS},
                {LearnMoreNavigation.MEDIA_SCIENTIFIC},
                {LearnMoreNavigation.NEWSLETTER},
                {LearnMoreNavigation.QUOTATION},
                {LearnMoreNavigation.WHATS_NEW}
        };
    }
}
