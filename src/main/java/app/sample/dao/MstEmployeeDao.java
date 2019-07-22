package app.sample.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import app.sample.entity.User;

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
