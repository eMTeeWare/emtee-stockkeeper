package net.emteeware.emteestockkeeper

import org.springframework.stereotype.Service
import java.util.*

@Service
class ItemService(val db: ItemRepository) {
    fun findItems(): List<Item> = db.findAll().toList().map { it.toDto() }.toList()

    fun findItemById(id: Int) : List<Item> = db.findById(id).toList()

    fun findItemByItemTypeId(typeId: UUID) : List<Item> = db.findItemByTypeId(typeId).toList()

    fun save(item: Item) {
        db.save(item)
    }

    fun <T : Any> Optional<out T>.toList(): List<T> =
        if (isPresent) listOf(get()) else emptyList()
}
