package de.goerke.tobias.anchorj.base.execution;

import de.goerke.tobias.anchorj.base.AnchorCandidate;

import java.util.function.BiFunction;

/**
 * Interface defining all methods a sampling service is obligated to provide.
 */
public interface SamplingService {

    /**
     * Returns the time spent taking samples
     *
     * @return the time spent taking samples in milliseconds
     */
    double getTimeSpentSampling();

    /**
     * Creates a session that has to be used in order to obtain samples.
     *
     * @param explainedInstanceLabel the explained instance label
     * @return an {@link SamplingSession} instance.
     */
    SamplingSession createSession(final int explainedInstanceLabel);
}
