package app.sample.conf;

import static app.sample.base.WebConst.*;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/** Spring Security設定. */
@EnableWebSecurity // Spring Securityが提供するConfigurationクラスのインポート
// WebSecurityConfigurerAdapterでデフォルトのBean定義を適用
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  // 認可設定
  String[] permittedUrls = {CSS_URL, JS_URL, FONT_URL, LOGIN_FORM_URL};

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests()
	    .antMatchers("/css/**").permitAll()
	    .antMatchers("/fonts/**").permitAll()
	    .antMatchers("/js/**").permitAll()
	    .antMatchers("/loginForm").permitAll()
        //.antMatchers(permittedUrls).permitAll()
        // 認証していないリクエストは不許可
        .anyRequest()
        .authenticated();
    // フォーム認証
    http.formLogin()
        // 認証パス
        .loginProcessingUrl(LOGIN_URL)
        // ログインフォーム表示用のパス設定
        .loginPage(LOGIN_FORM_URL)
        // 認証失敗時のパス
        .failureUrl(LOGIN_FORM_URL + "?error")
        // 認証成功時のパス
        .defaultSuccessUrl(HOME_URL, true)
        // ユーザ名のリクエストパラメータ
        .usernameParameter("id")
        // パスワードのリクエストパラメータ
        .passwordParameter("password");
    http.logout()
        // ログアウトURL
        .logoutRequestMatcher(new AntPathRequestMatcher(LOGOUT_URL))
        // ログアウト後の遷移先
        .logoutSuccessUrl(LOGIN_FORM_URL);
    http.headers().cacheControl().disable();
  }

  /** パスワードの暗号化方式 */
  @Bean
  PasswordEncoder passwordEncoder() {
    return new PasswordNoEnconder();
  }
}
