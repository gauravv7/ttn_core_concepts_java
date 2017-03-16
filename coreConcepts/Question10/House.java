package coreConcepts.Question10;

/**
 * Created by gaurav on 15/3/17.
 */
public enum House {
    home1 ("1000"),
    home2 ("100"),
    home3 ("10");

    private final String price;

    private House(String s) {
        price = s;
    }

    public String getPrice() {
        return this.price;
    }
}
