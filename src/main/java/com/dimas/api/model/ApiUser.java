package com.dimas.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiUser  {

    private String id;
    private String firstName;
    private String secondName;
    private LocalDate birthdate;
    private String biography;
    private String city;

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

    public ApiUser id(String id) {
        this.id = id;
        return this;
    }

    /**
    * Имя
    * @return firstName
    **/
    @JsonProperty("first_name")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set firstName
     **/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public ApiUser firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
    * Фамилия
    * @return secondName
    **/
    @JsonProperty("second_name")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSecondName() {
        return secondName;
    }

    /**
     * Set secondName
     **/
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public ApiUser secondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    /**
    * Дата рождения
    * @return birthdate
    **/
    @JsonProperty("birthdate")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public LocalDate getBirthdate() {
        return birthdate;
    }

    /**
     * Set birthdate
     **/
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public ApiUser birthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
        return this;
    }

    /**
    * Интересы
    * @return biography
    **/
    @JsonProperty("biography")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBiography() {
        return biography;
    }

    /**
     * Set biography
     **/
    public void setBiography(String biography) {
        this.biography = biography;
    }

    public ApiUser biography(String biography) {
        this.biography = biography;
        return this;
    }

    /**
    * Город
    * @return city
    **/
    @JsonProperty("city")
          @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCity() {
        return city;
    }

    /**
     * Set city
     **/
    public void setCity(String city) {
        this.city = city;
    }

    public ApiUser city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiUser {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
        sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
        sb.append("    biography: ").append(toIndentedString(biography)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        
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
    public static class ApiUserQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private String id;
        @jakarta.ws.rs.QueryParam("firstName")
        private String firstName;
        @jakarta.ws.rs.QueryParam("secondName")
        private String secondName;
        @jakarta.ws.rs.QueryParam("birthdate")
        private LocalDate birthdate;
        @jakarta.ws.rs.QueryParam("biography")
        private String biography;
        @jakarta.ws.rs.QueryParam("city")
        private String city;

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

        public ApiUserQueryParam id(String id) {
            this.id = id;
            return this;
        }

        /**
        * Имя
        * @return firstName
        **/
        @JsonProperty("first_name")
        public String getFirstName() {
            return firstName;
        }

        /**
         * Set firstName
         **/
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public ApiUserQueryParam firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
        * Фамилия
        * @return secondName
        **/
        @JsonProperty("second_name")
        public String getSecondName() {
            return secondName;
        }

        /**
         * Set secondName
         **/
        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public ApiUserQueryParam secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        /**
        * Дата рождения
        * @return birthdate
        **/
        @JsonProperty("birthdate")
        public LocalDate getBirthdate() {
            return birthdate;
        }

        /**
         * Set birthdate
         **/
        public void setBirthdate(LocalDate birthdate) {
            this.birthdate = birthdate;
        }

        public ApiUserQueryParam birthdate(LocalDate birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        /**
        * Интересы
        * @return biography
        **/
        @JsonProperty("biography")
        public String getBiography() {
            return biography;
        }

        /**
         * Set biography
         **/
        public void setBiography(String biography) {
            this.biography = biography;
        }

        public ApiUserQueryParam biography(String biography) {
            this.biography = biography;
            return this;
        }

        /**
        * Город
        * @return city
        **/
        @JsonProperty("city")
        public String getCity() {
            return city;
        }

        /**
         * Set city
         **/
        public void setCity(String city) {
            this.city = city;
        }

        public ApiUserQueryParam city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ApiUserQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
            sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
            sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
            sb.append("    biography: ").append(toIndentedString(biography)).append("\n");
            sb.append("    city: ").append(toIndentedString(city)).append("\n");
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