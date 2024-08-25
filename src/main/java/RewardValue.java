public class RewardValue {

    private double cashValue;
    private double milesValue;

    //  accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue); // Convert cash to miles
    }

    // to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // to get miles value
    public double getMilesValue() {
        return milesValue;
    }

    // to Convert cash to miles
    private double cashToMiles(double cash) {
        return cash / 0.0035;
    }
}
