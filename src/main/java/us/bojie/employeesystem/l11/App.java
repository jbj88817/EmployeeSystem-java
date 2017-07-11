package us.bojie.employeesystem.l11;

/**
 * Created by bojiejiang on 7/10/17.
 */
public class App {
    public static void main(String[] args) {
        User websiteUser = new User.Builder("bobMax", "box@gmail.com")
                .firstName("bob")
                .lastName("max")
                .build();

        System.out.println(websiteUser.toString());
    }
}
