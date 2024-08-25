public class RewardValue {
    private double cashValue;
    private int milesValue;
    private static final double CASH_TO_MILES_RATE = 10.0; // 1 dollar = 10 miles
    private static final double MILES_TO_CASH_RATE = 0.1;  // 1 mile = 0.1 dollars

    // Constructor for cash
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) convertCashToMiles(cashValue);
    }

    // Constructor for miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public double convertCashToMiles(double cash) {
        return cash * CASH_TO_MILES_RATE;
    }

    public double convertMilesToCash(int miles) {
        return miles * MILES_TO_CASH_RATE;
    }
}
