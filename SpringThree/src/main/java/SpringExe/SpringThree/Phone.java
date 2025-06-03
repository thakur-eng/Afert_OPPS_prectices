package SpringExe.SpringThree;

public class Phone {
	
	String mobilename;
	String mobileModel;
	int mobileEmieNum;
	
	public String getMobilename() {
		return mobilename;
	}
	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}
	public String getMobileModel() {
		return mobileModel;
	}
	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}
	public int getMobileEmieNum() {
		return mobileEmieNum;
	}
	public void setMobileEmieNum(int mobileEmieNum) {
		this.mobileEmieNum = mobileEmieNum;
	}
	
	public void didplyMobiledetils()
	{
		System.out.println("mobilename"+mobilename+ "mobileModel"+ mobileModel+ "mobileEmieNum" + mobileEmieNum);
	}
	

}
