package com.hht.core;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hht.wms.core.WmsCoreApplication;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = WmsCoreApplication.class)
public class TestBase {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
