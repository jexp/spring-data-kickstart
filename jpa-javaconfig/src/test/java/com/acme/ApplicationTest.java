package com.acme;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author TODO
 */
public class ApplicationTest {

	@Test
	public void bootstrapsApplication() {
		new AnnotationConfigApplicationContext(ApplicationConfig.class);
	}
}
