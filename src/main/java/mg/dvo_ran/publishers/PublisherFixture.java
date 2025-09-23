package mg.dvo_ran.publishers;

import mg.dvo_ran.observers.MetricsStatsByUser;

public class PublisherFixture {
    private final Publisher publisher;
    private final MetricsStatsByUser statsObserver;

    public PublisherFixture() {
        this.publisher = new MetricsPublisher();
        this.statsObserver = new MetricsStatsByUser();
        this.publisher.addObserver(statsObserver);
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public MetricsStatsByUser getStatsObserver() {
        return statsObserver;
    }
}
