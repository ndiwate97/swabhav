package com.techlab.employee;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EmployeeParser implements IParseAble {
	ILoadAble loader;
	DataAnalyzer d;
	ArrayList<String> lines = new ArrayList<String>();

	public EmployeeParser(ILoadAble loader, DataAnalyzer d) throws Exception {
		this.d = d;
		this.loader = loader;
		

//		System.out.println(lines);

		parseData();
	}

	@Override
	public void parseData() throws Exception {

		this.lines = loader.loadData();
		
		for (String line : lines) {

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
//					+ dateOfJoining + " " + salary + " "+ commission  + " " + deptId);

		}

	}

	private static String ckeckNull(String data) {
		if (data.equalsIgnoreCase("null")) {
			return "0";
		}
		return data;
	}

}
