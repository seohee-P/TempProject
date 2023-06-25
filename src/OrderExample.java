interface Customer {
    String getOrder();
}

class CafeCustomerA1 implements Customer1 {
    public String getOrder(){
        return "a glass of iced americano";
    }
}

class CafeCustomerB1 implements Customer1 {
    public String getOrder(){
        return "a glass of strawberry latte";
    }
}

class CafeOwner {
    public void giveItem(Customer1 customer1) {
        System.out.println("Item : " + customer1.getOrder());
    }
}

public class OrderExample {
    public static void main(String[] args) throws Exception {
        CafeOwner cafeowner = new CafeOwner();
        Customer1 cafeCustomerA1 = new CafeCustomerA1();
        Customer1 cafeCustomerB1 = new CafeCustomerB1();

        cafeowner.giveItem(cafeCustomerA1);
        cafeowner.giveItem(cafeCustomerB1);
    }
}