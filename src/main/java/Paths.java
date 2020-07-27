/**
 * Paths to various fields
 */
public enum Paths {
    NAME("body > table > tbody > tr:nth-child(3) > td > table > tbody > tr:nth-child(1) > td.block > table > tbody > tr:nth-child(8) > td.aligncenter > font > strong"),
    PHONE("body > table > tbody > tr:nth-child(3) > td > table > tbody > tr.block > td.width280 > table > tbody > tr:nth-child(3) > td > font > a"),
    EMAIL("body > table > tbody > tr:nth-child(3) > td > table > tbody > tr.block > td.width280 > table > tbody > tr:nth-child(4) > td > font > a"),
    ADDRESS("body > table > tbody > tr:nth-child(8) > td:nth-child(2) > table > tbody > tr > td > table > tbody > tr:nth-child(2) > td > font:nth-child(1) > strong > a"),
    BEDS("body > table > tbody > tr:nth-child(8) > td:nth-child(2) > table > tbody > tr > td > table > tbody > tr:nth-child(2) > td > font:nth-child(5) > strong:nth-child(1)"),
    BATHS("body > table > tbody > tr:nth-child(8) > td:nth-child(2) > table > tbody > tr > td > table > tbody > tr:nth-child(2) > td > font:nth-child(5) > strong:nth-child(2)");

    String selector;

    Paths(String selector) {
        this.selector = selector;
    }

    public String getSelector() {
        return selector;
    }
}
