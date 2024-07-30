public class ObserverPatternTest {

    public static void main(String[] args) {
        // Create stock market and observers
        StockMarket stockMarket = new StockMarket();
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Register observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Update stock price and notify observers
        stockMarket.setPrice(150.0);
        stockMarket.setPrice(155.5);

        // Deregister an observer and update stock price again
        stockMarket.deregisterObserver(mobileApp);
        stockMarket.setPrice(160.0);
    }
}
