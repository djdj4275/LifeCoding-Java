
public class AccountingArrayApp {

	public static void main(String[] args) {
		// argument에 값을 넣고 그것을 들고오기엔 args는 배열이기에 double 변수에 못들어가기에
		// double로 형 변환을 시켜서 변수에 넣도록 
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		double[] dividendRates = new double[3];
		// double형식의 데이터가 3개들어간 배열을 생
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
		System.out.println("Value of supply(공급가) : " + valueOfSupply);
		System.out.println("VAT(부가가치세) : " + vat);
		System.out.println("Total(물건의값) : " + total);
		System.out.println("Expense(원가) : " + expense);
		System.out.println("Income(순이익) : " + income);
		System.out.println("Dividend(첫번째투자자) : " + dividend1);
		System.out.println("Divid end(두번째투자자) : " + dividend2);
		System.out.println("Dividend(세번째투자자) : " + dividend3);
	}

}
