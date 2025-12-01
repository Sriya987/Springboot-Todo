package com.sriya.mockito.demo.business;

public class SomeBusinessImpl {
	private DataService dataService;

	public int findGreatest() {
	int[] data=dataService.retrieveAllData();
	int greatest=Integer.MIN_VALUE;
	for(int val:data) {
		if(val>greatest) 
			greatest=val;
	}
	return greatest;
}

	public SomeBusinessImpl() {
		super();
	}

	public SomeBusinessImpl(DataService dataservice) {
		super();
		this.dataService = dataservice;
	}
}
interface DataService{
	int[] retrieveAllData();
}