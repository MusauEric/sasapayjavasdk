package org.sasapay;

import com.github.tsohr.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class SasaPay {

    //SASAPAY PRODUCTS
    public JSONObject queryMerchantAccountBalance(String bearerToken, String merchant_code) {

        try {
            String apiEndpoint = ApiUrls.query_merchant_balance + merchant_code;
            Network jsonThread = new Network(apiEndpoint, bearerToken, 1, 0);
            Thread thread = new Thread(jsonThread);
            thread.start();
            thread.join();

            JSONObject result = jsonThread.getResult();
            System.out.println(result);
            return result;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }

    }

    public JSONObject verifyTransaction(String bearerToken, String merchant_code, String transaction_code) {

        try {
            String api_endpoint = ApiUrls.verify_transaction;
            Map<String, Object> body = Map.of(
                    "MerchantCode", merchant_code,
                    "TransactionCode", transaction_code);

            Network jsonThread = new Network(api_endpoint, bearerToken, body, 1);
            Thread thread = new Thread(jsonThread);
            thread.start();
            thread.join();

            JSONObject result = jsonThread.postResult();
            System.out.println(result);
            return result;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }

    }

    public JSONObject checkTransactionStatus(String bearerToken, String merchant_code, String checkout_request_id) {

        try {
            String api_endpoint = ApiUrls.check_transaction_status;
            Map<String, Object> body = Map.of(
                    "MerchantCode", merchant_code,
                    "CheckoutRequestId", checkout_request_id);

            Network jsonThread = new Network(api_endpoint, bearerToken, body, 1);
            Thread thread = new Thread(jsonThread);
            thread.start();
            thread.join();

            JSONObject result = jsonThread.postResult();
            System.out.println(result);
            return result;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }

    }

    public JSONObject businessToBusiness(String bearerToken, String merchant_code, String merchant_transaction_reference, int amount, String receiver_merchant_code, String callBack_URL, String descriptions) {

        try {
            String api_endpoint = ApiUrls.business_to_business;
            Map<String, Object> body = Map.of(
                    "MerchantCode", merchant_code,
                    "MerchantTransactionReference", merchant_transaction_reference,
                    "Currency", "KES",
                    "Amount", amount,
                    "ReceiverMerchantCode", receiver_merchant_code,
                    "CallBackURL", callBack_URL,
                    "Reason", descriptions);

            Network jsonThread = new Network(api_endpoint, bearerToken, body, 1);
            Thread thread = new Thread(jsonThread);
            thread.start();
            thread.join();

            JSONObject result = jsonThread.postResult();
            System.out.println(result);
            return result;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }

    }

    public JSONObject businessToBeneficiary(String bearerToken, String transaction_reference, String sender_merchant_code, String receiver_merchant_code, String beneficiary_account_number, int amount, int transaction_fee, String descriptions, String callBack_URL) {

        try {

            String api_endpoint = ApiUrls.business_to_beneficiary;
            Map<String, Object> body = Map.of(
                    "TransactionReference", transaction_reference,
                    "SenderMerchantCode", sender_merchant_code,
                    "ReceiverMerchantCode", receiver_merchant_code,
                    "BeneficiaryAccountNumber", beneficiary_account_number,
                    "Amount", amount,
                    "TransactionFee", transaction_fee,
                    "Reason", descriptions,
                    "CallBackURL", callBack_URL);

            Network jsonThread = new Network(api_endpoint, bearerToken, body, 1);
            Thread thread = new Thread(jsonThread);
            thread.start();
            thread.join();

            JSONObject result = jsonThread.postResult();
            System.out.println(result);
            return result;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }

    }

    public JSONObject businessToCustomer(String bearerToken, String merchant_code, int amount, String merchant_transaction_reference, String receiver_number, String channel_code, String descriptions, String call_backUrl) {

        try {
            String api_endpoint = ApiUrls.business_to_customer;
            Map<String, Object> body = Map.of(
                    "MerchantCode", merchant_code,
                    "Amount", amount,
                    "Currency", "KES",
                    "MerchantTransactionReference", merchant_transaction_reference,
                    "ReceiverNumber", receiver_number,
                    "Channel", channel_code,
                    "Reason", descriptions,
                    "CallBackURL", call_backUrl);

            Network jsonThread = new Network(api_endpoint, bearerToken, body, 1);
            Thread thread = new Thread(jsonThread);
            thread.start();
            thread.join();

            JSONObject result = jsonThread.postResult();
            System.out.println(result);
            return result;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }

    }

    public JSONObject customerToBusiness(String bearerToken, String merchant_code, String network_code, String phone_number, String transaction_desc, String account_reference, int amount, String callback_URL) {

        // NetworkCodes   SasaPay(0) 63902(MPesa) 63903(AirtelMoney) 63907(T-Kash)
        try {

            String api_endpoint = ApiUrls.customer_to_business;
            Map<String, Object> body = Map.of(
                    "MerchantCode", merchant_code,
                    "NetworkCode", network_code,
                    "PhoneNumber", phone_number,
                    "TransactionDesc", transaction_desc,
                    "AccountReference", account_reference,
                    "Currency", "KES",
                    "Amount", amount,
                    "CallBackURL", callback_URL);

            Network jsonThread = new Network(api_endpoint, bearerToken, body, 1);
            Thread thread = new Thread(jsonThread);
            thread.start();
            thread.join();

            JSONObject result = jsonThread.postResult();
            System.out.println(result);
            return result;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public JSONObject customerToBusinessAliasNumber(String bearerToken, String merchant_code, String alias_number, String transaction_desc, String account_reference, String amount, String transaction_fee, String call_BackURL) {

        try {

            String api_endpoint = ApiUrls.customer_to_business_alias;
            Map<String, Object> body = Map.of(
                    "MerchantCode", merchant_code,
                    "AliasNumber", alias_number,
                    "TransactionDesc", transaction_desc,
                    "AccountReference", account_reference,
                    "Currency", "KES",
                    "Amount", amount,
                    "TransactionFee", transaction_fee,
                    "CallBackURL", call_BackURL);

            Network jsonThread = new Network(api_endpoint, bearerToken, body, 1);
            Thread thread = new Thread(jsonThread);
            thread.start();
            thread.join();

            JSONObject result = jsonThread.postResult();
            System.out.println(result);
            return result;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }

    }

    public JSONObject ProcessPayment(String bearerToken, String merchant_code, String verification_code) {

        try {

            String api_endpoint = ApiUrls.process_payment;
            Map<String, Object> body = Map.of(
                    "MerchantCode", merchant_code,
                    "VerificationCode", verification_code);

            Network jsonThread = new Network(api_endpoint, bearerToken, body, 1);
            Thread thread = new Thread(jsonThread);
            thread.start();
            thread.join();

            JSONObject result = jsonThread.postResult();
            System.out.println(result);
            return result;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }

    }

    public JSONObject registerCallbackUrl(String bearerToken, int merchant_code, String confirmation_url) {

        try {
            String api_endpoint = ApiUrls.cfn_callbackURL_reg;

            Map<String, Object> body = Map.of(
                    "MerchantCode", merchant_code,
                    "ConfirmationUrl", confirmation_url);

            Network jsonThread = new Network(api_endpoint, bearerToken, body, 1);
            Thread thread = new Thread(jsonThread);
            thread.start();
            thread.join();

            JSONObject result = jsonThread.postResult();
            System.out.println(result);
            return result;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }

    }

    //Authentication
    public JSONObject getAccessToken(String clientId, String clientSecret) {
        String tokenUrl = ApiUrls.sasapay_auth_url;
        String encoded = Base64.getEncoder().encodeToString((clientId + ":" + clientSecret).getBytes());

        try {
            Network jsonThread = new Network(tokenUrl, encoded, 0, 0);
            Thread thread = new Thread(jsonThread);
            thread.start();
            thread.join();

            JSONObject result = jsonThread.getResult();
            System.out.println(result);
            return result;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

}