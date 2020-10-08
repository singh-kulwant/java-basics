package com.template.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

public class NewHttpClientProgram {

	public static void main(String[] args) {

		HttpClient client = HttpClient.newBuilder()
				.version(Version.HTTP_2)
				.followRedirects(Redirect.ALWAYS)
				/* .proxy(ProxySelector.of(new InetSocketAddress("www-proxy.com", 8080))) */.build();

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("http://google.com/"))
				.timeout(Duration.ofMinutes(1))
				.header("Content-Type", "application/json") 
				.GET().build();

		try {
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			System.out.println(response.body());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
