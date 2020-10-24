package org.zerock.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Slf4j
public class SampleTxServiceTests {
	@Setter(onMethod_ = {@Autowired})
	private SampleTxService service;
	
	@Test
	public void testLong() {
		System.out.println("service : " + service);
//		String str = "Starry\r\n" + 
//					"Starry night\r\n" + 
//					"Paint your palette blue and grey\r\n" + 
//					"Look out on a summer's day";
//		
//		log.info(str.getBytes().length+"");
//		service.addData(str);
	}
}
