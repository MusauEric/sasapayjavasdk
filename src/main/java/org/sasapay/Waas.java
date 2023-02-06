package org.sasapay;

import com.github.tsohr.JSONObject;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Map;
import java.util.Scanner;

public class Waas {


    //WAAS PRODUCTS

    public static JSONObject purchaseKPLCtoken(String bearerToken) throws Exception {

        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "MerchantCode",  "40****9",
                "MeterNumber", "123456****012",
                "BeneficiaryAccountNumber", "40****9-122",
                "MobileNumber", "2547******39",
                "Amount", 10,
                "CallBackUrl", "https://posth****.io/d89d-4909-937b"

        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject tvPayment(String bearerToken) throws Exception {

        String url = "Endpoint";
        Map<String, Object> body = Map.of(
                "MerchantCode",  "40****9",
                "ServiceCode", "DSTV",
                "AccountNumber", "12****78",
                "BeneficiaryAccountNumber", "40****9-122",
                "MobileNumber", "2547******39",
                "Amount", 10,
                "CallBackUrl", "https://posth****.io/d89d-4909-937b"

        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject postPaidBillPayments(String bearerToken) throws Exception {

        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "MerchantCode",  "40****9",
                "ServiceCode", "WATER",
                "BeneficiaryAccountNumber", "40****9",
                "AccountNumber", "12****78",
                "MobileNumber", "2547******39",
                "Amount", 10,
                "CallBackUrl", "https://posth****.io/d89d-4909-937b"

        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject purchaseAirtime(String bearerToken) throws Exception {

        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "MerchantCode",  "83**18239**8",
                "BeneficiaryAccountNumber", "1***398-100",
                "MobileNumber", "2547******80",
                "Amount", 10,
                "CallBackUrl", "https://posth****.io/d89d-4909-937b"

        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject redeemLoyaltyPoint(String bearerToken) throws Exception {

        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "TransactionReference", "4dbac0a9-**********-f1f18a7962ae",
                "BeneficiaryAccountNumber", "1***398-100",
                "Points", 10,
                "TransactionFee", 0,
                "MerchantCode",  "83**18239**8",
                "CallBackUrl", "https://posth****.io/d89d-4909-937b",
                "Reason", "Customer Reason"

        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject transferPointToMerchantsAccount(String bearerToken) throws Exception {

        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "TransactionReference", "4dbac0a9-**********-f1f18a7962ae",
                "BeneficiaryAccountNumber", "1***398-100",
                "Points", 10,
                "TransactionFee", 0,
                "MerchantCode",  "83**18239**8",
                "CallBackUrl", "https://posth****.io/d89d-4909-937b",
                "Reason", "Customer Reason"

        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject topUpBeneficiaryPoint(String bearerToken) throws Exception {

        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "TransactionReference", "4dbac0a9-**********-f1f18a7962ae",
                "BeneficiaryAccountNumber", "1***398-100",
                "Points", 10,
                "TransactionFee", 0,
                "CallBackUrl", "https://posth****.io/d89d-4909-937b",
                "Reason", "Customer Reason"

        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject sharePointToOtherBeneficiary(String bearerToken) throws Exception {

        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "TransactionReference", "4dbac0a9-**********-f1f18a7962ae",
                "SenderBeneficiaryAccountNumber", "1***398-100",
                "RecipientBeneficiaryAccountNumber", "1***398-100",
                "MerchantCode", "831398",
                "Points", 10,
                "TransactionFee", 0,
                "Reason", "Customer Reason",
                "CallBackUrl", "https://posth****.io/d89d-4909-937b"
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject queryTransactionStatus(String bearerToken) throws Exception {

        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "MerchantCode", "40****9",
                "TransactionReference", "4dbac0a9-**********-f1f18a7962ae"
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject lipaFare(String bearerToken,String transaction_reference,String beneficiary_account_number,int matatu_bill_number,String amount,int merchant_code,String transaction_fee,String reason ,String callBack_Url) throws Exception {

        String url = ApiUrls.lipa_fare;

        Map<String, Object> body = Map.of(
                "TransactionReference", transaction_reference,
                "BeneficiaryAccountNumber", beneficiary_account_number,
                "MatatuBillNumber", matatu_bill_number,
                "Amount", amount,
                "MerchantCode", merchant_code,
                "TransactionFee", transaction_fee,
                "Reason", reason,
                "CallBackUrl", callBack_Url
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject tillPayment(String bearerToken,String transaction_reference,String beneficiary_account_number,int sasapay_bill_number,int amount,int merchant_code,int transaction_fee,String reason,String callBack_Url) throws Exception {

        String url = ApiUrls.till_payment;

        Map<String, Object> body = Map.of(
                "TransactionReference", transaction_reference,
                "BeneficiaryAccountNumber", beneficiary_account_number,
                "SasaPayBillNumber", sasapay_bill_number,
                "Amount", amount,
                "MerchantCode", merchant_code,
                "TransactionFee", transaction_fee,
                "Reason", reason,
                "CallBackUrl", callBack_Url
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject billPayment(String bearerToken,String transaction_reference,String bill_ref_number,String beneficiary_account_number,String sasapay_bill_number,int amount,String merchant_code,int transaction_fee,String reason,String callBack_Url) throws Exception {

        String url = ApiUrls.bill_payment;

        Map<String, Object> body = Map.of(
                "TransactionReference", transaction_reference,
                "BillRefNumber", bill_ref_number,
                "BeneficiaryAccountNumber", beneficiary_account_number,
                "SasaPayBillNumber", sasapay_bill_number,
                "Amount", amount,
                "MerchantCode", merchant_code,
                "TransactionFee", transaction_fee,
                "Reason", reason,
                "CallBackUrl", callBack_Url
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject requestPayment(String bearerToken,String transaction_reference,String network_code,String mobile_number,String beneficiary_account_number,int amount,int transaction_fee,String merchant_code,String reason,String callBack_Url) throws Exception {

        String url = ApiUrls.request_payment;

        Map<String, Object> body = Map.of(
                "TransactionReference", transaction_reference,
                "NetworkCode", network_code,
                "MobileNumber", mobile_number,
                "BeneficiaryAccountNumber", beneficiary_account_number,
                "Amount", amount,
                "TransactionFee", transaction_fee,
                "CurrencyCode", "KES",
                "MerchantCode", merchant_code,
                "Reason", reason,
                "CallBackUrl", callBack_Url
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject BeneficiaryToMerchant(String bearerToken,String transaction_reference,String merchant_code,String beneficiary_account_number,int amount,String reason,int transaction_fee,String callBack_Url) throws Exception {

        String url = ApiUrls.beneficiary_to_merchant;

        Map<String, Object> body = Map.of(
                "TransactionReference", transaction_reference,
                "MerchantCode", merchant_code,
                "BeneficiaryAccountNumber", beneficiary_account_number,
                "Amount", amount,
                "Reason", reason,
                "TransactionFee", transaction_fee,
                "CallBackUrl", callBack_Url
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject merchantToBeneficiary(String bearerToken,String TransactionReference,String merchant_code,String beneficiary_account_number,int amount,String reason,  String callBack_Url) throws Exception {

        String url = ApiUrls.merchant_to_beneficiary;

        Map<String, Object> body = Map.of(
                "TransactionReference", TransactionReference,
                "MerchantCode", merchant_code,
                "BeneficiaryAccountNumber", beneficiary_account_number,
                "Amount", amount,
                "Reason", reason,
                "CallBackUrl", callBack_Url
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject beneficiarySendToBank(String bearerToken,String transaction_reference,String beneficiary_accountNumber,String receiver_number,String channel_codes,int amount,String merchant_code,int transaction_fee,String callBack_Url) throws Exception {

        String url = ApiUrls.send_to_bank;

        Map<String, Object> body = Map.of(
                "TransactionReference", transaction_reference,
                "BeneficiaryAccountNumber", beneficiary_accountNumber,
                "ReceiverNumber", receiver_number,
                "ChannelCode", channel_codes,
                "Amount", amount,
                "MerchantCode", merchant_code,
                "TransactionFee", transaction_fee,
                "CallBackUrl", callBack_Url
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject beneficiarySendToMobileMoney(String bearerToken,String transaction_reference,String beneficiary_account_number,String mobile_operator_number,String channel_code , int amount ,String merchant_code,int transaction_fee,String callBack_Url) throws Exception {

        String url =ApiUrls.send_to_mobile_money;

        Map<String, Object> body = Map.of(
                "TransactionReference",transaction_reference,
                "BeneficiaryAccountNumber", beneficiary_account_number,
                "MobileOperatorNumber", mobile_operator_number,
                "ChannelCode", channel_code,
                "Amount", amount,
                "MerchantCode", merchant_code,
                "TransactionFee", transaction_fee,
                "CallBackUrl", callBack_Url
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject beneficiarySendToBeneficiary(String bearerToken,String transaction_reference,String sender_beneficiary_accountNumber,String recipient_beneficiary_accountNumber,String amount,String merchant_code,String transaction_fee,String callBack_Url) throws Exception {

        String url = ApiUrls.beneficiary_send_to_beneficiary;

        Map<String, Object> body = Map.of(
                "TransactionReference", transaction_reference,
                "SenderBeneficiaryAccountNumber", sender_beneficiary_accountNumber,
                "RecipientBeneficiaryAccountNumber", recipient_beneficiary_accountNumber,
                "Amount", amount,
                "MerchantCode", merchant_code,
                "TransactionFee", transaction_fee,
                "CallBackUrl", callBack_Url
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject topUpBeneficiaryWallet(String bearerToken,String transaction_reference,String network_code,String mobile_number,String beneficiary_account_number,String amount,String transaction_fee,String merchant_code,String callBack_Url,String reason) throws Exception {

        String url = ApiUrls.top_up_beneficiary_wallet;

        Map<String, Object> body = Map.of(
                "TransactionReference", transaction_reference,
                "NetworkCode", network_code,
                "MobileNumber", mobile_number,
                "BeneficiaryAccountNumber", beneficiary_account_number,
                "Amount", amount,
                "TransactionFee", transaction_fee,
                "CurrencyCode", "KES",
                "MerchantCode", merchant_code,
                "CallBackUrl", callBack_Url,
                "Reason", reason
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    public static JSONObject viewMerchantBeneficiary(String bearerToken,String merchant_code) {

        String urlEndPoint = ApiUrls.view_merchant_beneficiaries+merchant_code;

        try {
            URL url = new URL(urlEndPoint);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", "Bearer "+bearerToken);
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

                InputStream errorStream = con.getErrorStream();
                // Read the error stream into a string
                String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
                // Parse the error string as JSON
                JSONObject errorJson = new JSONObject(errorString);
                // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
                return errorJson;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static JSONObject channelCodes(String bearerToken) {

        String apiEndpoint = ApiUrls.channel_code;

        try {
            URL url = new URL(apiEndpoint);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", "Bearer "+bearerToken);
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

                InputStream errorStream = con.getErrorStream();
                // Read the error stream into a string
                String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
                // Parse the error string as JSON
                JSONObject errorJson = new JSONObject(errorString);
                // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
                return errorJson;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static JSONObject findNearestSasaPayAgent(String bearerToken,String Longitude,String Latitude ) {

        String urlEndpoint = ApiUrls.nearest_sasapay_agent+"Longitude="+Longitude+"&Latitude="+Latitude;

        try {
            URL url = new URL(urlEndpoint);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", "Bearer "+bearerToken);
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

                InputStream errorStream = con.getErrorStream();
                // Read the error stream into a string
                String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
                // Parse the error string as JSON
                JSONObject errorJson = new JSONObject(errorString);
                // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
                return errorJson;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static JSONObject queryMerchantAccountBalances(String bearerToken,String merchant_code) {

        String urlEndpoint = ApiUrls.query_merchants_balance+merchant_code;

        try {
            URL url = new URL(urlEndpoint);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", "Bearer "+bearerToken);
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

                InputStream errorStream = con.getErrorStream();
                // Read the error stream into a string
                String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
                // Parse the error string as JSON
                JSONObject errorJson = new JSONObject(errorString);
                // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
                return errorJson;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static JSONObject amendBeneficiaryDetails(String bearerToken,String merchant_code,String first_name,String middle_name,String last_name, String document_type,String document_number,String email,String beneficiary_account_number) throws Exception {

        String url = ApiUrls.amend_beneficiary_details;


        Map<String, Object> body = Map.of(
                "MerchantCode", merchant_code,
                "FirstName", first_name,
                "MiddleName", middle_name,
                "LastName", last_name,
                "DocumentType", document_type,
                "DocumentNumber", document_number,
                "Email", email,
                "BeneficiaryAccountNumber", beneficiary_account_number
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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

    public static JSONObject beneficiaryOnboarding(String bearerToken,String merchant_code,String first_name,String middle_name,String last_name,String mobile_number,String document_type,String document_number,String email) throws Exception {

        String url = ApiUrls.beneficiary_onboarding;

        Map<String, Object> body = Map.of(
                "MerchantCode", merchant_code,
                "FirstName", first_name,
                "MiddleName", middle_name,
                "LastName", last_name,
                "CountryCode", "254",
                "MobileNumber", mobile_number,
                "DocumentType", document_type,
                "DocumentNumber", document_number,
                "Email", email
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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

    public static JSONObject beneficiaryOnboardingConfirm(String bearerToken,String merchant_code,String registration_request_Id,String confirmation_code) throws Exception {


        String url = ApiUrls.beneficiary_onboarding_confirmation;

        Map<String, Object> body = Map.of(
                "MerchantCode", merchant_code,
                "RegistrationRequestId", registration_request_Id,
                "ConfirmationCode", confirmation_code
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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

    public static JSONObject beneficiaryKycUpload(String bearerToken,String merchant_code,String passportPhoto_imagePath,String documentFront_imagePath,String documentBack_imagePath) throws Exception {

        String url = ApiUrls.beneficiary_kyc_upload;

        File passport_size_photo = new File(passportPhoto_imagePath);
        File document_image_front = new File(documentFront_imagePath);
        File document_image_Back = new File(documentBack_imagePath);

        Map<String, Object> body = Map.of(
                "MerchantCode", merchant_code,
                "PassportSizePhoto", passport_size_photo,
                "DocumentImageFront",  document_image_front,
                "DocumentImageBack", document_image_Back
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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

    public static JSONObject entityOnboarding(String bearerToken,String merchant_code,String business_name,String business_type,String kra_pin,String business_reg_no,String country_code,String mobile_number,String email ,String proposed_account_number,String call_BackURL) throws Exception {

        String url = ApiUrls.entity_onboarding;

        Map<String, Object> body = Map.of(
                "MerchantCode", merchant_code,
                "BusinessName", business_name,
                "BusinessType", business_type,
                "KraPin", kra_pin,
                "BusinessRegNo", business_reg_no,
                "CountryCode", country_code,
                "MobileNumber", mobile_number,
                "Email", email,
                "ProposedAccountNumber", proposed_account_number,
                "CallBackURL", call_BackURL
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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

    public static JSONObject entityOnboardingConfirm(String bearerToken,String merchant_code,String registration_request_Id,String confirmation_code) throws Exception {


        String url = ApiUrls.entity_onboarding_confirm;

        Map<String, Object> body = Map.of(
                "MerchantCode", merchant_code,
                "RegistrationRequestId", registration_request_Id,
                "ConfirmationCode", confirmation_code
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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

    public static JSONObject entityKycUpload(String bearerToken,String merchant_code,String entity_account_number,String kraPinCert_imagePath,String businessRegCert_imagePath) throws Exception {

        String url = ApiUrls.entity_kyc_upload;

        File kraPinCert = new File(kraPinCert_imagePath);
        File businessRegCert = new File(businessRegCert_imagePath);

        Map<String, Object> body = Map.of(
                "MerchantCode", merchant_code,
                "EntityAccountNumber", entity_account_number,
                "KraPinCertificate",  kraPinCert,
                "BusinessRegistrationCertificate", businessRegCert
        );

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
            InputStream errorStream = con.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
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
    @NotNull
    public static JSONObject getWaasAccessToken(String clientId,String clientSecret) throws Exception {
        String tokenUrl = ApiUrls.waas_auth;

        HttpURLConnection conn = (HttpURLConnection) new URL(tokenUrl).openConnection();

        String encoded = Base64.getEncoder().encodeToString((clientId + ":" + clientSecret).getBytes());
        conn.setRequestProperty("Authorization", "Basic " + encoded);
        conn.setRequestMethod("GET");
        conn.setDoOutput(true);

        if (conn.getResponseCode() != 200) {
            InputStream errorStream = conn.getErrorStream();
            // Read the error stream into a string
            String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
            // Parse the error string as JSON
            JSONObject errorJson = new JSONObject(errorString);
            // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
            return errorJson;
        }

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
