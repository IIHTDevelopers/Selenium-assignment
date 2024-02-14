package com.iiht.evaluation.automation.functional;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.time.Duration;

import com.iiht.evaluation.automation.Activities;
import com.iiht.evaluation.automation.App;
import com.iiht.evaluation.automation.testutils.MasterData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import com.iiht.evaluation.automation.SubActivities;
import org.testng.annotations.*;

import static com.iiht.evaluation.automation.testutils.TestUtils.businessTestFile;
import static com.iiht.evaluation.automation.testutils.TestUtils.currentTest;
import static com.iiht.evaluation.automation.testutils.TestUtils.yakshaAssert;

public class TestAutomation extends App {

    @Test
    public void test_fixed_deposit_calculator_open_submenu() throws IOException {
        boolean testcase_status = true;
        try {
            boolean select_submenu_from_menu_succeed = Activities.select_submenu_from_menu(driver, "Personal Finance", "Fixed Deposit Interest Calculator");
            System.out.println("select_submenu_from_menu_succeed " + select_submenu_from_menu_succeed);
            if (!select_submenu_from_menu_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
            yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
            yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_fixed_deposit_fixed_deposit_calculator_enter_investment_amount() throws IOException {
        boolean testcase_status = true;
        String investment_amount = MasterData.test_fixed_deposit_calculator_master_data.get("investment_amount");
        try {
            boolean fixed_deposit_calculator_enter_investment_amount_succeed = Activities.fixed_deposit_calculator_enter_investment_amount(driver, investment_amount);
            System.out.println("fixed_deposit_calculator_enter_investment_amount_succeed " + fixed_deposit_calculator_enter_investment_amount_succeed);
            if (!fixed_deposit_calculator_enter_investment_amount_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_fixed_deposit_fixed_deposit_calculator_enter_investment_period() throws IOException {
        boolean testcase_status = true;
        String investment_period = MasterData.test_fixed_deposit_calculator_master_data.get("investment_period");
        try {
            boolean fixed_deposit_calculator_enter_investment_period_succeed = Activities.fixed_deposit_calculator_enter_investment_period(
                    driver, investment_period);
            System.out.println("fixed_deposit_calculator_enter_investment_period_succeed " + fixed_deposit_calculator_enter_investment_period_succeed);
            if (!fixed_deposit_calculator_enter_investment_period_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_fixed_deposit_fixed_deposit_calculator_enter_rate_of_return() throws IOException {
        boolean testcase_status = true;
        String rate_of_return = MasterData.test_fixed_deposit_calculator_master_data.get("rate_of_return");
        try {
            boolean fixed_deposit_calculator_enter_rate_of_return_succeed = Activities.fixed_deposit_calculator_enter_rate_of_return(
                    driver, rate_of_return);
            System.out.println("fixed_deposit_calculator_enter_rate_of_return_succeed " + fixed_deposit_calculator_enter_rate_of_return_succeed);
            if (!fixed_deposit_calculator_enter_rate_of_return_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_fixed_deposit_fixed_deposit_calculator_select_interest_frequency_monthly() throws IOException {
        boolean testcase_status = true;
        String interest_frequency_monthly = MasterData.test_fixed_deposit_calculator_master_data.get("interest_frequency_monthly");
        try {
            boolean fixed_deposit_calculator_select_interest_frequency_succeed = Activities.fixed_deposit_calculator_select_interest_frequency(
                    driver, interest_frequency_monthly);
            System.out.println("fixed_deposit_calculator_select_interest_frequency_succeed " + fixed_deposit_calculator_select_interest_frequency_succeed);
            if (!fixed_deposit_calculator_select_interest_frequency_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

   
    @Test
    public void test_fixed_deposit_fixed_deposit_calculator_click_submit_button() throws IOException {
        boolean testcase_status = true;
        try {
            boolean fixed_deposit_calculator_click_submit_button_succeed = Activities.fixed_deposit_calculator_click_submit_button(
                    driver);
            System.out.println("fixed_deposit_calculator_click_submit_button_succeed " + fixed_deposit_calculator_click_submit_button_succeed);
            if (!fixed_deposit_calculator_click_submit_button_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }

    @Test
    public void test_fixed_deposit_fixed_deposit_calculator_check_total_payment() throws IOException {
        boolean testcase_status = true;
        String total_payment = MasterData.test_fixed_deposit_calculator_master_data.get("total_payment");
        try {
            boolean fixed_deposit_calculator_check_total_payment_succeed = Activities.fixed_deposit_calculator_check_total_payment(
                    driver, total_payment);
            System.out.println("fixed_deposit_calculator_check_total_payment_succeed " + fixed_deposit_calculator_check_total_payment_succeed);
            if (!fixed_deposit_calculator_check_total_payment_succeed) {
                testcase_status = false;
            }
            System.out.println("testcase_status " + testcase_status);
           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        } catch (Exception ex) {
            System.out.println("ex " + ex);
           yakshaAssert(currentTest(), testcase_status, businessTestFile);
        }
    }
   

}

