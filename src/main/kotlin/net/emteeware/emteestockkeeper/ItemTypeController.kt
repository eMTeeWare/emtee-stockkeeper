package net.emteeware.emteestockkeeper

import org.springframework.web.bind.annotation.*
import java.util.UUID

@RestController
class ItemTypeController(val service: ItemTypeService) {
    @GetMapping("/item-types")
    fun index(): List<ItemType> = service.findItemTypes()

    @GetMapping("/item-types/{id}")
    fun index(@PathVariable id: UUID): List<ItemType> = service.findItemTypeById(id)

    @GetMapping("/item-types/gtin/{gtin}")
    fun index(@PathVariable gtin: String): List<ItemType> = service.findItemTypeByGtin(gtin)

    @PostMapping("/item-types")
    fun post(@RequestBody itemType: ItemType) {
        service.save(itemType)
    }
}