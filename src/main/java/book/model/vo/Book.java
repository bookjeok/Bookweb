package book.model.vo;

import java.sql.Date;

public class Book implements java.io.Serializable {
	private static final long serialVersionUID = 115L;
	
	private int bookId;
	private int bookTypeCd;
	private String bookNm;
	private int isbn;
	private int ranking;
	private String bookIntro;
	private String author;
	private String authorIntro;
	private int bookPrice;
	private int avgScore;
	private String publisher;
	private java.sql.Date publishDate;
	private String bookIndex;
	
	public Book() {}

	public Book(int bookId, int bookTypeCd, String bookNm, int isbn, String bookIntro, String author,
			String authorIntro, int bookPrice, String publisher, Date publishDate, String bookIndex) {
		super();
		this.bookId = bookId;
		this.bookTypeCd = bookTypeCd;
		this.bookNm = bookNm;
		this.isbn = isbn;
		this.bookIntro = bookIntro;
		this.author = author;
		this.authorIntro = authorIntro;
		this.bookPrice = bookPrice;
		this.publisher = publisher;
		this.publishDate = publishDate;
		this.bookIndex = bookIndex;
	}

	public Book(int bookId, int bookTypeCd, String bookNm, int isbn, int ranking, String bookIntro,
			String author, String authorIntro, int bookPrice, int avgScore, String publisher, Date publishDate,
			String bookIndex) {
		super();
		this.bookId = bookId;
		this.bookTypeCd = bookTypeCd;
		this.bookNm = bookNm;
		this.isbn = isbn;
		this.ranking = ranking;
		this.bookIntro = bookIntro;
		this.author = author;
		this.authorIntro = authorIntro;
		this.bookPrice = bookPrice;
		this.avgScore = avgScore;
		this.publisher = publisher;
		this.publishDate = publishDate;
		this.bookIndex = bookIndex;
	}
	
}
