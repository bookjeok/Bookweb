package notice.model.vo;

import java.sql.Date;

public class Notice implements java.io.Serializable {
	private static final long serialVersionUID = 114L;
	
	private int noticeNum;
	private String noticeWriterId;
	private String noticeTitle;
	private String noticeOriginalFile;
	private String noticeRenameFile;
	private String noticeContent;
	private String noticeGroup;
	private java.sql.Date noticeRegDate;
	private java.sql.Date noticeModifyDate;
	private int viewCount;
	
	public Notice() {}

	public Notice(int noticeNum, String noticeWriterId, String noticeTitle, String noticeContent, String noticeGroup,
			Date noticeRegDate, int viewCount) {
		super();
		this.noticeNum = noticeNum;
		this.noticeWriterId = noticeWriterId;
		this.noticeTitle = noticeTitle;
		this.noticeContent = noticeContent;
		this.noticeGroup = noticeGroup;
		this.noticeRegDate = noticeRegDate;
		this.viewCount = viewCount;
	}

	public Notice(int noticeNum, String noticeWriterId, String noticeTitle, String noticeOriginalFile,
			String noticeRenameFile, String noticeContent, String noticeGroup, Date noticeRegDate,
			Date noticeModifyDate, int viewCount) {
		super();
		this.noticeNum = noticeNum;
		this.noticeWriterId = noticeWriterId;
		this.noticeTitle = noticeTitle;
		this.noticeOriginalFile = noticeOriginalFile;
		this.noticeRenameFile = noticeRenameFile;
		this.noticeContent = noticeContent;
		this.noticeGroup = noticeGroup;
		this.noticeRegDate = noticeRegDate;
		this.noticeModifyDate = noticeModifyDate;
		this.viewCount = viewCount;
	}

}
