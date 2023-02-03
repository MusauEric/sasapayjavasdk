package org.sasapay;

public class ApiUrls {
    public  static String sasapay_base_url = "https://sandbox.sasapay.app/api/v1/auth/token/?grant_type=client_credentials";
    public  static String cfn_callbackURL_reg = "https://sandbox.sasapay.app/api/v1/payments/register-ipn-url/";

    public static String customer_to_business = "https://sandbox.sasapay.app/api/v1/payments/request-payment/";

    public  static  String business_to_customer = "https://sandbox.sasapay.app/api/v1/payments/b2c/";

    public  static  String business_to_beneficiary = "https://sandbox.sasapay.app/api/v1/payments/b2c/beneficiary/";
}
