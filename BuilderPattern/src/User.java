public class User {
    private String userName; //required
    private String email;//required

    private String firstName;//optionsl
    private String lastName;//optional
    private int phoneNumber;//optional
    private String address;//optional



    //we will need a lot of constructors for 4 optional fields,
    // so we need a Builder pattern

    private User(Builder builder) {
        this.userName = builder.userName;
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {
        private String userName; //required
        private String email;//required

        private String firstName;//optionsl
        private String lastName;//optional
        private int phoneNumber;//optional
        private String address;//optional

        public Builder(String userName, String email) {
            this.userName = userName;
            this.email = email;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder phoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
