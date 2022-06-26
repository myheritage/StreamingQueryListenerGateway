package com.mh.spark.observer;
import org.apache.spark.sql.streaming.StreamingQueryListener;
import org.apache.log4j.Logger;

/**
 * This Class is overriding org.apache.spark.sql.streaming.StreamingQueryListener.
 * With this override we can costume triggers using 'PythonObserver' interface for processed events.
 */
public class PythonStreamingQueryListener extends StreamingQueryListener {
    private final PythonObserver observer;
    private static final Logger logger = Logger.getLogger(PythonStreamingQueryListener.class);

    public PythonStreamingQueryListener(PythonObserver observer) {
        this.observer = observer;
    }

    @Override
    public void onQueryStarted(QueryStartedEvent queryStarted) {
        logger.info(String.format("Query started: %s", queryStarted.id()));
    }

    @Override
    public void onQueryTerminated(QueryTerminatedEvent queryTerminated) {
        logger.error(String.format("Query terminated: %s", queryTerminated.id()));
    }

    @Override
    public void onQueryProgress(QueryProgressEvent queryProgress) {
        logger.info(String.format("Query made progress: %s",queryProgress.progress().id()));
        this.observer.on_next(queryProgress);
    }
}
