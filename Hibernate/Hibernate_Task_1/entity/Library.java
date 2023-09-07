package HibernateTask1.src.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Library {

	@Id
	private int ISBN;
	private String title;
	private String publishyear;
	
	private String author;
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getpublishyear() {
		return publishyear;
	}
	public void setpublishyear(String publishyear) {
		this.publishyear = publishyear;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Libary [ISBN=" + ISBN + ", title=" + title + ", publishyear=" + publishyear + ", author=" + author + "]";
	}
	
	public Library() {
		// TODO Auto-generated constructor stub
	}
	public Library(int iSBN, String title, String author, String publishyear) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.publishyear = publishyear;
		this.author = author;
	}
	
}
