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
public class SampleServiceTests {
	@Setter(onMethod_ = @Autowired)
	private SampleService service;
	
	@Test
	public void test() throws Exception {
//		log.info(service.getClass().getName());
		log.info(service.doAdd("123", "444") + "");
	}
}
