package users;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hirbenate.project2.users;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(users.class)
                .buildSessionFactory();

Session session = factory.getCurrentSession();

try {
// Create object of entity class type
Users user = new Users( 1, "aaliyar","nadeem","aliyarnadeem@gmail.com");
// Start transaction
session.beginTransaction();
// Perform operation
session.save(user);
// Commit the transaction 
session.getTransaction().commit();
System.out.println("Row Added");


} finally {
session.close();
factory.close();
}

}
}
