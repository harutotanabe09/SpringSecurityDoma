package app.sample.controller.html;

import static app.sample.base.WebConst.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** ログイン画面のコントローラ. */
@Controller
public class LoginController {

  @RequestMapping(LOGIN_FORM_URL)
  String loginForm() {
    return "module/loginForm";
  }
}
