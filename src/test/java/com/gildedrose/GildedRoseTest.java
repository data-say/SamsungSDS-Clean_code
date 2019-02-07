package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {
	
	public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	public static final String NORMAL_ITEM = "Normal Item";
	public static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
	public static final String AGED_BRIE = "Aged Brie";
	
	@Test
	public void Step1_GildedRose_������_�׽�Ʈ() {
		
		// arrange
		Item[] items= new Item[]{};
		
		// act
		GildedRose gildedRose= new GildedRose(items);
		
		// assert
		assertNotNull(gildedRose);
	}
	
	@Test
	public void Step2_Normal������_�ǸűⰣ0_ǰ��0_�׽�Ʈ() {
		
		// arrange
		Item[] items= new Item[]{new Item(NORMAL_ITEM, 0, 0)};
		GildedRose gildedRose= new GildedRose(items);
		
		// act
		gildedRose.updateQuality();
		
		// assert
		assertEquals(NORMAL_ITEM, items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);
	}
	
	@Test
	public void Step3_Normal������_�ǸűⰣ0_ǰ��5_�׽�Ʈ() {
		
		// arrange
		Item[] items= new Item[]{new Item(NORMAL_ITEM, 0, 5)};
		GildedRose gildedRose= new GildedRose(items);
		
		// act
		gildedRose.updateQuality();
		
		// assert
		assertEquals(NORMAL_ITEM, items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(3, items[0].quality);		
	}
	
	@Test
	public void Step4_Sulfuras������_�ǸűⰣ0_ǰ��5_�׽�Ʈ() {
		
		// arrange
		Item[] items= new Item[]{new Item(SULFURAS, 0, 5)};
		GildedRose gildedRose= new GildedRose(items);
		
		// act
		gildedRose.updateQuality();
		
		// assert
		assertEquals(SULFURAS, items[0].name);
		assertEquals(0, items[0].sellIn);
		assertEquals(5, items[0].quality);		
	}
	
	// Step5. ��� �����丵
	
	@Test
	public void Step6_AgedBrie������_�ǸűⰣ0_ǰ��0_�׽�Ʈ() {
		
		// arrange
		Item[] items= new Item[]{new Item(AGED_BRIE, 0, 0)};		
		GildedRose gildedRose= new GildedRose(items);
		
		// act
		gildedRose.updateQuality();
		
		// assert
		assertEquals(AGED_BRIE, items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(2, items[0].quality);		
	}
	
	@Test
	public void Step7_BackstagePass������_�ǸűⰣ0_ǰ��0_�׽�Ʈ() {
		
		// arrange
		Item[] items= new Item[]{new Item(BACKSTAGE_PASS, 0, 0)};		
		GildedRose gildedRose= new GildedRose(items);
		
		// act
		gildedRose.updateQuality();
		
		// assert
		assertEquals(BACKSTAGE_PASS, items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);		
	}
	
	@Test
	public void Step8_BackstagePass������_�ǸűⰣ0_ǰ��51_�׽�Ʈ() {
		
		// arrange
		Item[] items= new Item[]{new Item(BACKSTAGE_PASS, 0, 51)};		
		GildedRose gildedRose= new GildedRose(items);
		
		// act
		gildedRose.updateQuality();
		
		// assert
		assertEquals(BACKSTAGE_PASS, items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(0, items[0].quality);		
	}
	
	@Test
	public void Step9_BackstagePass������_�ǸűⰣ15_ǰ��0_�׽�Ʈ() {
		
		// arrange
		Item[] items= new Item[]{new Item(BACKSTAGE_PASS, 15, 0)};		
		GildedRose gildedRose= new GildedRose(items);
		
		// act
		gildedRose.updateQuality();
		
		// assert
		assertEquals(BACKSTAGE_PASS, items[0].name);
		assertEquals(14, items[0].sellIn);
		assertEquals(1, items[0].quality);		
	}
	
	@Test
	public void Step10_Sulfuras������_�ǸűⰣ_���̳ʽ�1_ǰ��5_�׽�Ʈ() {
		Item[] items= new Item[]{new Item(SULFURAS, -1, 5)};		
		GildedRose gildedRose= new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(SULFURAS, items[0].name);
		assertEquals(-1, items[0].sellIn);
		assertEquals(5, items[0].quality);		
	}
	
	@Test
	public void Step11_AgedBrie������_�ǸűⰣ0_ǰ��55_�׽�Ʈ() {
		
	}
	
	@Test
	public void Step12_GildedRose_Item_toString_�׽�Ʈ() {
		
	}
}
