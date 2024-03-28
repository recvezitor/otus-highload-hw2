package com.dimas.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
  * Пост пользователя
 **/
public class ApiPost  {

    /**
      * Пост пользователя
     **/
    private String id;
    /**
      * Пост пользователя
     **/
    private String text;
    /**
      * Пост пользователя
     **/
    private String authorUserId;

    /**
    * Идентификатор поста
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

    public ApiPost id(String id) {
        this.id = id;
        return this;
    }

    /**
    * Текст поста
    * @return text
    **/
    @JsonProperty("text")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getText() {
        return text;
    }

    /**
     * Set text
     **/
    public void setText(String text) {
        this.text = text;
    }

    public ApiPost text(String text) {
        this.text = text;
        return this;
    }

    /**
    * Идентификатор пользователя
    * @return authorUserId
    **/
    @JsonProperty("author_user_id")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAuthorUserId() {
        return authorUserId;
    }

    /**
     * Set authorUserId
     **/
    public void setAuthorUserId(String authorUserId) {
        this.authorUserId = authorUserId;
    }

    public ApiPost authorUserId(String authorUserId) {
        this.authorUserId = authorUserId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiPost {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    authorUserId: ").append(toIndentedString(authorUserId)).append("\n");
        
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
    /**
      * Пост пользователя
     **/
    public static class ApiPostQueryParam  {

        /**
          * Пост пользователя
         **/
        @jakarta.ws.rs.QueryParam("id")
        private String id;
        /**
          * Пост пользователя
         **/
        @jakarta.ws.rs.QueryParam("text")
        private String text;
        /**
          * Пост пользователя
         **/
        @jakarta.ws.rs.QueryParam("authorUserId")
        private String authorUserId;

        /**
        * Идентификатор поста
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

        public ApiPostQueryParam id(String id) {
            this.id = id;
            return this;
        }

        /**
        * Текст поста
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

        public ApiPostQueryParam text(String text) {
            this.text = text;
            return this;
        }

        /**
        * Идентификатор пользователя
        * @return authorUserId
        **/
        @JsonProperty("author_user_id")
        public String getAuthorUserId() {
            return authorUserId;
        }

        /**
         * Set authorUserId
         **/
        public void setAuthorUserId(String authorUserId) {
            this.authorUserId = authorUserId;
        }

        public ApiPostQueryParam authorUserId(String authorUserId) {
            this.authorUserId = authorUserId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ApiPostQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    text: ").append(toIndentedString(text)).append("\n");
            sb.append("    authorUserId: ").append(toIndentedString(authorUserId)).append("\n");
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