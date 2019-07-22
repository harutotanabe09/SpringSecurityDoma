package app.sample.entity;

import org.springframework.security.core.authority.AuthorityUtils;

/** Spring Securityで使用するログイン時に取得するユーザ情報. */
public class LoginUserDetails extends org.springframework.security.core.userdetails.User {

  /** ログイン情報 */
  private UserInfo userInfo;

  public LoginUserDetails(UserInfo userInfo) {
    super(
        userInfo.getId(),
        userInfo.getPassword(),
        AuthorityUtils.createAuthorityList(userInfo.getRoleId()));
    this.userInfo = userInfo;
  }

  public UserInfo getUserInfo() {
    return this.userInfo;
  }
}
