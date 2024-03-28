package com.dimas.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiLoginPostRequest  {

    private String id;
    private String password;

    /**
    * Идентификатор пользователя
    * @return id
    **/
    @JsonProperty("id")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(String id) {
        this.id = id;
    }

    public ApiLoginPostRequest id(String id) {
        this.id = id;
        return this;
    }

    /**
    * Get password
    * @return password
    **/
    @JsonProperty("password")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPassword() {
        return password;
    }

    /**
     * Set password
     **/
    public void setPassword(String password) {
        this.password = password;
    }

    public ApiLoginPostRequest password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiLoginPostRequest {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        
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
    public static class ApiLoginPostRequestQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private String id;
        @jakarta.ws.rs.QueryParam("password")
        private String password;

        /**
        * Идентификатор пользователя
        * @return id
        **/
        @JsonProperty("id")
        public String getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(String id) {
            this.id = id;
        }

        public ApiLoginPostRequestQueryParam id(String id) {
            this.id = id;
            return this;
        }

        /**
        * Get password
        * @return password
        **/
        @JsonProperty("password")
        public String getPassword() {
            return password;
        }

        /**
         * Set password
         **/
        public void setPassword(String password) {
            this.password = password;
        }

        public ApiLoginPostRequestQueryParam password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ApiLoginPostRequestQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    password: ").append(toIndentedString(password)).append("\n");
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