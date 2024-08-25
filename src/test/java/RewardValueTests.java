import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), 0.01);
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        // Arrange
        double cashAmount = 50.0; // Example cash amount
        double expectedMiles = 50.0 * 10.0; // Conversion rate: 1 dollar = 10 miles

        // Act
        RewardValue rewardValue = new RewardValue(cashAmount);
        double actualMiles = rewardValue.getMilesValue();

        // Assert
        assertEquals(expectedMiles, actualMiles, 0.01, "The conversion from cash to miles is incorrect.");
    }

    @Test
    void convert_from_miles_to_cash() {
        // Arrange
        int milesAmount = 1000; // Example miles amount
        double expectedCash = 1000 * 0.1; // Conversion rate: 1 mile = 0.1 dollars

        // Act
        RewardValue rewardValue = new RewardValue(milesAmount);
        double actualCash = rewardValue.getCashValue();

        // Assert
        assertEquals(expectedCash, actualCash, 0.01, "The conversion from miles to cash is incorrect.");
    }
}
