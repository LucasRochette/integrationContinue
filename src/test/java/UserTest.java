import org.junit.Test;

public class UserTest {

        @Test
        public void UserIsValid(){
            User user = new User("Lucas","R","email",35);
            assert(user.isValid());//////////
        }
}
