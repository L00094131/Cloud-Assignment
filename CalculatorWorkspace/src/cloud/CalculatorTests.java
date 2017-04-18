package cloud;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTests {

	private Calculator house;

	
	@Before
	public void setUp() {
		house = new Calculator(2500.0, 25500.0, 3000.0);
	}
	
	
	@Test
	public void testGetServiceCharge() {
		assertThat(house.getServiceCharge(), is(equalTo(250.0)));
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetMinHouseSizeException() {
		house.setSquareFeetPrice(120.0, 0.0);
		assertThat(house.getSquareFeet(), is(equalTo(120.0)));
		assertThat(house.getCurrentPrice(), is(equalTo(0.0)));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetBelowMinHouseSizeException() {
		house.setSquareFeetPrice(19.9, 0.0);
		assertThat(house.getSquareFeet(), is(equalTo(19.9)));
		assertThat(house.getCurrentPrice(), is(equalTo(0.0)));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetMinusHouseSizeException() {
		house.setSquareFeetPrice(-1.0, 0.0);
		assertThat(house.getSquareFeet(), is(equalTo(-1.0)));
		assertThat(house.getCurrentPrice(), is(equalTo(0.0)));
	}
		
	@Test
	public void testSetSmallHouseSizeCurrentPriceMin() {
		house.setSquareFeetPrice(121.0, 5000.0);
		assertThat(house.getSquareFeet(), is(equalTo(121.0)));
		assertThat(house.getCurrentPrice(), is(equalTo(5000.0)));
	}
	
	@Test
	public void testSetSmallHouseSizeCurrentPriceAboveMin() {
		house.setSquareFeetPrice(121.1, 5000.0);
		assertThat(house.getSquareFeet(), is(equalTo(121.1)));
		assertThat(house.getCurrentPrice(), is(equalTo(5000.0)));
	}
	
	@Test
	public void testSetSmallHouseSizeCurrentPriceMax() {
		house.setSquareFeetPrice(2500.0, 5000.0);
		assertThat(house.getSquareFeet(), is(equalTo(2500.0)));
		assertThat(house.getCurrentPrice(), is(equalTo(5000.0)));
	}	
	
	@Test
	public void testSetSmallHouseSizeCurrentPriceBelowMax() {
		house.setSquareFeetPrice(2499.9, 5000.0);
		assertThat(house.getSquareFeet(), is(equalTo(2499.9)));
		assertThat(house.getCurrentPrice(), is(equalTo(5000.0)));
	}
	
	@Test
	public void testSetMediumHouseSizeCurrentPriceMin() {
		house.setSquareFeetPrice(2500.1, 10000.0);
		assertThat(house.getSquareFeet(), is(equalTo(2500.1)));
		assertThat(house.getCurrentPrice(), is(equalTo(10000.0)));
	}
	
	@Test
	public void testSetMediumHouseSizeCurrentPriceAboveMin() {
		house.setSquareFeetPrice(2500.2, 10000.0);
		assertThat(house.getSquareFeet(), is(equalTo(2500.2)));
		assertThat(house.getCurrentPrice(), is(equalTo(10000.0)));
	}
	
	@Test
	public void testSetMediumHouseSizeCurrentPriceMax() {
		house.setSquareFeetPrice(3000.0, 10000.0);
		assertThat(house.getSquareFeet(), is(equalTo(3000.0)));
		assertThat(house.getCurrentPrice(), is(equalTo(10000.0)));
	}
	
	@Test
	public void testSetMediumHouseSizeCurrentPriceBelowMax() {
		house.setSquareFeetPrice(2999.9, 10000.0);
		assertThat(house.getSquareFeet(), is(equalTo(2999.9)));
		assertThat(house.getCurrentPrice(), is(equalTo(10000.0)));
	}
	@Test
	public void testSetLargeHouseSizeCurrentPriceMin() {
		house.setSquareFeetPrice(3000.1, 15000.0);
		assertThat(house.getSquareFeet(), is(equalTo(3000.1)));
		assertThat(house.getCurrentPrice(), is(equalTo(15000.0)));
	}
	
	@Test
	public void testSetLargeHouseSizeCurrentPriceAboveMin() {
		house.setSquareFeetPrice(3000.2, 15000.0);
		assertThat(house.getSquareFeet(), is(equalTo(3000.2)));
		assertThat(house.getCurrentPrice(), is(equalTo(15000.0)));
	}
	
	@Test
	public void testSetLargeHouseSizeCurrentPriceMax() {
		house.setSquareFeetPrice(4000.0, 15000.0);
		assertThat(house.getSquareFeet(), is(equalTo(4000.0)));
		assertThat(house.getCurrentPrice(), is(equalTo(15000.0)));
	}
	
	@Test
	public void testSetLargeHouseSizeCurrentPriceBelowMax() {
		house.setSquareFeetPrice(3999.9, 15000.0);
		assertThat(house.getSquareFeet(), is(equalTo(3999.9)));
		assertThat(house.getCurrentPrice(), is(equalTo(15000.0)));
	}
	@Test
	public void testSetExtraLargeHouseSizeCurrentPriceMin() {
		house.setSquareFeetPrice(4000.1, 20000.0);
		assertThat(house.getSquareFeet(), is(equalTo(4000.1)));
		assertThat(house.getCurrentPrice(), is(equalTo(20000.0)));
	}
	
	@Test
	public void testSetExtraLargeHouseSizeCurrentPriceAboveMin() {
		house.setSquareFeetPrice(4000.2, 20000.0);
		assertThat(house.getSquareFeet(), is(equalTo(4000.2)));
		assertThat(house.getCurrentPrice(), is(equalTo(20000.0)));
	}
	
	@Test
	public void testSetExtraLargeHouseSizeCurrentPriceMax() {
		house.setSquareFeetPrice(5000.0, 20000.0);
		assertThat(house.getSquareFeet(), is(equalTo(5000.0)));
		assertThat(house.getCurrentPrice(), is(equalTo(20000.0)));
	}
	
	@Test
	public void testSetExtraLargeHouseSizeCurrentPriceBelowMax() {
		house.setSquareFeetPrice(4999.9, 20000.0);
		assertThat(house.getSquareFeet(), is(equalTo(4999.9)));
		assertThat(house.getCurrentPrice(), is(equalTo(20000.0)));
	}
	@Test
	public void testSetAboveExtraLargeHouseSizeCurrentPriceMin() {
		house.setSquareFeetPrice(5000.1, 25000.0);
		assertThat(house.getSquareFeet(), is(equalTo(5000.1)));
		assertThat(house.getCurrentPrice(), is(equalTo(25000.0)));
	}
	
	@Test
	public void testSetAboveExtraLargeHouseSizeCurrentPriceAboveMin() {
		house.setSquareFeetPrice(5000.2, 25000.0);
		assertThat(house.getSquareFeet(), is(equalTo(5000.2)));
		assertThat(house.getCurrentPrice(), is(equalTo(25000.0)));
	}
	
	@Test
	public void testSetAboveExtraLargeHouseSizeCurrentPriceMax() {
		house.setSquareFeetPrice(6000.0, 25000.0);
		assertThat(house.getSquareFeet(), is(equalTo(6000.0)));
		assertThat(house.getCurrentPrice(), is(equalTo(25000.0)));
	}
	
	@Test
	public void testSetAboveExtraLargeHouseSizeCurrentPriceBelowMax() {
		house.setSquareFeetPrice(7000.0, 25000.0);
		assertThat(house.getSquareFeet(), is(equalTo(7000.0)));
		assertThat(house.getCurrentPrice(), is(equalTo(25000.0)));
	}
	
}
