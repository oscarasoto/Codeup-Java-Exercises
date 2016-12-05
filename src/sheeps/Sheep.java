/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package sheeps;

// Marker interface

public class Sheep implements Countable, Cloneable {
    private int count = 0;
    private String name;

    public Sheep(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
        return count + " " + name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Sheep copy = new Sheep(this.name);

        return copy;
    }
}
