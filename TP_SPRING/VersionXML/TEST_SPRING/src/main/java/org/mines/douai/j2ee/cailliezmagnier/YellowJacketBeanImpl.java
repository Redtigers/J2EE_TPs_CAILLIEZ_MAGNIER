package org.mines.douai.j2ee.cailliezmagnier;

import java.math.BigDecimal;

public class YellowJacketBeanImpl implements YellowJacketBean {

	public String countryName;
	public YellowJacketServiceBean yellowJacketServiceBean;

	public String getCountryName() {
		return this.countryName;
	}
	
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	

	public void printYellowJacket() {
		BigDecimal numberYellowJackets = yellowJacketServiceBean.printYellowJacket(this.countryName);
		System.out.println(numberYellowJackets + " yellow jackets in " + this.countryName);
		System.out.println("HashCode de yellowJacketBean de "+this.countryName+": "+this.hashCode());
		System.out.println("HashCode du service: " + yellowJacketServiceBean.hashCode());
	}

	public YellowJacketServiceBean getYellowJacketServiceBean() {
		return this.yellowJacketServiceBean;
	}
	
	public void setYellowJacketServiceBean(YellowJacketServiceBean aYellowJacketServiceBean) {
		this.yellowJacketServiceBean = aYellowJacketServiceBean;	
	}
}
