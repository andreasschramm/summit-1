package xcarpaccio.quotes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;

public class QuoteService {
	
	static double FACTOR = 1.8; 
	
	public Quote getQuote(QuoteRequest request) {
		
		
		Instant start  = dateToInstant(request.departureDate);
		Instant end = dateToInstant(request.returnDate);
		long numberOfDays = getNumberOfDaysBetween(start, end);
		long numberOfPersons = request.travellerAges.size();
		return new Quote(FACTOR * numberOfDays * numberOfPersons);
	}

	private Instant dateToInstant(String startDateString ) {
		DateTimeFormatter df =  DateTimeFormatter.ISO_DATE;
		return LocalDate.parse(startDateString, df).atStartOfDay().toInstant(ZoneOffset.UTC);
	}

	private long getNumberOfDaysBetween(Instant departureDate, Instant returnDate) {
		long days = ChronoUnit.DAYS.between(departureDate, returnDate);
		return days;
	}
	
	private double getCover(QuoteRequest request) {
		return 1.0;
	}
	
	private double getSumOfAgeRisks() {
		return 1.0;
	}
	
	private double getCountryValue() {
		return 1.0;
	}

}
