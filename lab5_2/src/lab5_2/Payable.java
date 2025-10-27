package lab5_2;

/**
 * <<interface>> payable
 * Defines the contract for objects that can be paid.
 */
public interface payable {
    /**
     * Calculates the total amount to be paid.
     * @param deductionAmount Amount to be deducted.
     * @param extraBonus Amount to be added as a bonus.
     * @return The final paid amount.
     */
    public double getPaidAmount(double deductionAmount, double extraBonus);
}
    