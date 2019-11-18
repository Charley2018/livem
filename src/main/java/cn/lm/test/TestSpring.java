/**
 * Filename: TestSpring
 * Date: 2019/11/18 22:11
 * Author: Charles Chan
 * Description: 测试Spring区
 * History:
 * Version: 1.0
 */

package cn.lm.test;

import cn.lm.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Charles Chan
 * @create 2019/11/18
 * @since 1.0
 */

public class TestSpring {

  @Test
  public void run1() {
    // 加载配置文件
    ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    // 获取对象
    AccountService as = (AccountService) ac.getBean("accountService");
    // 调用方法
    as.findAll();

  }
}
