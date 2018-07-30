package icitic.com.cn.car;

import org.junit.Assert;
import org.junit.Test;

public class CarStopPlaceTest {
	@Test
	public void shouldReturnErrorWhenInputInCarStop(){
		CarStopPlace carStopPlace =new CarStopPlace(500,500);
		String type = "InCar";
		String result = carStopPlace.carStopPlaceNum(type);
		Assert.assertEquals("停车位已满", result);	
	}
	@Test
	public void shouldReturnSuccessWhenInputInCarStop(){
		CarStopPlace carStopPlace =new CarStopPlace(500,200);
		String type = "InCar";
		String result = carStopPlace.carStopPlaceNum(type);
		Assert.assertEquals("停车成功", result);	
	}
	@Test
	public void shouldReturnErrorWhenOutputInCarStop(){
		CarStopPlace carStopPlace =new CarStopPlace(500,0);
		String type = "";
		String result = carStopPlace.carStopPlaceNum(type);
		Assert.assertEquals("取车失败", result);	
	}
	@Test
	public void shouldReturnSuccessWhenOutputInCarStop(){
		CarStopPlace carStopPlace =new CarStopPlace(500,200);
		String type = "";
		String result = carStopPlace.carStopPlaceNum(type);
		Assert.assertEquals("取车成功", result);	
		
		
	}

}
