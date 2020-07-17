package misrraimsp.uned.pfg.sqlbuilder.util.staticParameter;

public enum OrderStatus {

    COMPLETED("Completed"),
    PROCESSING("Processing"),
    SHIPPING("In shipment");

    private final String text;

    OrderStatus(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
