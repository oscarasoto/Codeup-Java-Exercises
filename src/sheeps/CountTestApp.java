/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package sheeps;

public class CountTestApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Counting Alligators…");
        Countable alligator = new Alligator();
        CountUtil.count(alligator, 3);

        System.out.println("Counting Sheep...");
        Sheep blackie = new Sheep("Blackie");
        CountUtil.count(blackie, 2);

        Sheep dolly = (Sheep) blackie.clone();
        dolly.setName("Dolly");
        CountUtil.count(dolly, 3);

        blackie.resetCount();
        CountUtil.count(blackie, 1);
    }
}
