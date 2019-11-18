/**
 * Filename: AccountController
 * Date: 2019/11/18 22:25
 * Author: Charles Chan
 * Description: 账户WEB层/控制器
 * History:
 * Version: 1.0
 */

package cn.lm.controler;

import cn.lm.domain.Account;
import cn.lm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

/**
 * @author Charles Chan
 * @create 2019/11/18
 * @since 1.0
 */
@Controller
@RequestMapping("/account")
public class AccountController {

  //自动注入
  @Autowired
  private AccountService accountService;

  @RequestMapping("/findAll")
  public String findAll(Model model) {
    System.out.println("表现层，所有账户信息……");
    //调用service的方法
    List<Account> list = accountService.findAll();
    model.addAttribute("list", list);
    return "list";
  }

  @RequestMapping("/save")
  public String save(Account account) {
    accountService.saveAccount(account);
    //这里可以转发，重定向
    return "list";
/*    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
      accountService.saveAccount(account);
      response.sendRedirect(request.getContextPath()+"/account/findAll");
      return;
    }*/
  }
}
