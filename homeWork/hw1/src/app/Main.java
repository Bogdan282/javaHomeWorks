package app;

public class Main {
    public static void main(String[] args) {
        int orderNumber;
        String clientName;
        String device;
        float price;
        String address;

        orderNumber = 1;
        clientName = "Alice";
        device = "smartphone";
        price = 305.99f;
        address = "Moon Street, 10";
        System.out.println("Order No " + orderNumber +
                " Client: " + clientName + ".\nProduct: " +
                device + "\nPrice EUR: " + price +
                "\nAddress: " + address);


        orderNumber = 2;
        clientName = "Tom";
        device = "laptop";
        price = 570.95f;
        address = "Terra Street, 17";
        System.out.println("Order No " + orderNumber +
                " Client: " + clientName + ".\nProduct: " +
                device + "\nPrice EUR: " + price +
                "\nAddress: " + address);
    }
}