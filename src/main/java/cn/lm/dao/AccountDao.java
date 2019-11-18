package cn.lm.dao;

import cn.lm.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDao {

  //查询所有帐户
  @Select("select * from account")
  List<Account> findAll();

  //保存账户信息
  @Insert("insert into account (name,id) values (#{name},#{id})")
  void saveAccount(Account account);
}
