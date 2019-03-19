public class App {
    public static void main(String[] args) {
        User websiteUser = new User.Builder("bobMax","bobMax@gmail.com")
                .firstName("Bob")
                .lastName("Dylan").build();
        System.out.println(websiteUser.toString());
    }
}
