package ca.ucalgary.ensf380;

class Series {
	private String seriesName;
	
	public String theme() {
		return "Method theme called from Series";
	}
	
	public String getSeriesName() {
		return seriesName;
	}
	
	public void setSeriesName(String name) {
		this.seriesName = name;
	}
	
}
