package com.nagarjuna.behavioral.strategy1;

public class App {

	public static void main(String[] args) {
		
		StrategySortable sortable = new StrategySortable(new BubbleSort());
		sortable.doSortable(null);
		
		sortable = new StrategySortable(new QuickSort());
		sortable.doSortable(null);
	}
}
