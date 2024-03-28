package com.dimas.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiLoginPost200Response  {

    private String token;

    /**
    * Get token
    * @return token
    **/
    @JsonProperty("token")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToken() {
        return token;
    }

    /**
     * Set token
     **/
    public void setToken(String token) {
        this.token = token;
    }

    public ApiLoginPost200Response token(String token) {
        this.token = token;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiLoginPost200Response {\n");

        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ApiLoginPost200ResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("token")
        private String token;

        /**
        * Get token
        * @return token
        **/
        @JsonProperty("token")
        public String getToken() {
            return token;
        }

        /**
         * Set token
         **/
        public void setToken(String token) {
            this.token = token;
        }

        public ApiLoginPost200ResponseQueryParam token(String token) {
            this.token = token;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ApiLoginPost200ResponseQueryParam {\n");

            sb.append("    token: ").append(toIndentedString(token)).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4 spaces
         * (except the first line).
         */
        private static String toIndentedString(Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }
    }
}