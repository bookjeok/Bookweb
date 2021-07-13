package review.model.vo;

import java.sql.Date;

public class Review implements java.io.Serializable {
	private static final long serialVersionUID = 113L;
	
	private int reviewCd;
	private String reviewWriterId;
	private int reviewBookId;
	private String reviewName;
	private java.sql.Date reviewRegDate;
	private java.sql.Date reviewModifyDate;
	private String reviewOriginalFile;
	private String reviewRenameFile;
	private String reviewContent;
	private int score;
	private String keyword1;
	private String keyword2;
	private String keyword3;
	private String keyword4;
	
	public Review() {}

	public Review(int reviewCd, String reviewWriterId, int reviewBookId, String reviewName, Date reviewRegDate,
			String reviewContent, int score) {
		super();
		this.reviewCd = reviewCd;
		this.reviewWriterId = reviewWriterId;
		this.reviewBookId = reviewBookId;
		this.reviewName = reviewName;
		this.reviewRegDate = reviewRegDate;
		this.reviewContent = reviewContent;
		this.score = score;
	}

	public Review(int reviewCd, String reviewWriterId, int reviewBookId, String reviewName, Date reviewRegDate,
			Date reviewModifyDate, String reviewOriginalFile, String reviewRenameFile, String reviewContent, int score,
			String keyword1, String keyword2, String keyword3, String keyword4) {
		super();
		this.reviewCd = reviewCd;
		this.reviewWriterId = reviewWriterId;
		this.reviewBookId = reviewBookId;
		this.reviewName = reviewName;
		this.reviewRegDate = reviewRegDate;
		this.reviewModifyDate = reviewModifyDate;
		this.reviewOriginalFile = reviewOriginalFile;
		this.reviewRenameFile = reviewRenameFile;
		this.reviewContent = reviewContent;
		this.score = score;
		this.keyword1 = keyword1;
		this.keyword2 = keyword2;
		this.keyword3 = keyword3;
		this.keyword4 = keyword4;
	}
	
}
