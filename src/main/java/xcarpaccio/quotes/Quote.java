package xcarpaccio.quotes;

public class Quote {
	
	public Quote(double d) {
		quote = d;
	}

	Double quote = Double.valueOf(0F);

	public Double getQuote() {
		return quote;
	}

	public void setQuote(Double quote) {
		this.quote = quote;
	}

}
