package com.iiht.evaluation.automation.testutils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MasterData {
	public static final Map<String, String> test_success_login_master_data = new HashMap<>();
	public static final Map<String, String> test_failure_login_master_data = new HashMap<>();
	public static final Map<String, String> test_fixed_deposit_calculator_master_data = new HashMap<>();
	public static final Map<String, String> test_reset_fixed_deposit_calculator_master_data = new HashMap<>();
	
	static {

		/* **********************************/
		test_fixed_deposit_calculator_master_data.put("investment_amount","2000000");
		test_fixed_deposit_calculator_master_data.put("investment_period","14");
		test_fixed_deposit_calculator_master_data.put("rate_of_return","12");
		test_fixed_deposit_calculator_master_data.put("interest_frequency_monthly","Monthly");
		test_fixed_deposit_calculator_master_data.put("interest_frequency_quaterly","Quaterly");
		test_fixed_deposit_calculator_master_data.put("interest_frequency_half_yearly","Half Yearly");
		test_fixed_deposit_calculator_master_data.put("interest_frequency_yearly","Yearly");
		test_fixed_deposit_calculator_master_data.put("tax_rate","2000000");
		test_fixed_deposit_calculator_master_data.put("total_payment","2,000,000.00");
		test_fixed_deposit_calculator_master_data.put("total_interest","8,641,939.64");
		test_fixed_deposit_calculator_master_data.put("total_corpus","10,641,939.64");
		test_fixed_deposit_calculator_master_data.put("post_tax_amount","9,293,797.05");



	}
}
