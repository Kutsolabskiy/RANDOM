package dataNavigation;

import pages.AbstractPage;
import pages.games.*;
import tests.AbstractTest;

public enum  GamesNavigation implements NavigationItem {

    LOTTERY("Lottery Quick Pick", LotteryQuickPickGamePage.class, ExpectedTitles.LOTTERY_TITLE),
    KENO("Keno Quick Pick", KenoQuickPickGamePage.class, ExpectedTitles.KENO_TITLE),
    COIN("Coin Flipper", CoinFlipperGamePage.class, ExpectedTitles.COIN_TITLE),
    DICE("Dice Roller", DiceRollerGamePage.class, ExpectedTitles.DICE_TITLE),
    CARD_SHUFFLER("Playing Card Shuffler", PlayingCardShufflerGamePage.class, ExpectedTitles.CARD_SHUFFLER_TITLE),
    BIRDIE("Birdie Fund Generator", BirdieFundRandomizerGamePage.class, ExpectedTitles.BIRDIE_TITLE);


    private final String description;  //description - описание

    private final String expectedTitle;

    private final Class<? extends AbstractPage<?>> redirectionTarget;  //redirectionTarget - цель перенаправления

    GamesNavigation(String desc, Class<? extends AbstractPage<?>> redirectionTarget, ExpectedTitles expectedTitle) {
        this.description = desc;
        this.redirectionTarget = redirectionTarget;
        this.expectedTitle = expectedTitle.getExpectedTitle();
    }

    @Override
    public String getName(){
        return this.description;
    }

    @Override
    public String getExceptedTitle() {
        return this.expectedTitle;
    }

    @Override
    public Class<? extends AbstractPage<?>> getRedirectionTarget() {
        return redirectionTarget;
    }
}
