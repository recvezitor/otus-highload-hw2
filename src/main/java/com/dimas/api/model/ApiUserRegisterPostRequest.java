package com.dimas.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiUserRegisterPostRequest  {

    private String firstName;
    private String secondName;
    private LocalDate birthdate;
    private String biography;
    private String city;
    private String password;

    /**
    * Get firstName
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

    public ApiUserRegisterPostRequest firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
    * Get secondName
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

    public ApiUserRegisterPostRequest secondName(String secondName) {
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

    public ApiUserRegisterPostRequest birthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
        return this;
    }

    /**
    * Get biography
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

    public ApiUserRegisterPostRequest biography(String biography) {
        this.biography = biography;
        return this;
    }

    /**
    * Get city
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

    public ApiUserRegisterPostRequest city(String city) {
        this.city = city;
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

    public ApiUserRegisterPostRequest password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiUserRegisterPostRequest {\n");

        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
        sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
        sb.append("    biography: ").append(toIndentedString(biography)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
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
    public static class ApiUserRegisterPostRequestQueryParam  {

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
        @jakarta.ws.rs.QueryParam("password")
        private String password;

        /**
        * Get firstName
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

        public ApiUserRegisterPostRequestQueryParam firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
        * Get secondName
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

        public ApiUserRegisterPostRequestQueryParam secondName(String secondName) {
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

        public ApiUserRegisterPostRequestQueryParam birthdate(LocalDate birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        /**
        * Get biography
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

        public ApiUserRegisterPostRequestQueryParam biography(String biography) {
            this.biography = biography;
            return this;
        }

        /**
        * Get city
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

        public ApiUserRegisterPostRequestQueryParam city(String city) {
            this.city = city;
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

        public ApiUserRegisterPostRequestQueryParam password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ApiUserRegisterPostRequestQueryParam {\n");

            sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
            sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
            sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
            sb.append("    biography: ").append(toIndentedString(biography)).append("\n");
            sb.append("    city: ").append(toIndentedString(city)).append("\n");
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