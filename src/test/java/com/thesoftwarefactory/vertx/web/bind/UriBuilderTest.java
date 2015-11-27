package com.thesoftwarefactory.vertx.web.bind;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

/**
 * Test class for {@link UriBuilder}
 */
public class UriBuilderTest {

	@Test
	public void test__queryParameters() throws URISyntaxException {
		
		UriBuilder b = new UriBuilder();
		
		b.addQueryParameter("par@m", "v@alue");
		b.addQueryParameter("param2?", "?");
		b.setPath("/monchemin");
		b.setHost("test.com");
		b.setScheme("http");
		
		assertEquals("http://test.com/monchemin?par%40m=v%40alue&param2%3F=%3F", b.toString());
		
	}
	
	@Test
	public void test__fullQuery() {
		
		UriBuilder b = new UriBuilder();
		
		b.setPath("/monchemin");
		b.setHost("test.com");
		b.setScheme("http");
		b.setQuery("par%40m=v%40alue&param2%3F=%3F");
		
		assertEquals("http://test.com/monchemin?par%40m=v%40alue&param2%3F=%3F", b.toString());
		
	}

}
