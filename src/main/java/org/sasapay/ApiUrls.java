package org.sasapay;

public class ApiUrls {

    public static String base_url = "https://api.sasapay.me/";

    //SasaPayUrls
    public static String sasapay_auth_url = base_url + "api/v1/auth/token/?grant_type=client_credentials";
    public static String cfn_callbackURL_reg = base_url + "api/v1/payments/register-ipn-url/";
    public static String customer_to_business = base_url + "api/v1/payments/request-payment/";
    public static String business_to_customer = base_url + "api/v1/payments/b2c/";
    public static String business_to_beneficiary = base_url + "api/v1/payments/b2c/beneficiary/";
    public static String business_to_business = base_url + "api/v1/payments/b2b/";
    public static String check_transaction_status = base_url + "api/v1/transactions/status/";
    public static String verify_transaction = base_url + "api/v1/transactions/verify/";
    public static String query_merchant_balance = base_url + "api/v1/payments/check-balance/?MerchantCode=";
    public static String customer_to_business_alias = base_url + "api/v1/payments/request-payment-by-alias/";

    public static String process_payment = base_url + "api/v1/payments/process-payment/";


    //WaaS url endpoints

    public static String waas_auth = base_url + "api/v1/waas/auth/token/?grant_type=client_credentials";
    public static String entity_onboarding = base_url + "api/v1/waas/entity-registration/";

    public static String entity_onboarding_confirm = base_url + "api/v1/waas/entity-registration/confirmation/";
    public static String entity_kyc_upload = base_url + "api/v1/waas/entity-registration/confirmation/";

    public static String beneficiary_onboarding = base_url + "api/v1/waas/customer-registration/";

    public static String beneficiary_onboarding_confirmation = base_url + "api/v1/waas/customer-registration-confirmation/";
    public static String beneficiary_kyc_upload = base_url + "api/v1/waas/customer-registration/kyc-upload/";

    public static String amend_beneficiary_details = base_url + "api/v1/waas/beneficiary/update/";

    public static String query_merchants_balance = base_url + "api/v1/waas/merchant-balances/?MerchantCode=";

    public static String nearest_sasapay_agent = base_url + "api/v1/waas/nearest-agent/?";

    public static String channel_code = base_url + "api/v1/waas/channel-codes/";

    public static String view_merchant_beneficiaries = base_url + "api/v1/waas/customers/?MerchantCode=";

    public static String top_up_beneficiary_wallet = base_url + "api/v1/waas/customers/load-wallet/request/";

    public static String beneficiary_send_to_beneficiary = base_url + "api/v1/waas/customer-to-customer-transfer/";

    public static String send_to_mobile_money = base_url + "api/v1/waas/customer-to-mobile-money-transfer/";

    public static String send_to_bank = base_url + "api/v1/waas/customer-to-bank-transfer/";

    public static String merchant_to_beneficiary = base_url + "api/v1/waas/merchant-to-beneficiary/";

    public static String beneficiary_to_merchant = base_url + "api/v1/waas/beneficiary-to-merchant/";

    public static String request_payment = base_url + "api/v1/waas/request-payment/";

    public static String bill_payment = base_url + "api/v1/waas/request-payment/";

    public static String till_payment = base_url + "api/v1/waas/customers/lipa-till/";

    public static String lipa_fare = base_url + "api/v1/waas/customers/lipa-fare/";

    public static String query_transaction_status = base_url + "api/v1/waas/transaction-status/";

    public static String share_points_to_beneficiaries = base_url + "api/v1/waas/points/beneficiary-to-beneficiary/";

    public static String top_up_beneficiary_point = base_url + "api/v1/waas/points/merchant-to-beneficiary/";

    public static String transfer_point_to_merchant = base_url + "api/v1/waas/points/beneficiary-to-merchant/";

    public static String redeem_loyalty_points = base_url + "api/v1/waas/points/redeem/";

    public static String purchase_airtime = base_url + "api/v1/waas/utilities/direct-airtime/";

    public static String post_paid_pay_bill = base_url + "api/v1/waas/utilities/postpaid-bill-payments/";

    public static String tv_payment = base_url + "api/v1/waas/utilities/pay-tv/";

    public static String purchase_kplc = base_url + "api/v1/waas/utilities/kplc-token/";
}
