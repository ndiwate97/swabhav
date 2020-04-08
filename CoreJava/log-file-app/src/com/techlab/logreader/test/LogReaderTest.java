package com.techlab.logreader.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.techlab.logreader.LogReader;

public class LogReaderTest {

	static String filePath = "C:\\swabhav\\CoreJava\\log-file-app\\db_app.log";

	public static void main(String[] args) throws IOException {

		List<LogReader> list = readLogs(args[0]);
		System.out.println(list.size());

		System.out.println(list);

	}

	private static List<LogReader> readLogs(String logType) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line = null;

		List<LogReader> logs = new ArrayList();
		while ((line = br.readLine()) != null) {
			if (!line.equals("")) {
				
				String[] data = line.split(" ");
				
				if (data[3].equalsIgnoreCase(logType) || logType.equals("null")) {
					LogReader lr = new LogReader();
					lr.setStatus(data[3]);
					lr.setMessage(line);
					logs.add(lr);
				}
				
			}
		}

		return logs;
	}
}
