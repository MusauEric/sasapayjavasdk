package org.sasapay;

import com.github.tsohr.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SasaPay {
    public static void SasaPay(String[] args) {
        System.out.println("Hello world!");
    }



    //SASAPAY PRODUCTS
    public static JSONObject queryMerchantAccountBalance(String bearerToken) {

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
    public static JSONObject verifyTransaction(String bearerToken) throws Exception {
        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "MerchantCode", "merchant_code",
                "TransactionCode", "transaction_code");


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
    public static JSONObject checkTransactionStatus(String bearerToken) throws Exception {


        String url = "Endpoint";


        Map<String, Object> body = Map.of(
                "MerchantCode", "merchant_code",
                "CheckoutRequestId", "checkout_request_id");


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
    public static JSONObject businessToBusiness(String bearerToken) throws Exception {

        Random rand = new Random();
        int number = rand.nextInt(100);

        String url = "Endpoint";

        Map<String, Object> body = Map.of(
                "MerchantCode", "merchant_code",
                "MerchantTransactionReference", "merchant_transaction_reference",
                "Currency", "KES",
                "Amount", 50,
                "ReceiverMerchantCode", "receiver_merchant_code",
                "CallBackURL", "https://posthere.io/37c6-44a6-a2f4",
                "Reason", "description");

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
    public static JSONObject businessToBeneficiary(String bearerToken) throws Exception {

        // NetworkCodes   SasaPay(0) 63902(MPesa) 63903(AirtelMoney) 63907(T-Kash)

        Random rand = new Random();
        int number = rand.nextInt(100);


        String url = "Endpoint";


        Map<String, Object> body = Map.of(
                "TransactionReference", "transactionReference",
                "SenderMerchantCode", "SsenderMerchantCode",
                "ReceiverMerchantCode", "receiverMerchantCode",
                "BeneficiaryAccountNumber", "beneficiaryAccountNumber",
                "Amount", 200,
                "TransactionFee", 0,
                "Reason", "description",
                "CallBackURL", "https://posthere.io/37c6-44a6-a2f4");


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
    public static JSONObject businessToCustomer(String bearerToken) throws Exception {

        // NetworkCodes   SasaPay(0) 63902(MPesa) 63903(AirtelMoney) 63907(T-Kash)

        Random rand = new Random();
        int number = rand.nextInt(100);


        String url = "Endpoint";


        Map<String, Object> body = Map.of(
                "MerchantCode", "merchant_code",
                "Amount", 200,
                "Currency", "KES",
                "MerchantTransactionReference", "706071739",
                "ReceiverNumber", "2547******39",
                "Channel", "channel_code",
                "Reason", "description",
                "CallBackURL", "https://posthere.io/37c6-44a6-a2f4");


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
    public static JSONObject c2b(String bearerToken) throws Exception {

        // NetworkCodes   SasaPay(0) 63902(MPesa) 63903(AirtelMoney) 63907(T-Kash)

        Random rand = new Random();
        int number = rand.nextInt(100);


        String url = "https://sandbox.sasapay.app/api/v1/payments/request-payment/";

        Map<String, Object> body = Map.of(
                "MerchantCode", "600980",
                "NetworkCode", "63902",
                "PhoneNumber", "254706071739",
                "TransactionDesc", "description",
                "AccountReference", "706071739",
                "Currency", "KES",
                "Amount", 5,
                "CallBackURL", "https://posthere.io/37c6-44a6-a2f4");


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
    public  static  void  registerCallbackUrl (){

        String access_token = "generated access token";

        String api_endpoint = "Endpoint";

        try {
            URL url = new URL(api_endpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            String data = "MerchantCode=merchant_code&ConfirmationUrl=confirmation_url";
            byte[] dataBytes = data.getBytes(StandardCharsets.UTF_8);

            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Authorization", "Bearer "+access_token);
            connection.setRequestProperty("Content-Length", Integer.toString(dataBytes.length));

            try (DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream())) {
                outputStream.write(dataBytes);
            }

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                StringBuilder response = new StringBuilder();
                try (Scanner scanner = new Scanner(new InputStreamReader(connection.getInputStream()))) {
                    while (scanner.hasNextLine()) {
                        response.append(scanner.nextLine());
                    }
                }
                JSONObject jsonResponse  = new JSONObject(response.toString());
                System.out.println(jsonResponse);


            } else {
                System.out.println("Response code: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //Authentication
    public static JSONObject getAccessToken(String client_Id,String client_Secret) throws Exception {
        String tokenUrl = ApiUrls.sasapay_base_url;

//        String clientId = "YQtaz0efSJTH1tAF6s9rXBsiEcl0yXXruPeV9yUb";
//        String clientSecret = "XiO9o6O6XMvKCOQKCsHxES997bxp55qFQS0AEZv6k5kseUCBtkHsr5rFOp5jB4gcyEzRvCY15PhEyUQUqH9LEo2l7lggkfEX3IGkDwkg8ht0fN3u23e2cm64SeFEqjNR";

        HttpURLConnection conn = (HttpURLConnection) new URL(tokenUrl).openConnection();

        String encoded = Base64.getEncoder().encodeToString((client_Id + ":" + client_Secret).getBytes());
        conn.setRequestProperty("Authorization", "Basic " + encoded);
        conn.setRequestMethod("GET");
        conn.setDoOutput(true);

        if (conn.getResponseCode() != 200) {
            throw new Exception("Failed to get access token");
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