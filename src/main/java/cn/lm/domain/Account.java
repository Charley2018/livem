/**
 * Filename: Account
 * Date: 2019/11/18 22:17
 * Author: Charles Chan
 * Description: 账户信息
 * History:
 * Version: 1.0
 */

package cn.lm.domain;

import java.io.Serializable;

/**
 * @author Charles Chan
 * @create 2019/11/18
 * @since 1.0
 */

public class Account implements Serializable {

  private String username;
  private String password;
  private int roomNum;
  private int id;
  private int type;
  private int phoneNum;
  private String sex;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getRoomNum() {
    return roomNum;
  }

  public void setRoomNum(int roomNum) {
    this.roomNum = roomNum;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public int getPhoneNum() {
    return phoneNum;
  }

  public void setPhoneNum(int phoneNum) {
    this.phoneNum = phoneNum;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  @Override
  public String toString() {
    return "UsersDao{" +
        "username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", roomNum=" + roomNum +
        ", id=" + id +
        ", type=" + type +
        ", phoneNum=" + phoneNum +
        ", sex='" + sex + '\'' +
        '}';
  }
}
