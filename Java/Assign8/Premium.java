package MetTours;

public class Premium{
	
	public double forCommon(int days, int person){
	return 1200 * days * person;

	}
	public double forSeniors(int days, int person){
	
	return forCommon(days, person) - 100;
	}
	public double forWomen(int days, int person){
	
	return forCommon(days, person) - 200;
	}

}
