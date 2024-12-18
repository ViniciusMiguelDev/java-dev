import java.security.InvalidParameterException;

public interface InterestService {
    Double getInterestRate();
    default Double payment(double amout, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amout * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}
