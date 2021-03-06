package java2.application_target_list.web_ui.controllers.admin_menu.user;

import java2.application_target_list.core.requests.user.GetAllUsersRequest;
import java2.application_target_list.core.responses.user.GetAllUsersResponse;
import java2.application_target_list.core.services.user.GetAllUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowAllUserController {

    @Autowired
    private GetAllUserService getAllUserService;

    @GetMapping(value = "/admin_menu/user/showAllUsers")
    public String showAllUsersAdminPage(ModelMap modelMap) {
        GetAllUsersResponse getAllUsersResponse = getAllUserService.execute(new GetAllUsersRequest());
        modelMap.addAttribute("users", getAllUsersResponse.getUsersList());
        return "admin_menu/user/showAllUsers";
    }
}
