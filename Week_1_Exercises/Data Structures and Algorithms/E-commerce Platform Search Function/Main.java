public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Product 1", "Category 1"),
            new Product("P002", "Product 2", "Category 2"),
            new Product("P003", "Product 3", "Category 1"),
            new Product("P004", "Product 4", "Category 3")
        };

        // Linear Search
        Product foundProductLinear = LinearSearch.linearSearch(products, "P003");
        System.out.println("Linear Search Result: " + foundProductLinear);

        // Binary Search
        Product foundProductBinary = BinarySearch.binarySearch(products, "P003");
        System.out.println("Binary Search Result: " + foundProductBinary);
    }
}
