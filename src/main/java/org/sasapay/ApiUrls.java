package org.sasapay;

public class ApiUrls {

    //SasaPayUrls
    public  static String sasapay_base_url = "https://sandbox.sasapay.app/api/v1/auth/token/?grant_type=client_credentials";
    public  static String cfn_callbackURL_reg = "https://sandbox.sasapay.app/api/v1/payments/register-ipn-url/";
    public static String customer_to_business = "https://sandbox.sasapay.app/api/v1/payments/request-payment/";
    public  static  String business_to_customer = "https://sandbox.sasapay.app/api/v1/payments/b2c/";
    public  static  String business_to_beneficiary = "https://sandbox.sasapay.app/api/v1/payments/b2c/beneficiary/";
    public  static  String business_to_business = " https://sandbox.sasapay.app/api/v1/payments/b2b/";
    public  static  String check_transaction_status = "https://sandbox.sasapay.app/api/v1/transactions/status/";
    public  static  String verify_transaction = "https://sandbox.sasapay.app/api/v1/transactions/verify/";
    public  static  String query_merchant_balance = "https://sandbox.sasapay.app/api/v1/payments/check-balance/?MerchantCode=";


    //WaaS url endpoints

    public static  String waas_auth = "https://sandbox.sasapay.app/api/v1/waas/auth/token/?grant_type=client_credentials";
    public  static  String entity_onboarding ="https://sandbox.sasapay.app/api/v1/waas/entity-registration/";
}
