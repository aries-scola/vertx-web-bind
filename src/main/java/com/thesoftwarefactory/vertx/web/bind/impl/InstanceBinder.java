package com.thesoftwarefactory.vertx.web.bind.impl;

import java.util.Objects;

import com.thesoftwarefactory.vertx.web.bind.Binder;
import com.thesoftwarefactory.vertx.web.bind.BindingInfo;
import com.thesoftwarefactory.vertx.web.bind.UriBuilder;

import io.vertx.ext.web.RoutingContext;

public class InstanceBinder implements Binder<Object> {

	private Object instance;
	
	public InstanceBinder(Object instance) {
		Objects.requireNonNull(instance);
		
		this.instance = instance;
	}

	@Override
	public Object bindFromContext(BindingInfo bindingInfo, RoutingContext context) {
		return instance;
	}

	@Override
	public void bindToUrl(BindingInfo bindingInfo, Object valueToBind, UriBuilder builder) {
		// no-op
	}

}
