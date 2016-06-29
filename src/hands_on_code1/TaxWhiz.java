package hands_on_code1;

public class TaxWhiz {
	private 
	double sales_tax ;
	double surcharge_rate;
	
	public TaxWhiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaxWhiz(double sales_tax, double surcharge_rate) {
		super();
		this.sales_tax = sales_tax;
		this.surcharge_rate = surcharge_rate;
	}
	
	public double calcTax(double purchase){
		
		double val_tax = (purchase * sales_tax)/100;
		
		double sur = (val_tax * surcharge_rate )/100;
		
		return (purchase +val_tax + sur);
	}
	
	

}
