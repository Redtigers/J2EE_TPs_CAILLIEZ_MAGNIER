package org.mines.douai.j2ee.cailliezmagnier;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class YellowJacketServiceBeanImpl implements YellowJacketServiceBean{

	public Map<String, Integer> mapNumberYellowJacketsPerCountry;
	
	public YellowJacketServiceBeanImpl() {
		mapNumberYellowJacketsPerCountry = new HashMap<String, Integer>();
		mapNumberYellowJacketsPerCountry.put("FR", 3000);
		mapNumberYellowJacketsPerCountry.put("EN", 4000);
		mapNumberYellowJacketsPerCountry.put("DE", 5000);
	}

	public BigDecimal printYellowJacket(String countryName) {

		Integer numberYellowJacket = mapNumberYellowJacketsPerCountry.get(countryName);
		BigDecimal bigdecimal = new BigDecimal(numberYellowJacket);
		mapNumberYellowJacketsPerCountry.put(countryName, numberYellowJacket + 1000);
		return bigdecimal;
	}
}