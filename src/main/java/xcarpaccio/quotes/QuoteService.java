package xcarpaccio.quotes;

import java.time.Instant;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class QuoteService {
	
	static double FACTOR = 1.8; 
	
	public Quote getQuote(QuoteRequest request) {
		long numberOfDays = getNumberOfDaysBetween(request.departureDate, request.returnDate);
		long numberOfPersons = request.travellerAges.size();
		return new Quote(FACTOR * numberOfDays * numberOfPersons);
	}

	private long getNumberOfDaysBetween(Instant departureDate, Instant returnDate) {
		long days = ChronoUnit.DAYS.between(departureDate, returnDate);
		return days;
	}

}
