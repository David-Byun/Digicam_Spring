package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.MyDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("udao")
public class UserMySQLDAO implements MyDao<String, UserDTO> {
    @Override
    public void insert(UserDTO userDTO) {
        System.out.println("MySQL Inserted: "+ userDTO);
    }

    @Override
    public void delete(String s) {
        System.out.println("dd");
    }

    @Override
    public UserDTO select(String s) {
        return null;
    }

    @Override
    public List<UserDTO> select() {
        return null;
    }

    @Override
    public void update(UserDTO userDTO) {
        System.out.println("dd");
    }
}
