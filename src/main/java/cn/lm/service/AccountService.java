package cn.lm.service;

import cn.lm.domain.Account;

import java.util.List;

public interface AccountService {
  //查询所有帐户
  List<Account> findAll();
  //保存账户信息
  void saveAccount(Account account);
}
