public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Customer 1", 150.5),
            new Order("O002", "Customer 2", 250.0),
            new Order("O003", "Customer 3", 100.0),
            new Order("O004", "Customer 4", 200.75)
        };

        // Bubble Sort
        BubbleSort.bubbleSort(orders);
        System.out.println("Bubble Sort Result:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Reset the orders array
        orders = new Order[]{
            new Order("O001", "Customer 1", 150.5),
            new Order("O002", "Customer 2", 250.0),
            new Order("O003", "Customer 3", 100.0),
            new Order("O004", "Customer 4", 200.75)
        };

        // Quick Sort
        QuickSort.quickSort(orders, 0, orders.length - 1);
        System.out.println("Quick Sort Result:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
