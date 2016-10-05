package be.softwarelab.EasyMockHelloWorld.stock;

/**
 * An interface/service to get the price of a stock
 * @author ddewaele
 *
 */
public interface StockService {
	   public double getPrice(Stock stock);
	}