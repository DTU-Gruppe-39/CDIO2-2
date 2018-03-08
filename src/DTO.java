
public class DTO {
	
	String operatorId;
	String batchId;
	//String taraWeight, netWeight, bruttoWeight; 
	double netWeight, bruttoWeight, taraWeight;	
	
	

	
	public String getOperatorId() {
		return operatorId;
	}




	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}




	public String getBatchId() {
		return batchId;
	}



	
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}


	/*
	public String getTaraWeight()
	{
		return taraWeight;
	}
	*/
	
	public double getTaraWeight() {
		return taraWeight;
	}
	


	/*
	public void setTaraWeight(String taraWeight)
	{
		this.taraWeight = taraWeight;
	}
	*/
	public void setTaraWeight(double taravWeight) {
		this.taraWeight = taravWeight;
	}
	 

	/*
	public String getNetWeight()
	{
		return netWeight;
	}
	*/
	public double getNetWeight() {
		return netWeight;
	}
	

	/*
	public void setNetWeight(String netWeight)
	{
		this.netWeight = netWeight;
	}
	*/
	public void setNetWeight(double netWeight) {
		this.netWeight = netWeight;
	}
	
	/*
	public String getBruttoWeight()
	{
		return bruttoWeight;
	}
	*/
	public double getBruttoWeight() {
		return bruttoWeight;
	}
	

	/*
	public void setBruttoWeight(String bruttoWeight)
	{
		this.bruttoWeight = bruttoWeight;
	}
	*/
	public void setBruttoWeight(double bruttoWeight) {
		this.bruttoWeight = bruttoWeight;
	}
	

	public String toString(){
		return "operat�rId: " + operatorId+ " batchId: " + batchId
				+ " tarav�gt: " + taraWeight + " nettov�gt: "+ netWeight + " bruttov�gt: " 
				+ bruttoWeight;
	}

	
	
	
}
