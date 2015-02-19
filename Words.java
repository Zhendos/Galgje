package org.bot.web;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

import org.bot.web.WebUtil;

public class Words {
	public static String words;
	
	public static String generateWord() throws IOException, URISyntaxException {
		ArrayList<String> word = WebUtil.requestSite("http://www.tulpweb.nl/willekeurigwoord/");
		for(String words : word){
			if(words.contains("<h2>")){
				return words.split("<h2>")[1].split("</h2>")[0];
			}
		}
		
		return null;
		//voeg een return statement als String toe.
	}

}
