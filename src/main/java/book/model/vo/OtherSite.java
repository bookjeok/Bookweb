package book.model.vo;

public class OtherSite implements java.io.Serializable {
	private static final long serialVersionUID = 117L;
	
	private int siteCd;
	private int siteBookId;
	private String siteNm;
	private int sitePrice;
	
	public OtherSite() {}

	public OtherSite(int siteCd, int siteBookId, String siteNm, int sitePrice) {
		super();
		this.siteCd = siteCd;
		this.siteBookId = siteBookId;
		this.siteNm = siteNm;
		this.sitePrice = sitePrice;
	}
	
}
