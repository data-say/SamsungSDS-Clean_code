package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

	@Test
	public void Step1_GildedRose_������_�׽�Ʈ() {

		// arrange
		Item[] items = new Item[] {};

		// act
		GildedRose gildedRose = new GildedRose(items);

		// assert
		assertNotNull(gildedRose);
	}

	@Test
	public void Step2_Normal������_�ǸűⰣ0_ǰ��0_�׽�Ʈ() {

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
	public void Step3_AgedBrie������_�ǸűⰣ0_ǰ��0_�׽�Ʈ() {

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
	public void Step4_BackStagePass������_�ǸűⰣ0_ǰ��0_�׽�Ʈ() {
		
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
	public void Step5_Normal������_�ǸűⰣ0_ǰ��1_�׽�Ʈ() {
		
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
	public void Step6_Sulfuras������_�ǸűⰣ0_ǰ��1_�׽�Ʈ() {

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
	public void Step7_AgedBrie������_�ǸűⰣ0_ǰ��50_�׽�Ʈ() {
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
	public void Step8_BackStagePass������_�ǸűⰣ0_ǰ��50_�׽�Ʈ() {
		
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
	public void Step9_BackStagePass������_�ǸűⰣ10_ǰ��49_�׽�Ʈ() {
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
	public void Step10_BackStagePass������_�ǸűⰣ11_ǰ��49_�׽�Ʈ() {
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
	public void Step11_BackStagePass������_�ǸűⰣ5_ǰ��49_�׽�Ʈ() {
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
	public void Step12_Normal������_�ǸűⰣ0_ǰ��2_�׽�Ʈ() {
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
	public void Step13_Sulfuras������_�ǸűⰣ_���̳ʽ�1_ǰ��2_�׽�Ʈ() {
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
	public void Step13_AgedBrie������_�ǸűⰣ_���̳ʽ�1_ǰ��2_�׽�Ʈ() {
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