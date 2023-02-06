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
    public  static  String customer_to_business_alias = "https://sandbox.sasapay.app/api/v1/payments/request-payment-by-alias/";

    public  static String process_payment = "https://sandbox.sasapay.app/api/v1/payments/process-payment/";


    //WaaS url endpoints

    public static  String waas_auth = "https://sandbox.sasapay.app/api/v1/waas/auth/token/?grant_type=client_credentials";
    public  static  String entity_onboarding ="https://sandbox.sasapay.app/api/v1/waas/entity-registration/";

    public  static  String entity_onboarding_confirm = "https://sandbox.sasapay.app/api/v1/waas/entity-registration/confirmation/";
    public static  String entity_kyc_upload = "https://sandbox.sasapay.app/api/v1/waas/entity-registration/confirmation/";

    public static String beneficiary_onboarding = "https://sandbox.sasapay.app/api/v1/waas/customer-registration/";

    public  static  String beneficiary_onboarding_confirmation = "https://sandbox.sasapay.app/api/v1/waas/customer-registration-confirmation/";
    public  static  String beneficiary_kyc_upload = "https://sandbox.sasapay.app/api/v1/waas/customer-registration/kyc-upload/";

    public  static  String  amend_beneficiary_details = "https://sandbox.sasapay.app/api/v1/waas/beneficiary/update/";

    public static  String query_merchants_balance = "https://sandbox.sasapay.app/api/v1/waas/merchant-balances/?MerchantCode=";

    public  static  String nearest_sasapay_agent = "https://sandbox.sasapay.app/api/v1/waas/nearest-agent/?";

    public  static  String channel_code = "https://sandbox.sasapay.app/api/v1/waas/channel-codes/";

    public  static  String view_merchant_beneficiaries = "https://sandbox.sasapay.app/api/v1/waas/customers/?MerchantCode=";

    public  static  String top_up_beneficiary_wallet = "https://sandbox.sasapay.app/api/v1/waas/customers/load-wallet/request/";

    public static  String beneficiary_send_to_beneficiary = " https://sandbox.sasapay.app/api/v1/waas/customer-to-customer-transfer/";

    public static String send_to_mobile_money = "https://sandbox.sasapay.app/api/v1/waas/customer-to-mobile-money-transfer/";

    public static String send_to_bank = "https://sandbox.sasapay.app/api/v1/waas/customer-to-bank-transfer/";

    public  static  String merchant_to_beneficiary = "https://sandbox.sasapay.app/api/v1/waas/merchant-to-beneficiary/";

    public  static  String beneficiary_to_merchant = "https://sandbox.sasapay.app/api/v1/waas/beneficiary-to-merchant/";

    public static String request_payment="https://sandbox.sasapay.app/api/v1/waas/request-payment/";

    public  static  String bill_payment = "https://sandbox.sasapay.app/api/v1/waas/request-payment/";

    public  static  String till_payment =" https://sandbox.sasapay.app/api/v1/waas/customers/lipa-till/";
}
