package org.sasapay;

import com.github.tsohr.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Map;
import java.util.Random;


public class SasaPay {
//    public static void SasaPay(String[] args) {
//        System.out.println("Hello world!");
//    }

    //SASAPAY PRODUCTS
    public static JSONObject queryMerchantAccountBalance(String bearerToken, String merchant_code) {
        String endpoint_url = ApiUrls.query_merchant_balance + merchant_code;
        try {
            URL url = new URL(endpoint_url);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", "Bearer " + bearerToken);
            int responseCode = con.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                JSONObject json = new JSONObject(response.toString());
                return json;
            } else {

                System.out.println(responseCode);
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static JSONObject verifyTransaction(String bearerToken, String merchant_code, String transaction_code) throws Exception {
        String url = ApiUrls.verify_transaction;
        Map<String, Object> body = Map.of(
                "MerchantCode", merchant_code,
                "TransactionCode", transaction_code);
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Set request method
        con.setRequestMethod("POST");

        // Add bearer token to authorization header
        con.setRequestProperty("Authorization", "Bearer " + bearerToken);

        // Set request content type
        con.setRequestProperty("Content-Type", "application/json");

        // Set request body
        JSONObject jsonObject = new JSONObject(body);
        String requestBody = jsonObject.toString();

        // Send post request
        con.setDoOutput(true);
        DataOutputStream out = new DataOutputStream(con.getOutputStream());
        out.writeBytes(requestBody);
        out.flush();
        out.close();

        int responseCode = con.getResponseCode();
        if (responseCode != 200) {
            return null;
//            throw new Exception("Response code: " + responseCode);
        }

        // Get response
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // Return response as JSONObject
        return new JSONObject(response.toString());
    }

    public static JSONObject checkTransactionStatus(String bearerToken, String merchant_code, String checkout_request_id) throws Exception {
        String url = ApiUrls.check_transaction_status;
        Map<String, Object> body = Map.of(
                "MerchantCode", merchant_code,
                "CheckoutRequestId", checkout_request_id);

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Set request method
        con.setRequestMethod("POST");

        // Add bearer token to authorization header
        con.setRequestProperty("Authorization", "Bearer " + bearerToken);

        // Set request content type
        con.setRequestProperty("Content-Type", "application/json");

        // Set request body
        JSONObject jsonObject = new JSONObject(body);
        String requestBody = jsonObject.toString();

        // Send post request
        con.setDoOutput(true);
        DataOutputStream out = new DataOutputStream(con.getOutputStream());
        out.writeBytes(requestBody);
        out.flush();
        out.close();

        int responseCode = con.getResponseCode();
        if (responseCode != 200) {
            return null;
//            throw new Exception("Response code: " + responseCode);
        }

        // Get response
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // Return response as JSONObject
        return new JSONObject(response.toString());
    }

    public static JSONObject businessToBusiness(String bearerToken, String merchant_code, String merchant_transaction_reference, int amount, String receiver_merchant_code, String callBack_URL, String descriptions) throws Exception {

        Random rand = new Random();
        int number = rand.nextInt(100);
        String url = ApiUrls.business_to_business;
        Map<String, Object> body = Map.of(
                "MerchantCode", merchant_code,
                "MerchantTransactionReference", merchant_transaction_reference,
                "Currency", "KES",
                "Amount", amount,
                "ReceiverMerchantCode", receiver_merchant_code,
                "CallBackURL", callBack_URL,
                "Reason", descriptions);

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Set request method
        con.setRequestMethod("POST");

        // Add bearer token to authorization header
        con.setRequestProperty("Authorization", "Bearer " + bearerToken);

        // Set request content type
        con.setRequestProperty("Content-Type", "application/json");

        // Set request body
        JSONObject jsonObject = new JSONObject(body);
        String requestBody = jsonObject.toString();

        // Send post request
        con.setDoOutput(true);
        DataOutputStream out = new DataOutputStream(con.getOutputStream());
        out.writeBytes(requestBody);
        out.flush();
        out.close();

        int responseCode = con.getResponseCode();
        if (responseCode != 200) {
//            throw new Exception("Response code: " + responseCode);
            return null;
        }

        // Get response
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // Return response as JSONObject
        return new JSONObject(response.toString());
    }

    public static JSONObject businessToBeneficiary(String bearerToken, String transaction_reference, String sender_merchant_code, String receiver_merchant_code, String beneficiary_account_number, int amount, int transaction_fee, String descriptions, String callBack_URL) throws Exception {

        // NetworkCodes   SasaPay(0) 63902(MPesa) 63903(AirtelMoney) 63907(T-Kash)
        Random rand = new Random();
        int number = rand.nextInt(100);

        String url = ApiUrls.business_to_beneficiary;
        Map<String, Object> body = Map.of(
                "TransactionReference", transaction_reference,
                "SenderMerchantCode", sender_merchant_code,
                "ReceiverMerchantCode", receiver_merchant_code,
                "BeneficiaryAccountNumber", beneficiary_account_number,
                "Amount", amount,
                "TransactionFee", transaction_fee,
                "Reason", descriptions,
                "CallBackURL", callBack_URL);

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Set request method
        con.setRequestMethod("POST");

        // Add bearer token to authorization header
        con.setRequestProperty("Authorization", "Bearer " + bearerToken);

        // Set request content type
        con.setRequestProperty("Content-Type", "application/json");

        // Set request body
        JSONObject jsonObject = new JSONObject(body);
        String requestBody = jsonObject.toString();

        // Send post request
        con.setDoOutput(true);
        DataOutputStream out = new DataOutputStream(con.getOutputStream());
        out.writeBytes(requestBody);
        out.flush();
        out.close();

        int responseCode = con.getResponseCode();
        if (responseCode != 200) {
//            throw new Exception("Response code: " + responseCode);
            return null;
        }

        // Get response
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // Return response as JSONObject
        return new JSONObject(response.toString());
    }

    public static JSONObject businessToCustomer(String bearerToken, String merchant_code, int amount, String merchant_transaction_reference, String receiver_number, String channel_code, String descriptions, String call_backUrl) throws Exception {

        // NetworkCodes   SasaPay(0) 63902(MPesa) 63903(AirtelMoney) 63907(T-Kash)
        Random rand = new Random();
        int number = rand.nextInt(100);
        String url = ApiUrls.business_to_customer;
        Map<String, Object> body = Map.of(
                "MerchantCode", merchant_code,
                "Amount", amount,
                "Currency", "KES",
                "MerchantTransactionReference", merchant_transaction_reference,
                "ReceiverNumber", receiver_number,
                "Channel", channel_code,
                "Reason", descriptions,
                "CallBackURL", call_backUrl);


        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Set request method
        con.setRequestMethod("POST");

        // Add bearer token to authorization header
        con.setRequestProperty("Authorization", "Bearer " + bearerToken);

        // Set request content type
        con.setRequestProperty("Content-Type", "application/json");

        // Set request body
        JSONObject jsonObject = new JSONObject(body);
        String requestBody = jsonObject.toString();

        // Send post request
        con.setDoOutput(true);
        DataOutputStream out = new DataOutputStream(con.getOutputStream());
        out.writeBytes(requestBody);
        out.flush();
        out.close();

        int responseCode = con.getResponseCode();
        if (responseCode != 200) {
            return null;
//            throw new Exception("Response code: " + responseCode);
        }

        // Get response
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // Return response as JSONObject
        return new JSONObject(response.toString());
    }

    public static JSONObject customerToBusiness(String bearerToken, String merchant_code, String network_code, String phone_number, String transaction_desc, String account_reference, int amount, String callback_URL) throws Exception {

        // NetworkCodes   SasaPay(0) 63902(MPesa) 63903(AirtelMoney) 63907(T-Kash)
//        Random rand = new Random();
//        int number = rand.nextInt(100);
        String url = ApiUrls.customer_to_business;
        Map<String, Object> body = Map.of(
                "MerchantCode", merchant_code,
                "NetworkCode", network_code,
                "PhoneNumber", phone_number,
                "TransactionDesc", transaction_desc,
                "AccountReference", account_reference,
                "Currency", "KES",
                "Amount", amount,
                "CallBackURL", callback_URL);
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Set request method
        con.setRequestMethod("POST");

        // Add bearer token to authorization header
        con.setRequestProperty("Authorization", "Bearer " + bearerToken);

        // Set request content type
        con.setRequestProperty("Content-Type", "application/json");

        // Set request body
        JSONObject jsonObject = new JSONObject(body);
        String requestBody = jsonObject.toString();

        // Send post request
        con.setDoOutput(true);
        DataOutputStream out = new DataOutputStream(con.getOutputStream());
        out.writeBytes(requestBody);
        out.flush();
        out.close();

        int responseCode = con.getResponseCode();
        if (responseCode != 200) {

            return null;
//            throw new Exception("Response code: " + responseCode);
        }

        // Get response
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // Return response as JSONObject
        return new JSONObject(response.toString());
    }

    public static JSONObject registerCallbackUrl(String bearerToken, int merchant_code, String confirmation_url) throws Exception {
        String api_endpoint = ApiUrls.cfn_callbackURL_reg;

        Map<String, Object> body = Map.of(
                "MerchantCode", merchant_code,
                "ConfirmationUrl", confirmation_url);
        URL obj = new URL(api_endpoint);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Set request method
        con.setRequestMethod("POST");

        // Add bearer token to authorization header
        con.setRequestProperty("Authorization", "Bearer " + bearerToken);

        // Set request content type
        con.setRequestProperty("Content-Type", "application/json");

        // Set request body
        JSONObject jsonObject = new JSONObject(body);
        String requestBody = jsonObject.toString();

        // Send post request
        con.setDoOutput(true);
        DataOutputStream out = new DataOutputStream(con.getOutputStream());
        out.writeBytes(requestBody);
        out.flush();
        out.close();

        int responseCode = con.getResponseCode();
        if (responseCode != 200) {
            return null;
//            throw new Exception("Response code: " + responseCode);
        }

        // Get response
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // Return response as JSONObject
        return new JSONObject(response.toString());

    }

    //Authentication
    public static JSONObject getAccessToken(String client_Id, String client_Secret) throws Exception {
        String tokenUrl = ApiUrls.sasapay_base_url;

//        String clientId = "YQtaz0efSJTH1tAF6s9rXBsiEcl0yXXruPeV9yUb";
//        String clientSecret = "XiO9o6O6XMvKCOQKCsHxES997bxp55qFQS0AEZv6k5kseUCBtkHsr5rFOp5jB4gcyEzRvCY15PhEyUQUqH9LEo2l7lggkfEX3IGkDwkg8ht0fN3u23e2cm64SeFEqjNR";

        HttpURLConnection conn = (HttpURLConnection) new URL(tokenUrl).openConnection();

        String encoded = Base64.getEncoder().encodeToString((client_Id + ":" + client_Secret).getBytes());
        conn.setRequestProperty("Authorization", "Basic " + encoded);
        conn.setRequestMethod("GET");
        conn.setDoOutput(true);

        if (conn.getResponseCode() != 200) {
//            throw new Exception("Failed to get access token");
            return null;
        } else {

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                response.append(line);
            }
            br.close();

            JSONObject json = new JSONObject(response.toString());
            return json;

        }


    }

}