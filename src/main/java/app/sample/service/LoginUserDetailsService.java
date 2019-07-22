package app.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import app.sample.dao.MstEmployeeDao;
import app.sample.entity.LoginUserDetails;
import app.sample.entity.User;
import app.sample.entity.UserInfo;

/** Spring Securityで使用するログイン時に取得するユーザ情報サービスクラス. */
@Service
public class LoginUserDetailsService implements UserDetailsService {

  @Autowired MstEmployeeDao dao;

  @Override
  public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
    User user = dao.loadUserByUserName(id);
    if (user == null) {
        throw new UsernameNotFoundException("ユーザID:" + id + "は存在しません");
    }

    //String password = "password";
    //BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    //String hashedPassword = passwordEncoder.encode(password);
    //System.out.println("ハッシュ値 = " + hashedPassword);

    UserInfo userInfo = new UserInfo();
    userInfo.setId(user.getEmployeeId());
    userInfo.setEmployeeFirstName(user.getEmployeeFirstName());
    userInfo.setEmployeeLastName(user.getEmployeeLastName());
    userInfo.setRoleId(user.getRoleId());
    userInfo.setPassword(user.getPassword());
    return new LoginUserDetails(userInfo);
  }
}
