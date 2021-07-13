package ask.model.vo;

import java.sql.Date;

public class Ask implements java.io.Serializable {
	private static final long serialVersionUID = 116L;
	
	private int askNum;
	private String askWriterId;
	private String askGroup;
	private String askTitle;
	private String askContent;
	private String askState;
	private String askOriginalFile;
	private String askRenameFile;
	private String answerContent;
	private java.sql.Date writeDate;
	private java.sql.Date answerDate;
	
	public Ask() {}

	public Ask(int askNum, String askWriterId, String askGroup, String askTitle, String askContent, String askState,
			Date writeDate) {
		super();
		this.askNum = askNum;
		this.askWriterId = askWriterId;
		this.askGroup = askGroup;
		this.askTitle = askTitle;
		this.askContent = askContent;
		this.askState = askState;
		this.writeDate = writeDate;
	}

	public Ask(int askNum, String askWriterId, String askGroup, String askTitle, String askContent, String askState,
			String askOriginalFile, String askRenameFile, String answerContent, Date writeDate, Date answerDate) {
		super();
		this.askNum = askNum;
		this.askWriterId = askWriterId;
		this.askGroup = askGroup;
		this.askTitle = askTitle;
		this.askContent = askContent;
		this.askState = askState;
		this.askOriginalFile = askOriginalFile;
		this.askRenameFile = askRenameFile;
		this.answerContent = answerContent;
		this.writeDate = writeDate;
		this.answerDate = answerDate;
	}
	
}
