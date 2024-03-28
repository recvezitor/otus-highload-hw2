package com.dimas.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiLoginPost500Response  {

    private String message;
    private String requestId;
    private Integer code;

    /**
    * Описание ошибки
    * @return message
    **/
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Set message
     **/
    public void setMessage(String message) {
        this.message = message;
    }

    public ApiLoginPost500Response message(String message) {
        this.message = message;
        return this;
    }

    /**
    * Идентификатор запроса. Предназначен для более быстрого поиска проблем.
    * @return requestId
    **/
    @JsonProperty("request_id")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestId() {
        return requestId;
    }

    /**
     * Set requestId
     **/
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ApiLoginPost500Response requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
    * Код ошибки. Предназначен для классификации проблем и более быстрого решения проблем.
    * @return code
    **/
    @JsonProperty("code")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCode() {
        return code;
    }

    /**
     * Set code
     **/
    public void setCode(Integer code) {
        this.code = code;
    }

    public ApiLoginPost500Response code(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiLoginPost500Response {\n");

        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        
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
    public static class ApiLoginPost500ResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("message")
        private String message;
        @jakarta.ws.rs.QueryParam("requestId")
        private String requestId;
        @jakarta.ws.rs.QueryParam("code")
        private Integer code;

        /**
        * Описание ошибки
        * @return message
        **/
        @JsonProperty("message")
        public String getMessage() {
            return message;
        }

        /**
         * Set message
         **/
        public void setMessage(String message) {
            this.message = message;
        }

        public ApiLoginPost500ResponseQueryParam message(String message) {
            this.message = message;
            return this;
        }

        /**
        * Идентификатор запроса. Предназначен для более быстрого поиска проблем.
        * @return requestId
        **/
        @JsonProperty("request_id")
        public String getRequestId() {
            return requestId;
        }

        /**
         * Set requestId
         **/
        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

        public ApiLoginPost500ResponseQueryParam requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
        * Код ошибки. Предназначен для классификации проблем и более быстрого решения проблем.
        * @return code
        **/
        @JsonProperty("code")
        public Integer getCode() {
            return code;
        }

        /**
         * Set code
         **/
        public void setCode(Integer code) {
            this.code = code;
        }

        public ApiLoginPost500ResponseQueryParam code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ApiLoginPost500ResponseQueryParam {\n");

            sb.append("    message: ").append(toIndentedString(message)).append("\n");
            sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
            sb.append("    code: ").append(toIndentedString(code)).append("\n");
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