package com.thesoftwarefactory.vertx.web.bind.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.thesoftwarefactory.vertx.web.bind.BindingInfo;

import io.vertx.core.http.HttpMethod;
import io.vertx.ext.web.RoutingContext;

public class BinderHelper {

	public final static boolean isValidPost(RoutingContext routingContext) {
		return routingContext.request().method()==HttpMethod.POST && routingContext.request().isExpectMultipart();
	}

	public final static String getValue(BindingInfo bindingInfo, RoutingContext routingContext) {
		String result = getValue(bindingInfo.name(), bindingInfo.index(), routingContext); 
		return result!=null ? result : bindingInfo.defaultValue();
	}

	public final static String getValueFromRequests(String name, int index, RoutingContext routingContext) {
		List<String> results = routingContext.request().params().getAll(name);
		return results.size() > index ? results.get(index) : null;
	}

	public final static String getValueFromHeader(String name, int index, RoutingContext routingContext) {
		List<String> results = routingContext.request().headers().getAll(name);
		return results.size() > index ? results.get(index) : null;
	}

	public final static String getValueFromData(String name, int index, RoutingContext routingContext) {
		Object result = routingContext.data().get(name);
		return result!=null && result instanceof String ? (String) result : null;
	}

	public final static String getValueFromForm(String name, int index, RoutingContext routingContext) {
		List<String> results = null;
		if (isValidPost(routingContext)) {
			try {
				results = routingContext.request().formAttributes().getAll(name);
				if (results.isEmpty()) {
					results = null;
					for (int i=0; i<=index; i++) {
						List<String> tmp = routingContext.request().formAttributes().getAll(name + '[' + i + ']');
						if (tmp.size()>0) {
							if (results==null) {
								results = new ArrayList<>();
							}
							results.addAll(tmp);
						}
						else {
							break;
						}
					}
					if (results==null) {
						results = Collections.emptyList();
					}
				}
			}
			catch (Throwable t) {
			// ignore exception
			}
			// TODO get it from the header
		}
		return results!=null && results.size() > index ? results.get(index) : null;
	}

	public final static String getValue(String name, int index, RoutingContext routingContext) {
		String result = getValueFromRequests(name, index, routingContext);
		if (result==null) {
			result = getValueFromForm(name, index, routingContext);
			if (result==null) {
				result = getValueFromHeader(name, index, routingContext);
				if (result==null) {
					result = getValueFromData(name, index, routingContext);
				}
			}
		}
		return result;
	}

}
