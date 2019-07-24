package app.sample.controller.html;

import app.sample.controller.AbstractHtmlController;
import app.sample.entity.LoginUserDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** カテゴリー画面のコントローラ. */
@Controller
@RequestMapping(path = {"/", "news", "code_categories"})
@Slf4j
public class CodeCategoryHtmlController extends AbstractHtmlController {

  /** @return */
  @RequestMapping(method = RequestMethod.GET)
  public String init(Model model, @AuthenticationPrincipal LoginUserDetails userDetails) {
    model.addAttribute("loginInfo", userDetails.getUserInfo());
    return "news/tables";
  }
}
