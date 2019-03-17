package org.mines.douai.j2ee.cailliezmagnier;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class YellowJacketMain {

	public YellowJacketBean frYellowJacketBean;
	public YellowJacketBean enYellowJacketBean;
	public YellowJacketBean deYellowJacketBean;

	public YellowJacketMain() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configBean.xml");
		this.frYellowJacketBean = applicationContext.getBean("frBean", YellowJacketBean.class);
		this.enYellowJacketBean = applicationContext.getBean("enBean", YellowJacketBean.class);
		this.deYellowJacketBean = applicationContext.getBean("deBean", YellowJacketBean.class);

	}

	public void printYellowJacketAndPopulation() {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configBean.xml");
		System.out.println("Premier appel : ");
		System.out.println();
		applicationContext.getBean("frBean", YellowJacketBean.class).printYellowJacket();
		System.out.println();
		applicationContext.getBean("deBean", YellowJacketBean.class).printYellowJacket();
		System.out.println();
		applicationContext.getBean("enBean", YellowJacketBean.class).printYellowJacket();
		System.out.println("----------------------");
		System.out.println("Deuxieme appel : ");
		System.out.println();
		applicationContext.getBean("frBean", YellowJacketBean.class).printYellowJacket();
		System.out.println();
		applicationContext.getBean("deBean", YellowJacketBean.class).printYellowJacket();
		System.out.println();
		applicationContext.getBean("enBean", YellowJacketBean.class).printYellowJacket();
		System.out.println("----------------------");
		System.out.println("Troisieme appel : ");
		System.out.println();
		applicationContext.getBean("frBean", YellowJacketBean.class).printYellowJacket();
		System.out.println();
		applicationContext.getBean("deBean", YellowJacketBean.class).printYellowJacket();
		System.out.println();
		applicationContext.getBean("enBean", YellowJacketBean.class).printYellowJacket();
		System.out.println("----------------------");

	}

	public static void main(String[] args) {
		YellowJacketMain aYellowJacketMain = new YellowJacketMain();
		System.out.println("Premier appel de printYellowJacketAndPopulation():");
		aYellowJacketMain.printYellowJacketAndPopulation();
	}
}