package src.test.java.com.example.hw_junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import src.main.java.com.example.hw_junit.User;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class UserTest {

    private User user1;
    private User user2;
    private User user3;
    private User user4;
    private User user5;

    @Before
    public void setUp() {
        user1 = new User("natasha91", "nata.sha");
        user2 = new User("pikachu", "pikachu@gmail");
        user3 = new User("eva@mail.ru", "eva@mail.ru");
    }

    @Test
    public void isUserWithParametersCreatedCorrectly() {
        User testUser = new User("pasha", "pasha91@gmail.com");
        assertEquals("pasha", testUser.getLogin());
        assertEquals("pasha91@gmail.com", testUser.getEmail());
    }
    @Test
    public void isUserWithoutParametersCreatedCorrectly() {
        User testUser = new User();
        assertEquals(null, testUser.getLogin());
        assertEquals(null, testUser.getEmail());
    }

    @Test
    public void areEmailAndLoginEqual() {
        assertEquals(user5.getEmail(), user5.getLogin());
    }

    @Test
    public void isEmailCorrect() {
        boolean isCorrect = true;
        if (!user5.getEmail().contains("@") || !user5.getEmail().contains("."))
            assertFalse(isCorrect);
    }
}
