package com.user.User_Service.Services;

import com.user.User_Service.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicesUserImpl implements IServicesUser{

    List<User>  userlist = List.of(
                          new User(123L,"gujral pande","8878158481"),
                          new User(125L,"gujral pande","8878158481"),
                          new User(126L,"nihal pande","8878158481"),
                          new User(129L,"viraj pande","8878158481")
    );
    @Override
    public User getUser(Long id) {
        return userlist.stream().filter(user-> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
