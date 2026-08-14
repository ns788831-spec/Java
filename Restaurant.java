class Restaurant {

    static int orders = 0;

    void bill(int amount) {
        orders++;
        System.out.println("Dine In Bill = " + amount);
    }

    void bill(int amount, String type) {
        orders++;
        System.out.println("Takeaway Bill = " + amount);
    }

    void bill(int amount, String type, int charge) {
        orders++;
        System.out.println("Delivery Bill = " + (amount + charge));
    }

    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        r.bill(389);
        r.bill(390, "Takeaway");
        r.bill(6430, "Delivery", 50);

        System.out.println("Total Orders = " + orders);
    }
}