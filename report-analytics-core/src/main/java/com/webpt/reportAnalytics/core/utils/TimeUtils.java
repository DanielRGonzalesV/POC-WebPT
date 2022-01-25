package com.webpt.reportAnalytics.core.utils;

import com.webpt.reportAnalytics.core.constants.EnvConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Time utils class.
 */
public final class TimeUtils {

    private static final Logger LOGGER = LogManager.getLogger(EnvConstants.class.getSimpleName());

    /**
     * Constructor to prevent instantiation.
     */
    private TimeUtils() {
    }

    /**
     * This method sleep the tread for a period of time.
     *
     * @param millis to sleep.
     */
    public static void waitFixedTime(final int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ex) {
            LOGGER.info(ex.getMessage());
        }
    }
}
