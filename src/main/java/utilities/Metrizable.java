package utilities;

/**
 * Finite metric used as the state space of a retro-preferential process.
 *
 * @author rwdarli
 * @see simulators.Retropreferential
 */
public interface Metrizable {
    double distanceTo(Metrizable other);

    boolean equals(Metrizable other);
}
