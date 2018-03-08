
public class DTO {
	
	String operatorId;
	int batchId;
	double taraWeight, netWeight, bruttoWeight;	
	
	

	
	public String getOperatorId() {
		return operatorId;
	}




	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}




	public int getBatchId() {
		return batchId;
	}




	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}




	public double getTaraWeight() {
		return taraWeight;
	}




	public void setTaraWeight(double taravWeight) {
		this.taraWeight = taravWeight;
	}




	public double getNetWeight() {
		return netWeight;
	}




	public void setNetWeight(double netWeight) {
		this.netWeight = netWeight;
	}




	public double getBruttoWeight() {
		return bruttoWeight;
	}




	public void setBruttoWeight(double bruttoWeight) {
		this.bruttoWeight = bruttoWeight;
	}




	public String toString(){
		return "operatørId: " + operatorId+ " batchId: " + batchId
				+ " taravægt: " + taraWeight + " nettovægt: "+ netWeight + " bruttovægt: " 
				+ bruttoWeight;
	}

	
	
	
}
