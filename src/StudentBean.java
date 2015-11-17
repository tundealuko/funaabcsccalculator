import java.text.DecimalFormat;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped


public class StudentBean {

	private String jambScore;
	private String englishGrade;
	private String mathsGrade;
	private String postUtme;
	private String phyGeoGovGrade;
	private String chemAcctCommGrade;
	private String bioAgrEconGrade;
	private String compositeScore;

	public StudentBean() {

	}

	public String getPostUtme() {
		return postUtme;
	}

	public void setPostUtme(String postUtme) {
		this.postUtme = postUtme;

	}

	public String getJambScore() {
		return jambScore;
	}

	public void setJambScore(String jambScore) {
		this.jambScore = jambScore;

	}

	public String getEnglishGrade() {
		return englishGrade;
	}

	public void setEnglishGrade(String englishGrade) {
		this.englishGrade = englishGrade;
	}

	public String getMathsGrade() {
		return mathsGrade;
	}

	public void setMathsGrade(String mathsGrade) {
		this.mathsGrade = mathsGrade;
	}

	public String getPhyGeoGovGrade() {
		return phyGeoGovGrade;
	}

	public void setPhyGeoGovGrade(String phyGeoGovGrade) {
		this.phyGeoGovGrade = phyGeoGovGrade;
	}

	public String getChemAcctCommGrade() {
		return chemAcctCommGrade;
	}

	public void setChemAcctCommGrade(String chemAcctCommGrade) {
		this.chemAcctCommGrade = chemAcctCommGrade;
	}

	public String getBioAgrEconGrade() {
		return bioAgrEconGrade;
	}

	public void setBioAgrEconGrade(String bioAgrEconGrade) {
		this.bioAgrEconGrade = bioAgrEconGrade;
	}

	public double oLevelGrade() {
		int mathsInt = Integer.parseInt(mathsGrade);
		int englishGradeInt = Integer.parseInt(englishGrade);
		int phyGeoGovGradeInt = Integer.parseInt(phyGeoGovGrade);
		int chemAcctCommGradeInt = Integer.parseInt(chemAcctCommGrade);
		int bioAgrEconGradeInt = Integer.parseInt(bioAgrEconGrade);
		double oLevelGradeCal = (mathsInt + englishGradeInt + phyGeoGovGradeInt + chemAcctCommGradeInt
				+ bioAgrEconGradeInt) * 0.6666;
		return oLevelGradeCal;
	}

	public double jambScoreFinal() {
		double jambScoreFinal = Double.parseDouble(jambScore) / 8;
		return jambScoreFinal;

	}

	public double postUtmeScoreFinal() {
		double postUtmeScoreFinal = Double.parseDouble(postUtme) * 0.3;
		return postUtmeScoreFinal;

	}

	public String getCompositeScore() {
		return compositeScore;
	}

	public void setCompositeScore(String compositeScore) {
		this.compositeScore = compositeScore;
	}
	
	public String calculation() {
		DecimalFormat score = new DecimalFormat("#.00");
		compositeScore = score.format(jambScoreFinal() + oLevelGrade() + postUtmeScoreFinal());
		return "";
	}
	

}
