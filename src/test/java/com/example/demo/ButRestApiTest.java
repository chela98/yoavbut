package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class ButRestApiTest {

	@Test
	void testListele() {
		List<String> sonuc = ButRestApi.listele();
		
		assertEquals(ButRestApi.DERSLER, sonuc);
	}

	@Test
	void testEkle() {
		String dersAd = "emre";
		
		Boolean sonuc = ButRestApi.ekle(dersAd);
		
		assertEquals(true, sonuc);
	}
	
	@Test
	void testEkle2() {
		String dersAd = "emre";
		
		Boolean sonuc = ButRestApi.ekle(dersAd);
		
		assertEquals(true, sonuc);
	}

	@Test
	void testSil() {
		Integer silinecekId = 1;
		ButRestApi.DERSLER.add("veri");
		
		String sonuc = ButRestApi.sil(silinecekId);
		
		assertEquals("sildiniz",sonuc);
		
	}

}
