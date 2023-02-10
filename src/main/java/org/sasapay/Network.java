package org.sasapay;
import com.github.tsohr.JSONObject;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Scanner;

public class Network implements Runnable {
    private JSONObject result;

    private String url;
    private String encoded;
    private String bearer;
    private int type;
    private Map<String, Object> body;

    private int requestType;

    public Network(String url, String encoded, int type, int requestType) {

        this.url = url;
        this.encoded = encoded;

        this.type = type;
        this.requestType = requestType;
    }

    public Network(String url, String bearer, Map<String, Object> body, int requestType) {
        this.url = url;
        this.bearer = bearer;
        this.body = body;
        this.requestType = requestType;
    }

    @Override
    public void run() {
        if(requestType == 0){
            result = getRequest(url, encoded, type);
        }else {
            result = postRequest(url, bearer, body);
        }


    }

    public JSONObject getResult() {
        System.out.println("printurl " + result);
        return result;
    }

    public JSONObject postResult() {
        System.out.println("printurl " + url);
        return result;
    }


    public JSONObject getRequest(String url, String encoded, int type) {

        try {


            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("GET");
            if (type == 0) {
                conn.setRequestProperty("Authorization", "Basic " + encoded);
            } else {
                conn.setRequestProperty("Authorization", "Bearer " + encoded);
            }


            // conn.setDoOutput(true);

            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                InputStream errorStream = conn.getErrorStream();
                // Read the error stream into a string
                String errorString = new Scanner(errorStream, "UTF-8").useDelimiter("\\Z").next();
                // Parse the error string as JSON
                JSONObject errorJson = new JSONObject(errorString);
                // Extract the error message from the JSON object
//            String errorMessage = errorJson.getString("error_message");
                return errorJson;
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

        } catch (Exception e) {
            return null;
        }

    }

    public JSONObject postRequest(String url, String bearer, Map<String, Object> body) {

        try {


            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // Set request method
            con.setRequestMethod("POST");

            // Add bearer token to authorization header
            con.setRequestProperty("Authorization", "Bearer " + bearer);

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
            } else {
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

        } catch (Exception e) {
            return null;
        }

    }
}

