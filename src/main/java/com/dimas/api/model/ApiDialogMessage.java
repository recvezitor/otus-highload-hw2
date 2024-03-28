package com.dimas.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiDialogMessage  {

    private String from;
    private String to;
    private String text;

    /**
    * Идентификатор пользователя
    * @return from
    **/
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Set from
     **/
    public void setFrom(String from) {
        this.from = from;
    }

    public ApiDialogMessage from(String from) {
        this.from = from;
        return this;
    }

    /**
    * Идентификатор пользователя
    * @return to
    **/
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Set to
     **/
    public void setTo(String to) {
        this.to = to;
    }

    public ApiDialogMessage to(String to) {
        this.to = to;
        return this;
    }

    /**
    * Текст сообщения
    * @return text
    **/
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Set text
     **/
    public void setText(String text) {
        this.text = text;
    }

    public ApiDialogMessage text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiDialogMessage {\n");

        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        
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
    public static class ApiDialogMessageQueryParam  {

        @jakarta.ws.rs.QueryParam("from")
        private String from;
        @jakarta.ws.rs.QueryParam("to")
        private String to;
        @jakarta.ws.rs.QueryParam("text")
        private String text;

        /**
        * Идентификатор пользователя
        * @return from
        **/
        @JsonProperty("from")
        public String getFrom() {
            return from;
        }

        /**
         * Set from
         **/
        public void setFrom(String from) {
            this.from = from;
        }

        public ApiDialogMessageQueryParam from(String from) {
            this.from = from;
            return this;
        }

        /**
        * Идентификатор пользователя
        * @return to
        **/
        @JsonProperty("to")
        public String getTo() {
            return to;
        }

        /**
         * Set to
         **/
        public void setTo(String to) {
            this.to = to;
        }

        public ApiDialogMessageQueryParam to(String to) {
            this.to = to;
            return this;
        }

        /**
        * Текст сообщения
        * @return text
        **/
        @JsonProperty("text")
        public String getText() {
            return text;
        }

        /**
         * Set text
         **/
        public void setText(String text) {
            this.text = text;
        }

        public ApiDialogMessageQueryParam text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ApiDialogMessageQueryParam {\n");

            sb.append("    from: ").append(toIndentedString(from)).append("\n");
            sb.append("    to: ").append(toIndentedString(to)).append("\n");
            sb.append("    text: ").append(toIndentedString(text)).append("\n");
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