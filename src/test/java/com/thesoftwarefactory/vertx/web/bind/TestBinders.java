package com.thesoftwarefactory.vertx.web.bind;

import static org.junit.Assert.*;

import java.lang.reflect.Type;

import org.junit.Test;

import com.thesoftwarefactory.reflection.type.TypeToken;

public class TestBinders {

	@Test
	public void testRegisterBinderByClass() {
		Type type = new TypeToken<MyGeneric<String>>(){}.type();
		Binders.instance.register(type, MyGenericBinder.class);
		
		Binder binder = Binders.instance.getBinderByType(type);
		assertTrue(binder!=null);

		binder = Binders.instance.getBinderByType(MyGeneric.class);
		assertTrue(binder!=null);

	}
	
}
