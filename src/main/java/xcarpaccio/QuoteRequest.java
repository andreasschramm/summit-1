 package xcarpaccio;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class QuoteRequest {
	
	String country;
	
	Instant departureDate;
	
	Instant returnDate;
	
	List<Integer> travellerAges = new ArrayList<>();
	
	List<String> options = new ArrayList<>();
	
	String cover;
	
	

}
