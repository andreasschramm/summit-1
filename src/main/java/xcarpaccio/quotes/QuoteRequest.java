 package xcarpaccio.quotes;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class QuoteRequest {
	
	String country;
	
	String departureDate;
	
	String returnDate;
	
	List<Integer> travellerAges = new ArrayList<>();
	
	List<String> options = new ArrayList<>();
	
	String cover;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public List<Integer> getTravellerAges() {
		return travellerAges;
	}

	public void setTravellerAges(List<Integer> travellerAges) {
		this.travellerAges = travellerAges;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}
	
	

}
