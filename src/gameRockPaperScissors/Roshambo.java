package gameRockPaperScissors;

/**
 * @author Oscar Soto on 12/1/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
enum Roshambo {
    rock("Rock!!", 1),
    paper("Paper!!", 2),
    scissors("Scissors!!", 0);

    private String label;
    private  int beatenBy;

    Roshambo(String label, int beatenBy) {
        this.label = label;
        this.beatenBy = beatenBy;
    }

    @Override
    public String toString() {
        return label;
    }

    public static Roshambo fromSelection(int number){
        return Roshambo.values()[number-1];
    }

    boolean beats(Roshambo another) {
        return beatenBy != another.ordinal();
    }

    boolean isTie(Roshambo another) {
        return equals(another);
    }


}
