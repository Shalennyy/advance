package hibernate2030;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session =factory.openSession();
		
		session.beginTransaction();
			
//		session.save(new Author("sss", "zzzz"));
//		session.save(new Author("ttt", "ddd"));
		
//		Author author = session.get(Author.class, 1);
//
//		author.setName("yyyy");
//		session.update(author);
		
//		Author author2 =session.load(Author.class, 2);
//		author2.setName("ooo");
		
//		session.save(new Book("LOTR"));
		
		
//		Author author3 = session.get(Author.class, 1);
//		Book book = session.get(Book.class, 1);
//		book.setAuthor(author3);
//		session.update(book);
//		
//		
//		session.getTransaction().commit();
		
//		Author author4 = new Author("oiu","woiuww");
//		List<Book> books =new ArrayList<>();
//		books.add(new Book("yru"));
//		books.add(new Book("rew"));
//		author4.setBooks(books);
//		session.persist(author4);
		
//		System.out.println(session.createQuery("select aaa.name from Author aaa").list());
		
		
		System.out.println(session.createCriteria(Author.class).add(Restrictions.between("id", 2, 3)).list());
//		System.out.println(session.createSQLQuery("select * from author").list());
		session.close();
		factory.close();
	}

}
