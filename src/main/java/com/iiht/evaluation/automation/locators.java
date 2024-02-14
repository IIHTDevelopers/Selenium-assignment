package com.iiht.evaluation.automation;

import java.util.HashMap;
import java.util.Map;

public class locators {
    public static final Map<String, String> money_control_element = new HashMap<>();

    static {
        

        money_control_element.put("main_menu", "");
        money_control_element.put("sub_menu", "");

        money_control_element.put("investment_amount_input", "");
        money_control_element.put("investment_period_input", "");
        money_control_element.put("rate_of_return_input", "");
        money_control_element.put("interest_frequency_radio", "");
               money_control_element.put("submit_button", "");
       

        
    }
}
