package org.bot.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class WebUtil {
	public static ArrayList<String> requestSite(String url) throws IOException, URISyntaxException {
		//http://www.tulpweb.nl/willekeurigwoord/
		URL website = new URL(url);
		
		
		URLConnection connection = website.openConnection();
		System.out.println("[SYSTEM] succesfully opened " + connection.getURL());
		
		
		InputStreamReader in = new InputStreamReader(connection.getInputStream());
		BufferedReader read = new BufferedReader(in);
		
		String input;
		ArrayList<String> response = new ArrayList<String>();
		
		while((input = read.readLine()) != null){
			response.add(input);
		}
		System.out.println("[SYSTEM] Succesfully readed " + connection.getURL());
		
		read.close();
		System.out.println("[SYSTEM] Succesfully closed the BufferedReader.");
		return response;
	}
}
