package app.sample.entity;

import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.Entity;

@Entity
@Getter
@Setter
public class User extends DomaDtoImpl {

  private static final long serialVersionUID = 2229749282619203936L;

  String employeeId;

  String employeeFirstName;

  String employeeLastName;

  String roleId;

  String password;
}
