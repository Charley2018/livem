/**
 * Filename: AccountSeviceImpl
 * Date: 2019/11/18 22:23
 * Author: Charles Chan
 * Description:
 * History:
 * Version: 1.0
 */

package cn.lm.service.impl;

import cn.lm.dao.AccountDao;
import cn.lm.domain.Account;
import cn.lm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Charles Chan
 * @create 2019/11/18
 * @since 1.0
 */
@Service("accountService")
public class AccountSeviceImpl implements AccountService {

  @Autowired
  private AccountDao accountDao;

  @Override
  public List<Account> findAll() {
    System.out.println("业务层，查询所有账户");
    return accountDao.findAll();
  }

  @Override
  public void saveAccount(Account account) {
    System.out.println("保存账户");
    accountDao.saveAccount(account);
  }
}
