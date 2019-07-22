package app.sample.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfo {
  private String id;
  private String employeeFirstName;
  private String employeeLastName;
  private String roleId;
  private String password;
}
