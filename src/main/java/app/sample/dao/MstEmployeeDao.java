package app.sample.dao;

import app.sample.entity.User;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@ConfigAutowireable
@Dao
public interface MstEmployeeDao {

  /**
   * ユーザ名取得
   *
   * @param CodeCategory
   * @return
   */
  @Select
  User loadUserByUserName(String id);
}
