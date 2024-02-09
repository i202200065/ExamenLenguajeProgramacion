package main;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class Test_create {

	public static void main(String[] args) {
		SubjectDao dao = new SubjectDaoImpl();
		Subject sub = new Subject();
		sub.setSubject("Proyecto Integrador");
		sub.setCredits(4);
		
		dao.create(sub);
		
		List<Subject> subList = dao.findAll();
		
		for(Subject s : subList) {
			System.out.println(s.getIdsubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		
		}

	}

}
