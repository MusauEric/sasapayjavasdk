package org.sasapay;

import com.github.tsohr.JSONObject;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Map;

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
            throw new Exception("Response code: " + responseCode);
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
            throw new Exception("Response code: " + responseCode);
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
            throw new Exception("Response code: " + responseCode);
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
            throw new Exception("Response code: " + responseCode);
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
            throw new Exception("Response code: " + responseCode);
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
            throw new Exception("Response code: " + responseCode);
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
            throw new Exception("Response code: " + responseCode);
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
            throw new Exception("Response code: " + responseCode);
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
            throw new Exception("Response code: " + responseCode);
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
    public static JSONObject lipaFare(String bearerToken) throws Exception {

        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "TransactionReference", "o**9",
                "BeneficiaryAccountNumber", "40****9-122",
                "MatatuBillNumber", 1245622,
                "Amount", 10,
                "MerchantCode", 4034569,
                "TransactionFee", 0,
                "Reason", "Customer Reason",
                "CallBackUrl", "https://******.io/d89d-4909-937b"
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
            throw new Exception("Response code: " + responseCode);
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
    public static JSONObject tillPayment(String bearerToken) throws Exception {

        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "TransactionReference", "2**82",
                "BeneficiaryAccountNumber", "404***2-1",
                "SasaPayBillNumber", 1245622,
                "Amount", 10,
                "MerchantCode", 4034569,
                "TransactionFee", 0,
                "Reason", "Customer Reason",
                "CallBackUrl", "https://******.io/d89d-4909-937b"
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
            throw new Exception("Response code: " + responseCode);
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
    public static JSONObject billPayment(String bearerToken) throws Exception {

        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "TransactionReference", "2**82",
                "BillRefNumber", "6***2",
                "BeneficiaryAccountNumber", "404***2-1",
                "SasaPayBillNumber", "12***22",
                "Amount", "10.0",
                "MerchantCode", "40****9",
                "TransactionFee", "0",
                "Reason", "Customer Reason",
                "CallBackUrl", "https://******.io/d89d-4909-937b"
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
            throw new Exception("Response code: " + responseCode);
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
    public static JSONObject requestPayment(String bearerToken) throws Exception {

        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "TransactionReference", "2**82",
                "NetworkCode", "6***2",
                "MobileNumber", "2547*******39",
                "BeneficiaryAccountNumber", "404***2-1",
                "Amount", "10.0",
                "TransactionFee", "0",
                "CurrencyCode", "KES",
                "MerchantCode", "40****9",
                "Reason", "Customer Reason",
                "CallBackUrl", "https://******.io/d89d-4909-937b"
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
            throw new Exception("Response code: " + responseCode);
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
    public static JSONObject BeneficiaryToMerchant(String bearerToken) throws Exception {

        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "TransactionReference", "2**82",
                "MerchantCode", "40****9",
                "BeneficiaryAccountNumber", "404***2-1",
                "Amount", "10.0",
                "Reason", "Customer Reason",
                "TransactionFee", "0",
                "CallBackUrl", "https://******.io/d89d-4909-937b"
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
            throw new Exception("Response code: " + responseCode);
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
    public static JSONObject merchantToBeneficiary(String bearerToken) throws Exception {

        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "TransactionReference", "2**82",
                "MerchantCode", "40****9",
                "BeneficiaryAccountNumber", "404***2-1",
                "Amount", "100",
                "Reason", "Customer Reason",
                "CallBackUrl", "https://******.io/d89d-4909-937b"
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
            throw new Exception("Response code: " + responseCode);
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
    public static JSONObject beneficiarySendToBank(String bearerToken) throws Exception {

        String url = "Endpoint";


        Map<String, Object> body = Map.of(
                "TransactionReference", "0****4",
                "BeneficiaryAccountNumber", "404***2-1",
                "ReceiverNumber", "12******104",
                "ChannelCode", "1",
                "Amount", "100",
                "MerchantCode", "40****9",
                "TransactionFee", "0",
                "CallBackUrl", "https://******.io/d89d-4909-937b"
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
            throw new Exception("Response code: " + responseCode);
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
    public static JSONObject beneficiarySendToMobileMoney(String bearerToken) throws Exception {

        String url = "Endpoint";


        Map<String, Object> body = Map.of(
                "TransactionReference", "0****4",
                "BeneficiaryAccountNumber", "404***2-1",
                "MobileOperatorNumber", "25470****739",
                "ChannelCode", "63**2",
                "Amount", "50",
                "MerchantCode", "40****9",
                "TransactionFee", "0",
                "CallBackUrl", "https://******.io/d89d-4909-937b"
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
            throw new Exception("Response code: " + responseCode);
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
    public static JSONObject beneficiarySendToBeneficiary(String bearerToken) throws Exception {

        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "TransactionReference", "0****4",
                "SenderBeneficiaryAccountNumber", "40****59-122",
                "RecipientBeneficiaryAccountNumber", "4040359-133",
                "Amount", "2",
                "MerchantCode", "40****9",
                "TransactionFee", "0",
                "CallBackUrl", "https://******.io/d89d-4909-937b"
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
            throw new Exception("Response code: " + responseCode);
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
    public static JSONObject topUpBeneficiaryWallet(String bearerToken) throws Exception {

        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "TransactionReference", "0****4",
                "NetworkCode", "6***2",
                "MobileNumber", "2547*******39",
                "BeneficiaryAccountNumber", "40****9-122",
                "Amount", "1",
                "TransactionFee", "0",
                "CurrencyCode", "KES",
                "MerchantCode", "40****9",
                "CallBackUrl", "https://******.io/d89d-4909-937b",
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
            throw new Exception("Response code: " + responseCode);
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
    public static JSONObject viewMerchantBeneficiary(String bearerToken) {

        try {
            URL url = new URL("Endpoint");
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

                System.out.println( responseCode);
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static JSONObject channelCodes(String bearerToken) {

        try {
            URL url = new URL("Endpoint");

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

                System.out.println( responseCode);
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static JSONObject findNearestSasaPayAgent(String bearerToken) {

        try {
            URL url = new URL("Endpoint");

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

                System.out.println( responseCode);
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static JSONObject queryMerchantAccountBalances(String bearerToken) {

        try {
            URL url = new URL("Endpoint");

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

                System.out.println( responseCode);
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static JSONObject amendBeneficiaryDetails(String bearerToken) throws Exception {

        String url = "Endpoint";


        Map<String, Object> body = Map.of(
                "MerchantCode", "merchant_code",
                "FirstName", "Erick",
                "MiddleName", "",
                "LastName", "Musa",
                "DocumentType", "1",
                "DocumentNumber", "123459**6",
                "Email", "entity@example.com",
                "BeneficiaryAccountNumber", "83***1-1**9"
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
            throw new Exception("Response code: " + responseCode);
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
    public static JSONObject beneficiaryOnboarding(String bearerToken) throws Exception {

        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "MerchantCode", "merchant_code",
                "FirstName", "Erick",
                "MiddleName", "",
                "LastName", "Musa",
                "CountryCode", "254",
                "MobileNumber", "07*****739",
                "DocumentType", "1",
                "DocumentNumber", "123459**6",
                "Email", "entity@example.com"
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
            throw new Exception("Response code: " + responseCode);
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
    public static JSONObject entityOnboarding(String bearerToken) throws Exception {


        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "MerchantCode", "merchant_code",
                "BusinessName", "Musa LTD",
                "BusinessType", "Partnership",
                "KraPin", "A04**3533Y",
                "BusinessRegNo", "KRCW1234",
                "CountryCode", "254",
                "MobileNumber", "07*****739",
                "Email", "entity@example.com",
                "ProposedAccountNumber", "123456",
                "CallBackURL", "https://posthere.io/37c6-44a6-a2f4"
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
            throw new Exception("Response code: " + responseCode);
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
//            throw new Exception("Failed to get access token");
            return  null;
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
