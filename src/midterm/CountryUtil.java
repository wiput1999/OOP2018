package midterm;

public class CountryUtil {
	private String[] countries = { "Thailand", "Japan", "China" };

	public String getCountryName(int index) {
		return countries[index];
	}

	public String getCapitalCity(String countryName) {
		if (countryName == "Thailand")
			return "Bangkok";
		if (countryName == "Japan")
			return "Tokyo";
		if (countryName == "China")
			return "Beijing";
		return "";
	}
}
