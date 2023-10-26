public class DeliveryOrder extends Order {
    private String address;

    // Constructor
    public DeliveryOrder(String customerName, String transactionTime, String address) {
        super(customerName, transactionTime);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "DeliveryOrder [address=" + address + ", " + super.toString() + "]";
    }
}
