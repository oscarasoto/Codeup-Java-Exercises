/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package sheeps;

public class Alligator implements Countable {
    private int count = 0;

    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    public void resetCount() {
        count = 0;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getCountString() {
        return count + " alligator";
    }
}
