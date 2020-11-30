package server.controller.RESTApi;

import javassist.NotFoundException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import server.Application;
import server.controller.RESTapi.UserAPIController;
import server.model.UserEntity;
import server.service.interfaces.BetService;
import server.service.interfaces.UserService;


import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserAPIControllerTest {

    @Autowired
    private UserAPIController controller;

    @Mock
    private UserService userService;

    @Mock
    private UserEntity userMock;
    private UserEntity user;

    @Before
    public void setUp() throws NotFoundException {
        user = new UserEntity("user", "12345");
        //UserService userService = Mock(UserService.class);
        Mockito.when(userService.findById(1L)).thenReturn(user);
        //Mockito.when(userService.save(user)).thenReturn(user);
        //Mockito.when(userMock.getId()).thenReturn(1L);
    }

    @Test
    public void getUser() {
        assertEquals(controller.getUser(1L), ResponseEntity.ok(user));
    }

    @Test
    public void registration() {
    }

    @Test
    public void createUser() {

    }
}