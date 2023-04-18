package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.MyDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("umdao")
public class UserDAO implements MyDao<String, UserDTO> {
    @Override
    public void insert(UserDTO userDTO) {
        System.out.println("Inserted Oracle: " + userDTO);
    }

    @Override
    public void delete(String s) {
        System.out.println("Inserted Oracle: " + s);
    }

    @Override
    public UserDTO select(String s) {
        UserDTO user = null;
        user = new UserDTO(s, "pwd01", "id01");
        System.out.println("select Oracle: " + user);
        return user;
    }

    @Override
    public List<UserDTO> select() {
        List<UserDTO> list = new ArrayList<>();
        list.add(new UserDTO("id01", "pwd01", "이말숙"));
        list.add(new UserDTO("id02", "pwd02", "김말숙"));
        list.add(new UserDTO("id03", "pwd03", "홍말숙"));
        return list;
    }

    @Override
    public void update(UserDTO userDTO) {
        System.out.println("Update Oracle: " + userDTO);
    }
}
