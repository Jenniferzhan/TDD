package icitic.com.cn.car;

import org.junit.Assert;
import org.junit.Test;

public class CarStopPlaceTest {
	@Test
	public void shouldReturnErrorWhenInputInCarStop(){
		CarStopPlace carStopPlace =new CarStopPlace(500,500);
		String type = "InCar";
		String result = carStopPlace.carStopPlaceNum(type);
		Assert.assertEquals("ͣ��λ����", result);	
	}
	@Test
	public void shouldReturnSuccessWhenInputInCarStop(){
		CarStopPlace carStopPlace =new CarStopPlace(500,200);
		String type = "InCar";
		String result = carStopPlace.carStopPlaceNum(type);
		Assert.assertEquals("ͣ���ɹ�", result);	
	}
	@Test
	public void shouldReturnErrorWhenOutputInCarStop(){
		CarStopPlace carStopPlace =new CarStopPlace(500,0);
		String type = "";
		String result = carStopPlace.carStopPlaceNum(type);
		Assert.assertEquals("ȡ��ʧ��", result);	
	}
	@Test
	public void shouldReturnSuccessWhenOutputInCarStop(){
		CarStopPlace carStopPlace =new CarStopPlace(500,200);
		String type = "";
		String result = carStopPlace.carStopPlaceNum(type);
		Assert.assertEquals("ȡ���ɹ�", result);	
		
		
	}

}
