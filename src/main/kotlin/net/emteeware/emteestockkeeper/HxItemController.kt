package net.emteeware.emteestockkeeper


import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HxItemController(val service: ItemService) {


    var logger: Logger = LoggerFactory.getLogger(ItemController::class.java)

    @GetMapping("/hx-item")
    fun hxItems(model: Model) : String {
        logger.warn("HX GET request")
        model.addAttribute("items", service.findItems())
        return "hxItems"
    }
}