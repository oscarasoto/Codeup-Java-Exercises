import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Oscar Soto on 11/24/16.
 *         There is no reasonable excuse for doing anything less than your best.
 *         - Martin, Robert C.
 */
public class AtBat {

    public enum Result {
        OUT,
        SINGLE,
        DOUBLE,
        TRIPLE,
        HOMERUN;

        static Result basesEarned(int numberOfBases) {
            return Result.values()[numberOfBases];
        }
    }

    private final Result bases;

    AtBat(Result bases) {
       this.bases = bases;
    }



}
