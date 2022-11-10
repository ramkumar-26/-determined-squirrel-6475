package com.crimetime.usecases;

import java.util.Scanner;

import com.crimetime.dao.PoliceDao;
import com.crimetime.dao.PoliceDaoImpl;
import com.crimetime.exception.PoliceException;
import com.crimetime.model.Police;

public class AddPolice {
	public  void AddPolice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("POLICE REGISTRATION");
		System.out.println("Enter Police ID:");
		int police_id = sc.nextInt();
		System.out.println("Enter Name:");
		String police_name = sc.next();
		System.out.println("Enter Reporting PoliceStation:\n");
		String reporting_ps = sc.next();
		System.out.println("Enter Password:\n");
		String password = sc.next();
		
		Police p = new Police();
		p.setPolice_id(police_id);
		p.setName(police_name);
		p.setAssigned_policestation(reporting_ps);
		p.setPassword(password);
		p.setAccess_status(null);
		
		PoliceDao dao = new PoliceDaoImpl();
		try {
			int res = dao.addPolice(p);
			if(res==0) {
				throw new PoliceException("Insertion Failed!");
			}else {
				System.out.println("Police Record Added!");
			}
		} catch (PoliceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
