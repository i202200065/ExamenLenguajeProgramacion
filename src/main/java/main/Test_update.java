package main;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class Test_update {

	public static void main(String[] args) {
		
		SubjectDao dao = new SubjectDaoImpl();
		Subject sub = new Subject();
		sub.setIdsubject(2);
		sub.setSubject("Plan de Negocios");
		sub.setCredits(1);
		
		dao.update(sub);
		
		List<Subject> subList = dao.findAll();
		
		for(Subject s : subList) {
			System.out.println(s.getIdsubject());
			System.out.println(s.getSubject());
			System.out.println(s.getCredits());
		}

	}

}
