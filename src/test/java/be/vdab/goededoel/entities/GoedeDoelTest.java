package be.vdab.goededoel.entities;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;


public class GoedeDoelTest {
	private static final String NAAM = "CliniClowns";
	private GoedeDoel doel;

	@Before
	public void before() {
		doel = new GoedeDoel(NAAM);
	}

	@Test
	public void getNaam() {
		assertEquals(NAAM, doel.getNaam());
	}

	@Test
	public void eenNieuwDoelHeeftNogGeenOpbrengts(){
		assertThat(doel.getOpgebracht()).isZero();
	}

	@Test
	public void doelenMetDezelfdeNaamZijnGelijk(){
		assertThat(doel).isEqualTo(new GoedeDoel("CLINICLOWNS"));
	}

	@Test
	public void doelenMetVerschillendeNaamZijnVerschillend(){
		assertThat(doel).isNotEqualTo(new GoedeDoel("WWF"));
	}

	@Test
	public void doelVerschiltVanEenObjectMetEenAnderType(){
		assertThat(doel).isNotEqualTo(BigDecimal.ZERO);
	}
}
