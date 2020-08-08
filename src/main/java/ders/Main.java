package ders;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class Main {
 
	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Ferhat", "Aykan");
		Student student2 = new Student(2, "Enes", "Çýnar");
		
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.save(student1);
		session.save(student2);
		session.save(new Student(3, "Ahmet", "Aykan"));
		session.save(new Student(4, "Ugur", "Baþ"));
		
		session.beginTransaction().commit();
		
	}
}