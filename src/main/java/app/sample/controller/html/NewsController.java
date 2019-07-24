package app.sample.controller.html;

import app.sample.entity.LoginUserDetails;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** お知らせ画面のコントローラ. */
@Controller
@RequestMapping(path = {"/", "news"})
public class NewsController {

  /** @return */
  @RequestMapping(method = RequestMethod.GET)
  public String init(Model model, @AuthenticationPrincipal LoginUserDetails userDetails) {
    model.addAttribute("loginInfo", userDetails.getUserInfo());
    return "news/news";
  }
}
