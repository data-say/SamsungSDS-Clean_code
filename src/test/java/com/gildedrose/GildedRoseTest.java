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
		// arrange
		Item[] items = new Item[] { new Item("Aged Brie", 0, 50) };
		GildedRose gildedRose = new GildedRose(items);

		// act
		gildedRose.updateQuality();

		// assert
		assertEquals("Aged Brie", items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(50, items[0].quality);
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
		// arrange
		Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49) };
		GildedRose gildedRose = new GildedRose(items);

		// act
		gildedRose.updateQuality();

		// assert
		assertEquals("Backstage passes to a TAFKAL80ETC concert", items[0].name);
		assertEquals(9, items[0].sellIn);
		assertEquals(50, items[0].quality);
	}

	@Test
	public void Step10_BackStagePass아이템_판매기간11_품질49_테스트() {
		// arrange
		Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 11, 49) };
		GildedRose gildedRose = new GildedRose(items);

		// act
		gildedRose.updateQuality();

		// assert
		assertEquals("Backstage passes to a TAFKAL80ETC concert", items[0].name);
		assertEquals(10, items[0].sellIn);
		assertEquals(50, items[0].quality);
	}

	@Test
	public void Step11_BackStagePass아이템_판매기간5_품질49_테스트() {
		// arrange
		Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49) };
		GildedRose gildedRose = new GildedRose(items);

		// act
		gildedRose.updateQuality();

		// assert
		assertEquals("Backstage passes to a TAFKAL80ETC concert", items[0].name);
		assertEquals(4, items[0].sellIn);
		assertEquals(50, items[0].quality);
	}

	@Test
	public void Step12_Normal아이템_판매기간0_품질2_테스트() {
		// arrange
		Item[] items = new Item[] { new Item("Normal Item", 0, 2) };
		GildedRose gildedRose = new GildedRose(items);

		// act
		gildedRose.updateQuality();

		// assert
		assertEquals("Normal Item", items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}

	@Test
	public void Step13_Sulfuras아이템_판매기간_마이너스1_품질2_테스트() {
		// arrange
		Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -1, 2) };
		GildedRose gildedRose = new GildedRose(items);

		// act
		gildedRose.updateQuality();

		// assert
		assertEquals("Sulfuras, Hand of Ragnaros", items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(2, items[0].quality);
	}
	
	@Test
	public void Step13_AgedBrie아이템_판매기간_마이너스1_품질2_테스트() {
		// arrange
		Item[] items = new Item[] { new Item("Aged Brie", -1, 2) };
		GildedRose gildedRose = new GildedRose(items);

		// act
		gildedRose.updateQuality();

		// assert
		assertEquals("Aged Brie", items[0].name);
		assertEquals(-2, items[0].sellIn);
		assertEquals(4, items[0].quality);
	}
}