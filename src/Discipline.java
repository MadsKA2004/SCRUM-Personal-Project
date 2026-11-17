public enum Discipline {
    CRAWL("CRAWL"),
    BACKSTROKE("Rygcrawl"),
    BREASTSTROKE("Brystsvømning"),
    BUTTERFLY("Butterfly");

    private final String danishName;

    Discipline(String danishName) {
        this.danishName = danishName;
    }

    @Override
    public String toString() {
        return danishName;
    }
}
