package com.itdr.dao;

import com.itdr.pojo.Users;
import com.itdr.pojo.bo.UserRowMapper;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Users> selectAll() {
        String sql="select * from userbirth";
        List<Users> query = jdbcTemplate.query(sql, new UserRowMapper());
        return query;
    }

    public List<Users> selectFast(String three_days_ago, String two_days_ago, String one_days_ago) {
        String sql="select * from userbirth where birthday in(?,?,?)";
        List<Users> query = jdbcTemplate.query(sql, new UserRowMapper(),three_days_ago,two_days_ago,one_days_ago);
        System.out.println(query);
        return query;
    }

    public int deleteOne(int id2) {
        String sql="delete from userbirth where id=?";
        int update = jdbcTemplate.update(sql, id2);
        return update;
    }

    public int addOne(String username, String birthday, String interest, int p, int q) {
        String sql="insert into userbirth values(null,?,null,?,?,?,?,now(),now())";
        int update = jdbcTemplate.update(sql, username, birthday, interest, p, q);
        System.out.println(update);
        return update;
    }


//    public List<Users> selectFast(String three_days_ago) {
//        String sql="select * from userbirth where birthday=?";
//        List<Users> query = jdbcTemplate.query(sql, new UserRowMapper(), three_days_ago);
//        System.out.println(query);
//        return query;
//    }
}
