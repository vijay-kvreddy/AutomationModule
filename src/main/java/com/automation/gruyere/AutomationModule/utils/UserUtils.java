package com.automation.gruyere.AutomationModule.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserUtils {

	public static List<String> getExistingUsers() throws IOException {
		List<String> userList = new ArrayList<String>();
		InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("existingusers");
		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		String line = null;
		while ((line = in.readLine()) != null) {
			userList.add(line);
		}
		return userList;
	}
}
