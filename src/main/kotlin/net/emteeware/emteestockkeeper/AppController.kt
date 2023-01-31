package net.emteeware.emteestockkeeper

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AppController {
   @GetMapping("/")
    fun index (model : Model) : String {
        model.addAttribute("storageName", "My Cellar")
        return "index"
    }
}