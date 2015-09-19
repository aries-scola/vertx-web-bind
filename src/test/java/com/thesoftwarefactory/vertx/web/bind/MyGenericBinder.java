package com.thesoftwarefactory.vertx.web.bind;

import java.lang.reflect.Type;
import java.util.Objects;

import io.vertx.ext.web.RoutingContext;

public class MyGenericBinder<T> implements Binder<MyGeneric<T>> {

	private Type type;
	
	public MyGenericBinder(Type type) {
		Objects.requireNonNull(type);
		
		this.type = type;
	}

	@Override
	public MyGeneric<T> bindFromContext(BindingInfo bindingInfo, RoutingContext context) {
		return null;
	}

	@Override
	public void bindToUrl(BindingInfo bindingInfo, MyGeneric<T> valueToBind, UriBuilder builder) {
	}
	
}
