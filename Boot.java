package org.bot.main;

import java.io.IOException;
import java.net.URISyntaxException;

import org.bot.web.WebUtil;

public class Boot {
	public static void main(String[] args) throws IOException, URISyntaxException{
		WebUtil.requestSite("http://www.tulpweb.nl/willekeurigwoord/");
	}

}
