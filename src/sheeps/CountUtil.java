/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package sheeps;

class CountUtil {
    static void count(Countable c, int maxCount) {
        for (int i = 0; i < maxCount; i++) {
            c.incrementCount();
            System.out.println(c.getCountString());
        }
    }
}
