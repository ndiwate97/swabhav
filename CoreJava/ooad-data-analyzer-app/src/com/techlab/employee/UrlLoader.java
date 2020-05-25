package com.techlab.employee;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UrlLoader implements ILoadAble {

	@Override
	public void loadData(String inputUrl, DataAnalyzer d) throws Exception {

		URL url = new URL(inputUrl);

		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

		String line;
		while ((line = reader.readLine()) != null) {

			String[] data = line.split(",");

			int employeeId = Integer.parseInt(data[0]);
			String employeeName = data[1].substring(1, data[1].length() - 1);
			String designation = data[2].substring(1, data[2].length() - 1);
			int managerId = Integer.parseInt(ckeckNull(data[3]));
			String pattern = "d-MMM-yy";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			Date dateOfJoining = simpleDateFormat.parse(data[4].substring(1, data[4].length() - 1));
			double salary = Double.parseDouble(data[5]);
			double commission = Double.parseDouble(ckeckNull(data[6]));
			int deptId = Integer.parseInt(data[7]);

			Employee e = new Employee(employeeId, employeeName, designation, managerId, dateOfJoining, salary,
					commission, new Department(deptId));
			d.addEmployees(e);

//			System.out.println(employeeId + " " + employeeName + " " + designation + " " + managerId + " "
//					+ dateOfJoining + " " + salary + " " + commission + " " + deptId);

		}

		reader.close();

	}

	private static String ckeckNull(String data) {
		if (data.equalsIgnoreCase("null")) {
			return "0";
		}
		return data;
	}

}
