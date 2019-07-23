package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

	@Test
	public void Step1_GildedRose_생성자_테스트() {

		// arrange
		Item[] items = new Item[] {};

		// act
		GildedRose gildedRose = new GildedRose(items);

		// assert
		assertNotNull(gildedRose);
	}

	@Test
	public void Step2_Normal아이템_판매기간0_품질0_테스트() {

		// arrange
		Item[] items = new Item[] { new Item("Normal Item", 0, 0) };
		GildedRose gildedRose = new GildedRose(items);

		// act
		gildedRose.updateQuality();

		// assert
		assertEquals("Normal Item", items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}

	@Test
	public void Step3_AgedBrie아이템_판매기간0_품질0_테스트() {

		// arrange
		Item[] items = new Item[] { new Item("Normal Item", 0, 0) };
		GildedRose gildedRose = new GildedRose(items);

		// act
		gildedRose.updateQuality();

		// assert
		assertEquals("Normal Item", items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}

	@Test
	public void Step4_BackStagePass아이템_판매기간0_품질0_테스트() {
		
		// arrange
		Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 0) };
		GildedRose gildedRose = new GildedRose(items);

		// act
		gildedRose.updateQuality();

		// assert
		assertEquals("Backstage passes to a TAFKAL80ETC concert", items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}

	@Test
	public void Step5_Normal아이템_판매기간0_품질1_테스트() {
		
		// arrange
		Item[] items = new Item[] { new Item("Normal Item", 0, 1) };
		GildedRose gildedRose = new GildedRose(items);

		// act
		gildedRose.updateQuality();

		// assert
		assertEquals("Normal Item", items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}

	@Test
	public void Step6_Sulfuras아이템_판매기간0_품질1_테스트() {

		// arrange
		Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 1) };
		GildedRose gildedRose = new GildedRose(items);

		// act
		gildedRose.updateQuality();

		// assert
		assertEquals("Sulfuras, Hand of Ragnaros", items[0].name);
		assertEquals(0, items[0].sellIn);
		assertEquals(1, items[0].quality);
		
	}

	@Test
	public void Step7_AgedBrie아이템_판매기간0_품질50_테스트() {
		
	}

	@Test
	public void Step8_BackStagePass아이템_판매기간0_품질50_테스트() {
		
		// arrange
		Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 1) };
		GildedRose gildedRose = new GildedRose(items);

		// act
		gildedRose.updateQuality();

		// assert
		assertEquals("Backstage passes to a TAFKAL80ETC concert", items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}

	@Test
	public void Step9_BackStagePass아이템_판매기간10_품질49_테스트() {
		
	}

	@Test
	public void Step10_BackStagePass아이템_판매기간11_품질49_테스트() {

	}

	@Test
	public void Step11_XXXXX아이템_판매기간X_품질X_테스트() {

	}

	@Test
	public void Step12_XXXXX아이템_판매기간X_품질X_테스트() {

	}

	@Test
	public void Step13_XXXXX아이템_판매기간X_품질X_테스트() {

	}
}