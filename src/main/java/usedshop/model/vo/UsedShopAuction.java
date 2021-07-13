package usedshop.model.vo;

import java.sql.Date;

public class UsedShopAuction {
	private static final long serialVersionUID = 118L;
	
	private int marketCd;
	private int startBid;
	private int currentBid;
	private java.sql.Date aRegDate;
	private java.sql.Date aCloseDate;
	private String saleState;
	private int saleFin;
	
	public UsedShopAuction() {}
	
	public UsedShopAuction(int marketCd, int startBid, int currentBid, Date aRegDate, Date aCloseDate, String saleState,
			int saleFin) {
		super();
		this.marketCd = marketCd;
		this.startBid = startBid;
		this.currentBid = currentBid;
		this.aRegDate = aRegDate;
		this.aCloseDate = aCloseDate;
		this.saleState = saleState;
		this.saleFin = saleFin;
	}
	
}
