package com.liuyf8688.demos.spring.session.init;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

import com.liuyf8688.demos.spring.session.config.EmbeddedRedisConfiguration;

public class Initializer extends AbstractHttpSessionApplicationInitializer {

	public Initializer() {
		super(EmbeddedRedisConfiguration.class);
	}
}
