package net.emteeware.emteestockkeeper

import org.springframework.web.bind.annotation.*
import java.util.UUID

@RestController
class ItemController(val service: ItemService) {
    @GetMapping("/item")
    fun index(): List<Item> = service.findItems()

    @GetMapping("/item/{id}")
    fun index(@PathVariable id: Int): List<Item> = service.findItemById(id)

    @GetMapping("/item/typeId/{typeId}")
    fun index(@PathVariable typeId: UUID): List<Item> = service.findItemByItemTypeId(typeId)

    @PostMapping("/item")
    fun post(@RequestBody itemType: Item) {
        service.save(itemType)
    }
}