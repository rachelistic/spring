package co.rachel.epex.board.vo;

import java.sql.Date;

public class BorderVo {
	private int borderId;
	private String bordertitle;
	private String borderwriter;
	private String bordercontent;
	private Date borderdate;
	private int borderhit;
	
	public int getBorderId() {
		return borderId;
	}
	public void setBorderId(int borderId) {
		this.borderId = borderId;
	}
	public String getBordertitle() {
		return bordertitle;
	}
	public void setBordertitle(String bordertitle) {
		this.bordertitle = bordertitle;
	}
	public String getBorderwriter() {
		return borderwriter;
	}
	public void setBorderwriter(String borderwriter) {
		this.borderwriter = borderwriter;
	}
	public String getBordercontent() {
		return bordercontent;
	}
	public void setBordercontent(String bordercontent) {
		this.bordercontent = bordercontent;
	}
	public Date getBorderdate() {
		return borderdate;
	}
	public void setBorderdate(Date borderdate) {
		this.borderdate = borderdate;
	}
	public int getBorderhit() {
		return borderhit;
	}
	public void setBorderhit(int borderhit) {
		this.borderhit = borderhit;
	}


}
