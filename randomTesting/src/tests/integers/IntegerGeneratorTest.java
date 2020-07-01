package tests.integers;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.integers.IntegerGeneratorNumberPage;
import tests.AbstractTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerGeneratorTest extends AbstractTest {


    @Test(dataProvider = "integerGenerationRequest")
    public void testIntegerGeneration(int numbersCount, int min, int max, int rowSize){
        IntegerGeneratorNumberPage integerGeneratorNumberPage = new IntegerGeneratorNumberPage()
                .get().
                        setIntegersForSimpleTest(numbersCount, min, max, rowSize);


        verifyResults(integerGeneratorNumberPage.getResults(), rowSize, min, max, numbersCount);

    }

    @DataProvider
    private static Object[][] integerGenerationRequest() {
        return new Object[][] {
                {30, 1, 10, 3},
                {15, -10, -1, 1},
                {100, -10, 10, 15},
                {10, -10, 10, 30},
        };
    }

    private void verifyResults(List<List<Integer>> results, int rowSize, int min, int max, int numbersCount) {
        List<Integer> rowSizes = results.stream().map(List::size).collect(Collectors.toList());
        Integer[] sizes = new Integer[(numbersCount / rowSize) + (numbersCount % rowSize == 0 ? 0 : 1)];
        Arrays.fill(sizes, rowSize);
        sizes[sizes.length - 1] = numbersCount % rowSize == 0 ? rowSize : numbersCount % rowSize;
        List<Integer> expectedRowSizes = Arrays.asList(sizes);
        Assert.assertEquals(rowSizes, expectedRowSizes, "Incorrect row size in results: " + results);
        List<Integer> inlineResults = results.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        List<Integer> outOfBoundsValues = inlineResults.stream()
                .filter(value -> !(value <= max && value >= min))
                .collect(Collectors.toList());
        Assert.assertTrue(
                outOfBoundsValues.isEmpty(),
                String.format("Values out of bounds found: %s in results: %s", outOfBoundsValues, results));
        Assert.assertEquals(inlineResults.size(), numbersCount, "Incorrect results count");
    }


}
