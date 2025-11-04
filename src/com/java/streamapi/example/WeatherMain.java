package com.java.streamapi.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WeatherMain {

	public static void main(String[] args) {

		List<WeatherData> lwd = new ArrayList<WeatherData>();
		for (int i = 0; i < 20; i++) {
			if(i%4==0)
			{
				lwd.add(new WeatherData("Loc" + Integer.valueOf(4).shortValue(), 0.23 + i, 2.50 + i, 14.1 + i));
				
			}else if(i%3==0)
			{
				lwd.add(new WeatherData("Loc" + Integer.valueOf(3).shortValue(), 0.23 + i, 2.50 + i, 14.1 + i));
				
			}else
			{
				lwd.add(new WeatherData("Loc" + Integer.valueOf(i).shortValue(), 0.23 + i, 2.50 + i, 14.1 + i));
				
			}
			}
		for(WeatherData wd: lwd) 
		{
			System.out.println(wd) ;
			}
		// System.out.println("getMaxTemperature::"+WeatherMain.getMaxTemperature(lwd));
	//	System.out.println("getAvgTemperature::" + WeatherMain.getAvgTemperature(lwd));
		//System.out.println("get3rdMaxTemperature::" + WeatherMain.get3rdMaxTemperature(lwd));

	}

	public static double getMaxTemperature(List<WeatherData> lwd) {
		List<WeatherData> list = lwd;
		Collections.shuffle(list);

		/*
		 * for(WeatherData wd: list) { System.out.println(wd); }
		 */
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		List<WeatherData> temp = (List<WeatherData>) list.stream()
				.sorted(Comparator.comparingDouble(WeatherData::getTemperature).reversed()).toList();
		// .map(wd -> getTemperature()).toList();
//		for(WeatherData wd: temp)
//		{
//			System.out.println(wd);
//		}

		return temp.get(0).getTemperature();
	}

	public static double getAvgTemperature(List<WeatherData> lwd) {
		List<WeatherData> list = lwd;
		Collections.shuffle(list);

		/*
		 * for(WeatherData wd: list) { System.out.println(wd); }
		 */
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		  List<WeatherData> temp = (List<WeatherData>) list.stream()
		  .sorted(Comparator.comparingDouble(WeatherData :: getTemperature).reversed()) .toList();
		 

		double avgtemp = list.stream().sorted(Comparator.comparingDouble(WeatherData::getTemperature).reversed())
				.map(WeatherData::getTemperature).toList().stream().mapToDouble(Double::doubleValue).sum()/list.size();
		// .map(wd -> getTemperature()).toList();
		for (WeatherData wd: temp) 
		{ 
			System.out.println(wd.getTemperature());
		}

		return avgtemp;
	}
	
	public static double get3rdMaxTemperature(List<WeatherData> lwd) {
		List<WeatherData> list = lwd;
		Collections.shuffle(list);

		/*
		 * for(WeatherData wd: list) { System.out.println(wd); }
		 */
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		List<WeatherData> temp = (List<WeatherData>) list.stream()
				.sorted(Comparator.comparingDouble(WeatherData::getTemperature).reversed()).limit(3).toList();
		// .map(wd -> getTemperature()).toList();
		for(WeatherData wd: temp)
		{
			System.out.println(wd);
		}

		return temp.get(2).getTemperature();
	}

}
