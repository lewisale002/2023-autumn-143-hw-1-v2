/*
 * DO NOT MAKE ANY CHANGES
 */

package Problem4;

public class CompoundingResult {
    private float invested;

    private float accumulated;

    public CompoundingResult() {
    }

    public void setInvested(float invested) {
        this.invested = invested;
    }

    public void setAccumulated(float accumulated) {
        this.accumulated = accumulated;
    }

    public float getAccumulated() {
        return accumulated;
    }

    public CompoundingResult(float invested, float accumulated) {
        this.invested = invested;
        this.accumulated = accumulated;
    }

    @Override
    public boolean equals(Object o) {   // when is this being called? And, is "o" a good variable name?
        /* o is not a good variable name and this is being called to see if the current object is the same as the
         * one in the argument.
         */
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompoundingResult that = (CompoundingResult) o;
        return Math.floor(that.invested) == Math.floor(invested)
                && Math.floor(that.accumulated) == Math.floor(accumulated);
    }

    @Override
    public String toString() {  // why do we need this? To be able to print the object's variables
        return "CompoundingResult{" +
                "invested=" + invested +
                ", accumulated=" + accumulated +
                '}';
        // IntelliJ auto-generated this
    }
}