package net.emteeware.emteestockkeeper


import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class ItemController(val service: ItemService) {

    var logger: Logger = LoggerFactory.getLogger(ItemController::class.java)

    @GetMapping("/item")
    fun index() : List<Item> {
        logger.warn("GET request")
        val retVal = service.findItems()
        logger.warn("Returning $retVal")
        return retVal
    }

    @GetMapping("/item/{id}")
    fun index(@PathVariable id: Int): List<Item> = service.findItemById(id)

    @GetMapping("/item/typeId/{typeId}")
    fun index(@PathVariable typeId: UUID): List<Item> = service.findItemByItemTypeId(typeId)

    @PostMapping("/item")
    fun post(@RequestBody item: Item) {
        service.save(item)
    }
}