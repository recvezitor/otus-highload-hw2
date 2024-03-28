package com.dimas.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiUserRegisterPost200Response  {

    private String userId;

    /**
    * Get userId
    * @return userId
    **/
    @JsonProperty("user_id")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUserId() {
        return userId;
    }

    /**
     * Set userId
     **/
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ApiUserRegisterPost200Response userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiUserRegisterPost200Response {\n");

        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        
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
    public static class ApiUserRegisterPost200ResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("userId")
        private String userId;

        /**
        * Get userId
        * @return userId
        **/
        @JsonProperty("user_id")
        public String getUserId() {
            return userId;
        }

        /**
         * Set userId
         **/
        public void setUserId(String userId) {
            this.userId = userId;
        }

        public ApiUserRegisterPost200ResponseQueryParam userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ApiUserRegisterPost200ResponseQueryParam {\n");

            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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