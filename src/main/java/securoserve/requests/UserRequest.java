package securoserve.requests;

import org.springframework.web.client.RestTemplate;
import securoserve.api.interfaces.ConfirmationMessage;
import securoserve.api.interfaces.IUser;

/**
 * Created by guillaimejanssen on 30/04/2017.
 */
public class UserRequest implements IUser {

    private static final String REQUEST_PREFIX = "http://localhost:8080";

    private static final String LOGIN = "/getuser?usertoken={usertoken}";

    RestTemplate restTemplate = new RestTemplate();

    @Override
    public ConfirmationMessage allusers(String token) {
        return null;
    }

    @Override
    public ConfirmationMessage getUser(String userToken) {
        return restTemplate.getForObject(REQUEST_PREFIX + LOGIN, ConfirmationMessage.class, userToken);
    }

    @Override
    public ConfirmationMessage addUser(int userTypeId, int buildingId, String username, String password, String email, String city, String token) {
        return null;
    }

    @Override
    public ConfirmationMessage updateUser(String token, int id, String username, String password, String email, String city) {
        return null;
    }

    @Override
    public ConfirmationMessage deleteUser(String token, int id) {
        return null;
    }
}
