package iuh.fit.se.tuan02_22690761_nguyenhuynhthebao.bai04.service;

import iuh.fit.se.tuan02_22690761_nguyenhuynhthebao.bai04.User;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {
    public User getUser(){
        return new User(1,"TheBao","thebao@gmail.com");
    }
}
