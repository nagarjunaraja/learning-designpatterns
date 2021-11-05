package com.nagarjuna.behavioral.strategy1;

public class StrategySortable {
	
	private Strategy sortable;
	
	public StrategySortable(Strategy sortable) {
		this.sortable = sortable;
	}
	
	void doSortable(int[] numbers) {
		sortable.sort(numbers);
	}

}
