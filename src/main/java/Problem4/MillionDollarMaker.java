/*
 * DO NOT MAKE ANY CHANGES UNLESS SPECIFIED OTHERWISE
 */

package Problem4;

public class MillionDollarMaker {
    static final int MONTHS_PER_YEAR = 12;   // what does "static" and "final" do? Makes it a constant variable

    // Do not change signature (function name, parameter variable type, and return type)
    // OK to change parameter variable names. In fact, are the parameter names bad and why?
    // Yes, the parameter names are bad because they don't describe what they represent
    public static CompoundingResult calculate(float initialInvestment,
                                              float monthlyContribution,
                                              int yearsInvested,
                                              float interestRate) {

        CompoundingResult result = new CompoundingResult(); // which constructor does this call? The empty one

        /* removing obscene interest rates <-100% or >100%, negative initial investment, negative and zero years, and
        negative monthly deposit cases.
         */
        if ((interestRate > 100) || (interestRate < -100) || (initialInvestment < 0) || (yearsInvested <= 0) ||
                (monthlyContribution < 0)) {
            result.setAccumulated(0);
            //0 to mean that the input is not considered valid because illogical or not useful
            result.setInvested(0);

            return result;
        }

        float yearlyContribution = (monthlyContribution * MONTHS_PER_YEAR);

        float interestPercentage = (interestRate / 100);

        result.setAccumulated(initialInvestment);

        //this can be calculated without a loop because it's just the initial and all the monthly deposits
        result.setInvested(initialInvestment + (yearlyContribution * yearsInvested));

        for (int i = 0; i < yearsInvested; i++) {
            result.setAccumulated(result.getAccumulated() + yearlyContribution +
                    (result.getAccumulated() * interestPercentage));
            //progresses the accumulated result by one year by adding all the monthly payments and interest to it
        }

        return result;
    }
}