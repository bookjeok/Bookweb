package usedshop.model.vo;

import java.sql.Date;

public class UsedShop implements java.io.Serializable {
	private static final long serialVersionUID = 112L;
	
	private int marketCd;
	private String usedWriterId;
	private int usedBookId;
	private String saleType;
	private String quality;
	private int price;
	private java.sql.Date normalRegDate;
	private int regCount;
	private int saleCount;
	private String usedBookIntro;
	private String outer;
	private String inner;
	
	public UsedShop() {}

	public UsedShop(int marketCd, String saleType, String quality, String usedWriterId, int usedBookId, int price,
			Date normalRegDate, int regCount, int saleCount, String usedBookIntro, String outer, String inner) {
		super();
		this.marketCd = marketCd;
		this.saleType = saleType;
		this.quality = quality;
		this.usedWriterId = usedWriterId;
		this.usedBookId = usedBookId;
		this.price = price;
		this.normalRegDate = normalRegDate;
		this.regCount = regCount;
		this.saleCount = saleCount;
		this.usedBookIntro = usedBookIntro;
		this.outer = outer;
		this.inner = inner;
	}
	
}
