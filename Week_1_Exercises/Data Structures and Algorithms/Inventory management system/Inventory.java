import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    // Add a product to the inventory
    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    // Update a product in the inventory
    public void updateProduct(String productId, Product updatedProduct) {
        if (products.containsKey(productId)) {
            products.put(productId, updatedProduct);
        } else {
            System.out.println("Product not found!");
        }
    }

    // Delete a product from the inventory
    public void deleteProduct(String productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
        } else {
            System.out.println("Product not found!");
        }
    }

    // Display all products in the inventory
    public void displayProducts() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("P001", "Laptop", 10, 999.99);
        Product product2 = new Product("P002", "Smartphone", 20, 499.99);
        Product product3 = new Product("P003", "Tablet", 15, 299.99);

        // Add products
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        // Display products
        System.out.println("Inventory after adding products:");
        inventory.displayProducts();

        // Update product
        Product updatedProduct = new Product("P002", "Smartphone", 25, 479.99);
        inventory.updateProduct("P002", updatedProduct);
        System.out.println("\nInventory after updating product P002:");
        inventory.displayProducts();

        // Delete product
        inventory.deleteProduct("P003");
        System.out.println("\nInventory after deleting product P003:");
        inventory.displayProducts();
    }
}
