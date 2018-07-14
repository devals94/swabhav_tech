package com.techlabs.heirarchybuilder;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import com.techlabs.employee.Employee;
import com.techlabs.loader.FileLoader;
import com.techlabs.parser.SourceParser;

public class OrganizationalHeirarchyBuilder {
	public static void main(String[] args) throws IOException {
		String path = "D:\\CloudSWTL\\Core Java\\OOP Workspace\\employee-data-analyzer-app-ver-2.0\\src\\com\\techlabs\\heirarchybuilder\\Records.txt";

		FileLoader fileLoader = new FileLoader(path);

		SourceParser parser = new SourceParser(fileLoader);

		Set<Employee> emp = parser.getEmployeeRecords();
		int id = 0;

		for (Employee e : emp) {
			if (e.getManagerId().contains("NULL")) {
				id = e.getEmpId();
				System.out.println(e.getEmpName());
			}
		}

		for (Employee e : emp) {
			if (!e.getManagerId().contains("NULL")
					&& Integer.parseInt(e.getManagerId()) == id) {
				System.out.print("    ");
				System.out.println(e.getEmpName());

				for (Employee m : emp) {
					if (!m.getManagerId().contains("NULL")
							&& e.getEmpId() == Integer.parseInt(m
									.getManagerId())) {
						System.out.print("        ");
						System.out.println(m.getEmpName());

						for (Employee k : emp) {
							if (!k.getManagerId().contains("NULL")
									&& m.getEmpId() == Integer.parseInt(k
											.getManagerId())) {
								System.out.print("             ");
								System.out.println(k.getEmpName());
							}
						}
					}
				}

			}
		}

	}
}
